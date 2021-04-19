import java.util.Scanner;

public class Umberlla4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Word ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("Enter the Character to Check");
		Scanner sc1 = new Scanner(System.in);
		String s = sc1.next();
		
		if(str.contains(s)) {
			System.out.println("It is Present");
		}else {
			System.out.println("Not Present");
		}
	}
}