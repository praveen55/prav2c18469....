import java.io.File;

public class Fileread10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\Sampleprogram1\\\\pkg.txt");

        if (f.canRead())
            System.out.println("Can be Read");
        else
            System.out.println("Cannot be Read");

	}

}
