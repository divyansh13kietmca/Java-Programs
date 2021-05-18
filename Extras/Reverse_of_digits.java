package thursday;

import java.util.Scanner;

public class Reverse_of_digits {
	public static void main(String[] args) {
		var input = new Scanner(System.in);
		System.out.println("\n\nNumber reverse");
    	System.out.print("Enter a three digit number:");
		var number = input.nextInt();
        var temp1 = number;
        var sum1 = 0;var i = 2;
        while(temp1 > 0)
        {
            var rem = temp1%10;
            sum1 += rem*Math.pow(10, i);
            temp1 = temp1/10;
            i -= 1;
        }
        System.out.println("\n"+sum1+" after reversing the "+number);
        input.close();
	}

}
