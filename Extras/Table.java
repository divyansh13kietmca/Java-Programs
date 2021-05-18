package thursday;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) 
	{
	System.out.println("Starting Program ---\n");
	//    int a = Integer.parseInt(args[0]);
	//     System.out.println("Table of "+a+"\n");
	//     for(var i =0; i<=10; i++) 
	//     	{
	//         System.out.println(a+" X "+i+" = "+(a*i));
	//     	}
	System.out.println("Enter the number = ");
	    var scanner = new Scanner(System.in);
	    int a = scanner.nextInt();
	  System.out.println("Table of "+a+"\n");
	  for(var i =0; i<=10; i++) 
	  	{
	      System.out.println(a+" X "+i+" = "+(a*i));
	  	}
	    scanner.close();
	}
	
}
