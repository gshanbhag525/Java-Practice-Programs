
public class Student {
	private int id;
	private String name;
	private int age;
	
	Student(){
		id=100;
		name="harish";
		age=25;
	}
	Student(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	void print(){
		System.out.print("Student details are");
		System.out.println("ID "+id+" Name "+name+" Age "+age);
		
	}
}
