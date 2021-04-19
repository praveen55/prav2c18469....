import java.util.LinkedList;

public class stream7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<student> list = new LinkedList<>();
		list.add(new student(100, "Sam" , 80f));
		list.add(new student(100, "Tom" , 70f));
		list.add(new student(100, "Raj" , 60f));
		list.add(new student(100, "Max" , 50f));
		list.add(new student(100, "Lee" , 40f));
		
		
		list.stream()
		.forEach(a->System.out.println("ID : " + a.id + " NAME : "+ a.name + " Marks : " + a.marks));

	}
}
class student{
	int id;
	String name;
	float marks;
	public student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}
