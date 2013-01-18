public class Voiture {
	private String type;
	private double poids;
	private double puissance;
	public Voiture(String type, double poids, double puissance){
		this.type = type;
		this.poids = poids;
		this.puissance = puissance;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	public double getPoids(){
		return poids;
	}
	public void setPoids(double poids){
		this.poids=poids;
	}
	public double getPuissance(){
		return puissance;
	}
	public double setPuissance(double puissance){
		double newPuissance = 0;
		this.puissance = puissance;
		return newPuissance;
	}
	public double rapportPoidsPuissance(){
		return poids/puissance;
	}
	
	public String toString(){
		return type;
	}
}
