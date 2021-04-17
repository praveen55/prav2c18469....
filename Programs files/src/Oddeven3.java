import java.util.Scanner;

public class Oddeven3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number to print sum of Even numbers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		for (int i = 1; i <= n; i++) {
		if (i % 2 == 0) {
		c = c + i;
		}
		}
		System.out.println(c);
	
		System.out.println("Enter the number to print sum of odd numbers");
		Scanner sc1 = new Scanner(System.in);
		int n1 = sc1.nextInt();
		int c1 = 0;
		for (int i = 1; i <= n1; i++) {
		if (i % 2 != 0) {
		c1 = c1 + i;
		}
		}
		System.out.println(c1);
	}
}
