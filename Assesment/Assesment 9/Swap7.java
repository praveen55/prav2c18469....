import java.util.Scanner;

public class Swap7 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine(); 
    
    	//String str;
        int len = str.length(); 
        int n; //array's length
        if(len%2 == 0)
        {
            n = len;
        }
        else
        {
            n=len-1;
        }
        char []arr = new char[n];
        for(int i = 0; i< n; i++)
        {
            arr[i] = str.charAt(i); 
        }
        StringBuffer str1 = new StringBuffer(n); 
        for(int i = 0; i<=n-2; i= i+2)
        {
            char temp = arr[i]; 
            arr[i] = arr[i+1];
            arr[i+1] = temp; 
            str1 = str1.append(arr[i]).append(arr[i+1]);
        }

        if(len%2 != 0)
        {
             str1 .append(str.charAt(len-1));
        }
        str = str1.toString();
        System.out.println(str);
    }
	}


