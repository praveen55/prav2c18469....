import java.util.Scanner;

public class Returnmax1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Value");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char String [] = str.toCharArray();
		char val = 0;
		for(int i = 0;i<String.length;i++) {
		for(int j=0;j<String.length-1;j++)
		{
			if(String[i] == String[j])
			{
				val = String[j];
			}
		}}
			System.out.println(val);
		}
	}

		