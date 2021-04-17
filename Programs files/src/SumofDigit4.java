import java.util.Scanner;

public class SumofDigit4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		m=sc.nextInt();
		while(m>0)
		{
			n=m%10;
			sum = sum +n;
			m=m/10;
		}
			System.out.println("Sum of Digits : " +sum);
	}

}
