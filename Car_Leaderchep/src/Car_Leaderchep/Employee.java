package Car_Leaderchep;

public class Employee {
	
	public void handleCustemer(Client client,boolean finance,Vehicle vehicle) {
		double Montant_manquant =vehicle.getPrix() -client.getCashand();
		if(finance==true && vehicle.getPrix()>=client.getCashand()&&Montant_manquant<=30000 ) {
			
			runCreditHistory(client,vehicle);
			
		} else if(vehicle.getPrix()<=client.getCashand()) {
			runtransaction(client,vehicle);
		}
		else {
			
			
			System.out.println("le client " + client +" ne peut acheter la voiture  " + vehicle +" il lui manque de l'argent " +Montant_manquant + " �");
		}
			
	}
	
	public void runCreditHistory(Client client,Vehicle vehicle) {
		double Credit =vehicle.getPrix() -client.getCashand();
		System.out.println("G�n�ration de histirique du cr�dit ");
		System.out.println("Le client"+client +" peut procurer " +vehicle);
		System.out.println("Avec un cr�dit de : "+ Credit + " �");
		
	}
	
	public void runtransaction(Client client,Vehicle vehicle) {
		System.out.println("Le client " + client+ " achete la voiture  " + vehicle +" avec le prix"+ vehicle.getPrix()+ " �");
	}

}
