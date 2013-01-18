import java.util.ArrayList;
public class Circuit {
	private String nom;
	private double longueur;
	private double prixHa;
	private double tauxMarge;
	private ArrayList<Voiture> lesVoitures;
	
	public Circuit (String nom, double longueur, double prixHa, double tauxMarge,ArrayList<Voiture>lesVoitures){
		this.nom = nom;
		this.longueur = longueur;
		this.prixHa = prixHa;
		this.tauxMarge = tauxMarge;
		this.lesVoitures = lesVoitures;
	}
	public String getNom(){
		return nom;
	}
	public void setnom(String nom){
		this.nom = nom;
	}
	public double getLongueur(){
		return longueur;
	}
	public void setLongueur(double longueur){
		this.longueur = longueur;
	}
	public double getPrixHa(){
		return prixHa;
	}
	public void setPrixHa(double prixHa){
		this.prixHa = prixHa;
	}
	public double getTauxMarge(){
		return tauxMarge;
	}
	public void setTauxmarge(double tauxMarge){
		this.tauxMarge = tauxMarge;
	}
	public ArrayList<Voiture>getLesVoitures(){
		return lesVoitures;
	}
	public void setLesVoitures (ArrayList<Voiture>lesVoitures){
		this.lesVoitures = lesVoitures;
	}
	public double prixVente(){
		
		return prixHa + (prixHa*tauxMarge/100);
	}
	public Voiture voitureLaPlusPuissanteDuCircuit(){

		double rapport =lesVoitures.get(0).rapportPoidsPuissance();
		Voiture voiture = lesVoitures.get(0);
		for (Voiture v : lesVoitures){
			if (rapport > v.rapportPoidsPuissance()){
				voiture = v;
				rapport = v.rapportPoidsPuissance();
			}
		}
		return voiture;
	}
	public String toString(){
		return nom+";"+longueur;
	}
}