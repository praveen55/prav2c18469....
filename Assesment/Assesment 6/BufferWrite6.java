import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferWrite6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter myfile = new FileWriter("pkg.txt");
		BufferedWriter buffer = new BufferedWriter(myfile);
		buffer.write("Welcome to java point");
		buffer.close();
		System.out.println("Success");
	}
}
