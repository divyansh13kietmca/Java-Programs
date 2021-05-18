package thursday;

import java.util.Scanner;

public class Odd_even {
	public static void main(String[] args) {
		var input = new Scanner(System.in);
    	System.out.print("Enter a number to check even or odd:");
		var number = input.nextInt();
		if (number % 2 == 0) {
        System.out.println(number+" is even");
			}
		
		else {
			System.out.println(number+" is odd");
		}
		input.close();
	}	
	}
