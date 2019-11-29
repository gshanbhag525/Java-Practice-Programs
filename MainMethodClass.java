import java.util.Scanner;
public class MainMethodClass {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double l;
		double bre;
		double h;
		l = sc.nextDouble();
		bre = sc.nextDouble();
		h = sc.nextDouble();
		Box b = new Box(l,bre,h);
		
		double vol;
		vol = b.Boxdemo();
		System.out.println("Volume of box is "+vol);
	}

}
