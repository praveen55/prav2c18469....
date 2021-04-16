import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Sam");
		list.add("Tom");
		list.add("Jhon");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String  d1 = itr.next();
			System.out.println(d1);
		}
	}
	}


