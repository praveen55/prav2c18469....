
public class Repeatchar10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Programming";
		char ch = 'm';
		int c = 0;
		
		for(int i =0;i<str.length();i++) {
			if(ch == str.charAt(i)) {
				++c;
			}
		}
		System.out.println(c);
	}

}
