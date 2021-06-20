package june1st2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	public static void main(String[] args) throws IOException 
	{
		String str,file_src, file_dst;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the file name to copy");
		file_src = scan.nextLine();
		System.out.println("Enter the dest file name where it will be copied");
		file_dst = scan.nextLine();
		
		FileWriter wr = new FileWriter(file_dst);
		BufferedReader br = new BufferedReader(new FileReader(file_src));
		while((str = br.readLine())!= null) 
		{
		;
//			System.out.println(str);
			wr.write(str+"\n");
		}
		
		System.out.println("Data Copied");
		br.close();
		wr.close();
		scan.close();
		}

	}
