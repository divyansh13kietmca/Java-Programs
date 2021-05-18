package thursday;

import java.util.Scanner;

public class Sum_of_digits {
	public static void main(String[] args) 
    {
    	System.out.println("Using the Sum of Digits");
    	System.out.println("Enter the number:");
    	Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
        var temp = a;
        var sum = 0;
        while(temp > 0)
        {
            var rem = temp%10;
            sum += rem;
            temp = temp/10;
        }
        System.out.println("\n Sum of digits of "+a+" = "+sum);
        scanner.close();
    }
}
