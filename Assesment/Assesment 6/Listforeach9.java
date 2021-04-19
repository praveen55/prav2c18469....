import java.util.LinkedList;
public class Listforeach9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("Ram");
		list.add("Sam");
		list.add("Tom");
		list.add("Jhon");
		list.add("Jack");
		list.add("Max");
		list.add("Raj");
		
		System.out.println("List->"+list);
		
		for(String s : list) {
			System.out.println("List1 : "+s);
		}
		System.out.println(" ");
		list.forEach(a->System.out.println("List2 : " +a));
	}
}
