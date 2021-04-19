
import java.util.Collections;
import java.util.TreeMap;

public class Treemap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> list1 = new TreeMap<Integer,String>();
		list1.put(101, "Sam");
		list1.put(102, "Tom");
		list1.put(103, "Max");
		list1.put(104, "Tony");
		list1.put(105, "Steve");
		System.out.println("List1 Before Reversing : " + list1);
		System.out.println("List1 After Reversing : " + list1.descendingMap());
		System.out.println(" ");
		
		TreeMap<Integer, String> List2 = new TreeMap<Integer,String>(Collections.reverseOrder());
		List2.put(101, "Sam");
		List2.put(102, "Tom");
		List2.put(103, "Max");
		List2.put(104, "Tony");
		List2.put(105, "Steve");
		System.out.println("List2 Reversing : " + List2);
	
	}
}
