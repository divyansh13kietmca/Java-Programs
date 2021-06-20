package june1st2021;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
	public static void main(String[] args)  throws IOException{
		String dir;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file name to make: ");
		dir = scan.nextLine();
		File f = new File(dir);
		if(f.exists())
		{
			System.out.println("Using getAbsoluteFile Function: "+f.getAbsoluteFile());
			System.out.println("Using isDirectory Function: "+f.isDirectory());
			System.out.println("Using isFile Function: "+f.isFile());
			System.out.println("Using getName Function: "+f.getName());
			System.out.println("Already Exists");
		}
		else
		{
			f.createNewFile();
			System.out.println("Created.. Check Your Self");
		}
	}
}
