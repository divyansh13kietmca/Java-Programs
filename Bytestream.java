package june1st2021;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytestream {
	public static void main(String[] args) throws IOException {
		int words;
		FileOutputStream fout = new FileOutputStream("D:\\COLLEGE\\SEM 2\\JAVA\\new.txt"); //write
		FileInputStream fin = new FileInputStream("D:\\COLLEGE\\SEM 2\\JAVA\\Java 28may q1.txt"); //read
		fout.write(68);
		while((words = fin.read()) != -1)
		{
			System.out.print((char)words);
		}
		fout.close();
		fin.close();
	}
}
