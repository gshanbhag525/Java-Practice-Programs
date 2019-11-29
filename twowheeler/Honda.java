package twowheeler;
import automobile.Vehicle;
import java.util.Scanner;
public class Honda extends Vehicle{
	
	Scanner sc = new Scanner(System.in);
	public int getSpeed() {
		return 60;
	}
	public void cdplayer() {
		System.out.println("Change the CD ");
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
