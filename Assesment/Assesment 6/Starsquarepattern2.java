import java.util.Iterator;
import java.util.Scanner;

public class Starsquarepattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i =0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(i==0||j==0||i==n||j==n) {
					System.out.print("* ");
			}else {
				System.out.print("  ");
			}
			}
			System.out.println( );
		}
	}
}