import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class Linkedhashmap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> list = new LinkedHashMap<Integer, String>();
		list.put(1, "Sam");
		list.put(2, "Tony");
		list.put(3, "Banner");
		list.put(4, "Steve");
		list.put(5, "Parker");
		list.put(6, "Bucky");
		
		System.out.println(list);
		System.out.println("BEFORE REVERSING...........");
		Set<Integer> s = list.keySet();
		Iterator<Integer> t = s.iterator();
		while(t.hasNext()) {
			
			Integer k= t.next();
			System.out.println(k+"="+list.get(k));
		}
		System.out.println("After Reversing..........");
		List<Integer> a = new ArrayList<Integer>(list.keySet());
		
		Collections.reverse(a);
        for(Integer s1 : a){
            System.out.println(s1 +"="+list.get(s1));
        }
	}
}