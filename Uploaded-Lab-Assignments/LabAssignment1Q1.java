package uploads;

import java.util.Scanner;

public class LabAssignment1Q1 {
     public static void main(String[] args){
         //largest of 3 numbers using input
    	 System.out.print("\n\n\tEnter the Numbers: ");
         var scanner = new Scanner(System.in);
         var a = scanner.nextInt();
         var b = scanner.nextInt();
         var c = scanner.nextInt();
         scanner.close();
         System.out.print("\tThe largest is: ");
         System.out.println((a>b)?((a>c)?a:c):((b>c)?b:c));
     }
}
