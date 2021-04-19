import java.util.Scanner;

public class Factorial6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Value");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b=1;
		for(int i=1;i<=a;i++) {
			b=b*i;
		}
		System.out.println("Factorial of the given value is " +b);
	}

}
