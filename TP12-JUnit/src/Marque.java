import java.util.ArrayList;

public class Marque{
	private String nom;
	private ArrayList<Circuit> lesCircuits;

	
	public Marque(String leNom){
		nom = leNom;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setNom(String unNom){
		nom = unNom;
	}
	
	public ArrayList<Circuit> getLesCircuits(){
		return lesCircuits;
	}
	
	public void setLesCircuits (ArrayList<Circuit> lesCircuits){
			this.lesCircuits = lesCircuits;
	}
	
	public ArrayList<Circuit> circuitsAyantUneLongueurMinimale (double laLongueur){
		ArrayList <Circuit> lesCircuitsLong = new ArrayList<Circuit>();
		int i=0;
		System.out.println(lesCircuits);
		while(i<lesCircuits.size()){
			if(lesCircuits.get(i).getLongueur()>laLongueur){
				lesCircuitsLong.add(lesCircuits.get(i));
			}
			i++;
		}
		return lesCircuitsLong;
	}
	
	public ArrayList<Circuit> circuitsAyantUnTypeDeVoiture (String leType){
		ArrayList <Circuit> lesVoituresMemeType = new ArrayList<Circuit>();
		int i=0;
		
		while(i<lesCircuits.size()){
			ArrayList <Voiture> lesVoitures = lesCircuits.get(i).getLesVoitures();
			boolean trouve = false;
			int j=0;
			while(j<lesVoitures.size()){
				if(lesVoitures.get(j).getType()==leType){
					trouve=true;
				}
			j++;	
			}
			if(trouve){
				lesVoituresMemeType.add(lesCircuits.get(i));
			}
			i++;
		}
		return lesVoituresMemeType;
	}
	
	public Circuit circuitAyantLaVoitureLaPlusPuissante(){
		int i=0;
		Circuit circuit1 = lesCircuits.get(0);
		while(i<lesCircuits.size()){
			if(circuit1.voitureLaPlusPuissanteDuCircuit().rapportPoidsPuissance()>lesCircuits.get(i).voitureLaPlusPuissanteDuCircuit().rapportPoidsPuissance()){
				circuit1 = lesCircuits.get(i);
			}
			i++;
		}
		return circuit1;
	}
	
	public float caMarque(){
		double cumulVenteD = 0;
		int compt = 0;
		while(compt < lesCircuits.size()){
			cumulVenteD = cumulVenteD + lesCircuits.get(compt).prixVente();
			compt++;
		}
		Float cumulVenteF=new Float(cumulVenteD);
		return cumulVenteF;
	}
	
}