import java.io.FileWriter;
import java.io.IOException;

public class Filewritter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter myFile;
		try {
			myFile = new FileWriter("pkg.txt");
			myFile.write("HI how are you");
			myFile.close();
			System.out.println("File has Written Sucessfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		System.out.println("Error Occured");
		}
	}
}
