package datastructures;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
		Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int inInt = 0;
        double inDouble = 0.0;
        String inString = null;
        /* Read and save an integer, double, and String to your variables.*/
        inInt = Integer.valueOf(scan.nextLine());
        inDouble = Double.valueOf(scan.nextLine());
        inString = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + inInt);

        /* Print the sum of the double variables on a new line. */
		System.out.println(d + inDouble);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + inString);

        scan.close();
        
	}
}
