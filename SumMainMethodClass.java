
public class SumMainMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumMethodOverloading sm = new SumMethodOverloading();

		int m1 = sm.sum(2,3);
		int m2 = sm.sum(2,3,4);
		double m3 = sm.sum(2.0, 3.0);
		
		System.out.println("First Method oveoaded sum"+m1);
		System.out.println("Second method overloaded "+m2);
		System.out.println("Third method overloaded "+m3);
		
	}

}
