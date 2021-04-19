import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Zip3
{
	public static void main(String[] args) {
		String filepath = "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\Desktop\\\\\\\\programs\\\\\\\\UNIT-2.zip";
		FileInputStream fis = null;
		ZipInputStream Zis = null;
		ZipEntry zEntry = null;
		try 
		{
			fis = new FileInputStream(filepath);
			Zis = new ZipInputStream(new BufferedInputStream(fis));

			while((zEntry = Zis.getNextEntry()) != null)
			{
				System.out.println(zEntry.getName());
			}
			Zis.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Files in the Zipfiles are........");
	}
}

