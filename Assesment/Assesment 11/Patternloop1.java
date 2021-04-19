public class Patternloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i = 5;i>=1;i--)
		{
			for(j = 5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<(i*2);k++)
			{
				if(k%2 ==1)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
				System.out.println();
	}

}
