import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedhahmap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
        for(int i =0;i<n;i++) {
        	char c = str.charAt(i);
        	m.put(c, m.getOrDefault(c, 0)+1);	
        }
        m.forEach((k,v)->System.out.println(k+" Number of Repeated Times = "+v));
	}
}
