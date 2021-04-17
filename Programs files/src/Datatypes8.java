import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Datatypes8 extends demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Datatypes8> list = new ArrayList<>();
		Datatypes8 s =new  Datatypes8();
		list.add(s);
		int p = s.id(10);
		short str =(short)p;
		System.out.println(p);
		char k = s.Character('a');
		System.out.println(k);
		int g = s.idchar(2,5);
		System.out.println(g);	
		
		for(Datatypes8 dt : list) {
			System.out.println(dt.id(p)+" "+dt.Character(k)+" "+dt.idchar(g, g));
			
		}
	}
}
class demo{
	int id(int a){
		return a;
	}
	char Character(char b) {
		return b;
	}
	public static int idchar(int a1, float b1 ){
		return (int) (a1+b1);
	}
	}
