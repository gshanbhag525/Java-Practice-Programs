import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class StringB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Capactiy of str buffer object is "+str.capacity());
		System.out.println("Enter a string");
		str.append(sc.nextLine());
		str.reverse();
		System.out.println("Afetr appending capacity "+str.capacity());
		System.out.println("Reverserd string n in upper case "+str.toString().toUpperCase());
		System.out.println("Enter a new string ");
		StringBuffer str2 = new StringBuffer(sc.nextLine());
		
		
		System.out.println("String after appedning "+str2.capacity());
	}

}
