import java.util.Scanner;
public class StudentMainMethodClass {

	public static void main(String args[]) {
		int id;
		String name;
		int age;
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		s.print();
		id = sc.nextInt();
		name = "Gunesh";
		age = sc.nextInt();
		Student s2 = new Student(id, name, age);
		s2.print();
	}
}
