package Car_Leaderchep;

public class Vehicle {
	
	private String Marque;
	private String model;
	private double Prix;
	// Constructeur 
	public Vehicle(String marque, String model, double prix) {
		super();
		this.Marque = marque;
		this.model = model;
		this.Prix = prix;
	}
	
	//geteur et seteur pour les différents chams
	public String getMake() {
		return Marque;
	}
	public void setMake(String marque) {
		this.Marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrix() {
		return Prix;
	}
	public void setPrix(double prix) {
		this.Prix = prix;
	}
	@Override
	
	// pour avoir  les différent champ de la classe
	public String toString() {
		return "Vehicle [Marque=" + Marque + ", model=" + model + ", Prix=" + Prix + "]";
	}
	
	
	

}
