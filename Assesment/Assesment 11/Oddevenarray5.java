import java.util.Scanner;

public class Oddevenarray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value to store in Array...");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the Numbers");
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Odd Numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
				}
			}
		System.out.println("Even Numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				}
			}
		}
	}
