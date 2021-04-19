import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Hahtable6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "Sam");
		ht.put(2, "Tom");
		ht.put(3, "Jhon");
		ht.put(4, "Ram");
		ht.put(5, "Jack");
		
		System.out.println(ht);
		
		for(Map.Entry<Integer, String> m:ht.entrySet()) {
			System.out.println(m.getValue()+" = "+m.getKey());
		}
	}

}
