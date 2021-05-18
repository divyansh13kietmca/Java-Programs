package uploads;

import java.util.Scanner;

public class LabAssignment2 {
	  public static void main(String[] args) {
		  	var number = 0; var choice = 0;
		    var switch_input = new Scanner(System.in);
		    while(choice != 5) 
		  {
		    System.out.println("\n\n1.Enter \"table\" to print table");
		    System.out.println("2.\"digitsum\" to display sum of digits");
		    System.out.println("3.\"reverse\" to find reverse of a number");
		    System.out.print("4.\"armstrong\" to check the armstrong of the number\n\t:");
		    var choice1 = switch_input.nextInt();
			switch(choice1) 
		    {
		        case 1://table
					    System.out.print("\n\nEnter the number: ");
					    number = switch_input.nextInt();
		                for(int i = 1; i < 11; i++)
		                {
		                    System.out.println(number+" X "+i+" = "+(number*i));
		                }    
		                break;
		                
		        case 2://sum of digits
			        	System.out.println("\n\n\tUsing the Sum of Digits");
			        	System.out.print("\tEnter the number:");
			    		number = switch_input.nextInt();
			            var temp = number;
			            var sum = 0;
			            while(temp > 0)
			            {
			                var rem = temp%10;
			                sum += rem;
			                temp = temp/10;
			            }
			            System.out.println("\n\tSum of digits of "+number+" = "+sum);
		                break;
		        
		        case 3://number reverse
			        	System.out.println("\n\n\tNumber reverse");
			        	System.out.print("\tEnter a three digit number:");
			    		number = switch_input.nextInt();
			            var temp1 = number;
			            var sum1 = 0;var i = 2;
			            while(temp1 > 0)
			            {
			                var rem = temp1%10;
			                sum1 += rem*Math.pow(10, i);
			                temp1 = temp1/10;
			                i -= 1;
			            }
			            System.out.println("\n\t"+number+" after reversing becomes "+sum1);
			        	break;
		        

		        case 4: //armstrong number
			        	System.out.println("\n\n\tCheck the armstrong Number");
			        	System.out.print("\tEnter a 3 digit number:");
			    		number = switch_input.nextInt();
			            var temp2 = number;
			            var sum2 = 0;
			            while(temp2 > 0)
			            {
			                var rem = temp2%10;
			                sum2 += Math.pow(rem, 3);
			                temp2 = temp2/10;
			            }
			            if(sum2 == number) {
			            	System.out.println("\n\t"+number+" is a armstrong number");
				            	
			            }
			            else {
							System.out.println("\n\t"+number+" is not a armstrong number");
						}
			            break;

		        default:
		                switch_input.close();
		        		System.out.println("\tWrong Input String. \n\t Exiting Program");
		        		choice = 5;
		                break;
		    }
		
		  }
	  }
}
