import java.util.Scanner;

public class Palindrome10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		a = sc.nextLine();
		int n = a.length();
		
		for(int i = n-1;i>=0;i--) {
			b=b+a.charAt(i);}
		if(a.equals(b)) {
			System.out.println("It is Palindrome..");
		}
		else {
			System.out.println("It is not a Palindrome..");
		}
	}
	}

