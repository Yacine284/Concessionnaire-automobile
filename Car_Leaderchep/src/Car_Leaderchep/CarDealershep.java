package Car_Leaderchep;

public class CarDealershep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instantiation 
		Client client = new Client ("Personne", "Adresse", 160000);
		Client client1=new Client ("Personne2", "Adresse2", 130000);
		
		//instantiation
		Vehicle vehicle=new Vehicle("Mercedes", "E220", 150000);
		Vehicle car=new Vehicle("BMW", "M7", 170000);
		
		
		Employee empl= new Employee();
		
		
		client.purchasecar(vehicle, empl, true);
		client1.purchasecar(car, empl, true);
		
		

	}

}
