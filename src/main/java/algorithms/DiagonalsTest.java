package algorithms;

import java.io.*;
import java.util.*;

/*

Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.

Input Format
The first line contains a single integer. The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

Output Format
Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input
3
11 2 4
4 5 6
10 8 -12

Sample Output
15
 */
public class DiagonalsTest {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {

			// read line count
			int lineCount = in.nextInt();
//			int lineCount = 3;
			int[][] matrix = new int[lineCount][lineCount];
			
			// iterate through rows
			ArrayList<Integer>diagOne = new ArrayList<>(lineCount);
			ArrayList<Integer>diagTwo = new ArrayList<>(lineCount);
			
			int diagIdx2 = lineCount - 1;
			
			for (int i = 0; i < lineCount; i++, diagIdx2--) {
				//iterate through cols
				for (int j = 0, h = lineCount - 1; j < lineCount; j++, h--) {
					matrix[i][j] = in.nextInt();//
					if(i == j) {
						diagOne.add(matrix[i][j]);
					}
					if(diagIdx2 == j) {
						diagTwo.add(matrix[i][j]);
					}
				}
			}
			
			
//			for (int i = 0; i < lineCount; i++) {
//				for (int j = 0, h = lineCount - 1; j < lineCount; j++, h--) {
//					if(diagIdx1 == j) {
//						System.out.format("diagIdx1: %d, Math.abs(%d-%d): %d, adding %d\n", diagIdx1, j, i, Math.abs(j-i), matrix[i][j]);
//						diagOne[diagIdx1] = matrix[i][j];
//					}
//					if(diagIdx2 == j) {
//						System.out.format("j: %d, h: %d, adding %d\n", j, h, matrix[i][j]);
//						diagTwo[i] = matrix[i][j];
//					}
//				}
//				diagIdx1++;
//				diagIdx2--;
////				System.out.println();
//			}
//			for (int i = matrix.length - 1; i >= 0; i--) {
//				for (int j = matrix.length - 1; j >= 0; j--) {
////					System.out.print(matrix[i][j] + " ");
//					if(i == j) {
//						diagTwo[j] = matrix[i][j];
//					} 
//				}
////				System.out.println();
//			}
			
//			for (int i = 0; i < diagOne.length; i++) {
//				System.out.println("one : " + diagOne[i] + " ");
//			}
//			for (int i = 0; i < diagTwo.length; i++) {
//				System.out.println("two: " + diagTwo[i] + " ");
//			}
			
			int diagOneVal = diagOne.stream().reduce(0,(acc,elem) -> acc.intValue() + elem.intValue());
			int diagTwoVal = diagTwo.stream().reduce(0,(acc,elem) -> acc.intValue() + elem.intValue());
			int abs = Math.abs(diagTwoVal - diagOneVal);
			System.out.println(abs);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
