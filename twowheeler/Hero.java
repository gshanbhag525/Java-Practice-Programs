package twowheeler;
import automobile.Vehicle;
import java.util.Scanner;

public class Hero extends Vehicle {
	
	Scanner sc = new Scanner(System.in);
	public int getSpeed() {
		return 50;
	}
	public void radio() {
		System.out.println("Change the radio channel ");
	}
	public String getModelName() {
		
		String modelName = sc.nextLine();
		return modelName;
	}
	public String getRegistrationNumber() {
		
		String registrationNumber = sc.nextLine();
		return registrationNumber;
	}
	public String getOwnerName() {
		
		String ownerName = sc.nextLine();
		return ownerName;
	}
}
