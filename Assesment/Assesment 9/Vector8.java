import java.util.Collections;
import java.util.Vector;

public class Vector8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();
		vec.add("Tony");
		vec.add("Tom");
		vec.add("Logan");
		vec.add("Sam");
		vec.add("Bucky");
		vec.add("Steve");
		
		System.out.println("List : "+vec);
		System.out.println("");
		
		Collections.reverse(vec);
		System.out.println("Backward Direction : "+vec);
		
		//vec.forEach(a->System.out.println("Backward Direction : "+a));
	

	}

}
