package algorithms;

import java.math.BigDecimal;
import java.util.Scanner;

/**
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array.
A decimal representing of the fraction of negative numbers in the array.
A decimal representing of the fraction of zeroes in the array.
Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667

*/
public class PlusMinus {

	public static void main(String[] args) {
		// get num count
		Scanner in = new Scanner(System.in);
		int numCount = in.nextInt();
		
		// get nums
		int posCount = 0;
		int negCount = 0;
		int zeroCount = 0;
		
		for (int i = 0; i < numCount; i++) {
			int num = in.nextInt();
			if(num > 0) {
				posCount++;
			} else if(num < 0) {
				negCount++;
			} else {
				zeroCount++;
			}
		}
		in.close();
		
		System.out.println((float)posCount / numCount);
		System.out.println((float)negCount / numCount);
		System.out.println((float)zeroCount / numCount);
		
	}
}
