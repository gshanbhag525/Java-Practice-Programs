import java.util.Scanner;
public class MainMethodClassForEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter today's day");
		name = sc.nextLine();
		DayOfWeek d = new DayOfWeek();
		System.out.println(d.Workday(name));
	}

}
