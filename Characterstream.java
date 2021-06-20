package june1st2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Characterstream {
	public static void main(String[] args) throws IOException {
		String str;
		//write
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file name with location: ");
		String s = scan.nextLine();
		System.out.println("Enter a string to write: ");
		String words = scan.nextLine();
		scan.close();
		
		FileWriter wr = new FileWriter(s);
		wr.write(words);
		wr.close();
		System.out.println("Data Saved");
		
		
		//read
		FileReader fr = new FileReader(s);
		BufferedReader br = new BufferedReader(fr);
	
		while((str = br.readLine())!=null) 
		{
			
			System.out.println(str);
		}
			fr.close();
			br.close();
		}
	
	}
