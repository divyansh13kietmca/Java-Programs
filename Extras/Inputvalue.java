package thursday;

import java.util.Scanner;

//Sum of digits and Table of numbers and armstrong
public class Inputvalue {
	public static void main(String[] args) {
		System.out.println("Starting Program ---\n");
	       int a = Integer.parseInt(args[0]);
	       System.out.println("Enter Table or Sum\n");
	       var scan = new Scanner(System.in);
		   var x = scan.next();    
	       switch(x) {
	       case "Table":
	        {
	            
	            System.out.println("Table of "+a+"\n");
	            for(var i =0; i<=10; i++) 
	            {
	                System.out.println(a+" X "+i+" = "+(a*i));
	            }
	            break;
	        }
	        case "Sum":
		    {
	        	System.out.println("Using the Sum of Digits");
	            var temp = a;
	            var sum = 0;
	            while(temp > 0)
	            {
	                var rem = temp%10;
	                sum += rem;
	                temp = temp/10;
	            }
	            System.out.println("\n Sum of digits of "+a+" = "+sum);
	            break;
	        }
		    default:
		    {
		    	System.out.println("Wrong Input: ");
		    	scan.close();
		    	break;
		    }
	       }
	}
}

