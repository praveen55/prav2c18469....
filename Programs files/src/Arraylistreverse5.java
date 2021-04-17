import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylistreverse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Lion");
		list.add("Tiger");
		list.add("Elephant");
		list.add("Panther");
		
		System.out.println("Before Reversing");
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println("After Reversing");
		System.out.println(list);
		//list.forEach(a -> System.out.println(a));
	}
}
