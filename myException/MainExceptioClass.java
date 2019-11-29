package myException;

public class MainExceptioClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String name = args[0];
			int age = Integer.parseInt(args[1]);
			if (age<18 || age > 59)
				throw new MyException();
			System.out.println("Name "+name);
			System.out.println("Age "+age);
			
		}catch(MyException ex) {
			System.out.println("Exception "+ex);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Exceprtion "+a);
			
		}catch(NumberFormatException n) {
			System.out.println("Excdeption "+n);
		}
	}

}
