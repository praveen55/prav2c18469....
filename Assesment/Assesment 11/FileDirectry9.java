import java.io.File;

public class FileDirectry9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\User\\eclipse-workspace\\Sampleprogram1\\");
        if (f.isDirectory())
            System.out.println("Directory");
        else
            System.out.println("is not Directory");
    }
}
