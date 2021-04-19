import java.io.File;

public class Fileread10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		File read = new File("C:\\Users\\User\\Desktop\\programs\\pkg.txt");
		Scanner s =new Scanner(read);
		while(s.hasNextLine())
		{
			String data = s.nextLine();
			System.out.println(data);
		}
		s.close();
		}
		catch(IOException e)
		{
			System.out.println("Error ");
		}
	}
}
