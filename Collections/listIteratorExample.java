import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		//add elements to arraylist object
		aList.add("1");
		aList.add("2");
		aList.add("3");
		ListIterator listiterator = aList.listIterator();
		System.out.println("Previous Index is :"+listiterator.previousIndex());

		System.out.println("Next Index is :"+listiterator.nextIndex());
		
		listiterator.next();
		
		System.out.println("After increasing current position by one element: ");
	
		System.out.println("Previous Index is :"+listiterator.previousIndex());

		System.out.println("Next Index is :"+listiterator.nextIndex());

	}
}
