import java.util.Vector;

public class Firstlast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> list = new Vector<String>();
		list.add("Tony");
		list.add("Tom");
		list.add("Logan");
		list.add("Sam");
		list.add("Bucky");
		list.add("Steve");
		
		System.out.println(list);
		System.out.println(" ");
	
		System.out.println("First Element in the List : "+list.firstElement());
		System.out.println("Last  Element in the List : "+list.lastElement());
	}
}
