package algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class GameOfThrones {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		scan.close();
		char[] chars = line.toCharArray();

		HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
		for (Character c : chars) {
			System.out.println(c);
			
			if(charCounts.containsKey(c)) {
				int existingCount = charCounts.get(c);
				charCounts.put(c, ++existingCount);
			} else {
				charCounts.put(c, 1);
			}
		}
		
		// fbeaebf
		int oddModCount = 0;
		for (Character c : charCounts.keySet()) {
			Integer count = charCounts.get(c);
			int mod = count % 2;
			if(mod == 1) {
				oddModCount++;
			}
//			System.out.format("%c : %d, mod: %d\n", c, count, mod);
		}

		if(oddModCount > 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		
//		System.out.println(line);

	}
}
