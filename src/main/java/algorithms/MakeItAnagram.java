package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MakeItAnagram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String lineOne = in.nextLine();
		String lineTwo = in.nextLine();
		in.close();
		
		char[] lineOneChars = lineOne.toCharArray();
		char[] lineTwoChars = lineTwo.toCharArray();
		HashMap<Character, Integer> lineOneCharCounts = new HashMap<>();
		HashMap<Character, Integer> lineTwoCharCounts = new HashMap<>();
		
		for (char c : lineOneChars) {
			if(lineOneCharCounts.containsKey(c)) {
				lineOneCharCounts.put(c, lineOneCharCounts.get(c) + 1);
			} else {
				lineOneCharCounts.put(c, 1);
			}
		}
		for (char c : lineTwoChars) {
			if(lineTwoCharCounts.containsKey(c)) {
				lineTwoCharCounts.put(c, lineTwoCharCounts.get(c) + 1);
			} else {
				lineTwoCharCounts.put(c, 1);
			}
		}
		
		int deletes = 0;
		Set<Character> lineOneMissing = new HashSet<>();
		Set<Character> lineTwoMissing = new HashSet<>();
		
		for (char c : lineOneCharCounts.keySet()) {
			if(!lineTwoCharCounts.containsKey(c)) {
				lineOneMissing.add(c);
				deletes++;
			}
		}
		
		for (Character c : lineOneMissing) {
//			System.out.println("removing " + c  + " from listOne");
			lineOneCharCounts.remove(c);
		}
		
		for (char c : lineTwoCharCounts.keySet()) {
			if(!lineOneCharCounts.containsKey(c)) {
				lineTwoMissing.add(c);
				deletes++;
			}
		}
		
		for (Character c : lineTwoMissing) {
//			System.out.println("removing " + c  + " from listOne");
			lineTwoCharCounts.remove(c);
		}
		
		lineOneCharCounts.putAll(lineTwoCharCounts);
		
		for (Character c : lineOneCharCounts.keySet()) {
			int count = lineOneCharCounts.get(c);
			int mod = count %2;
//			System.out.format("%c : %d, mod: %d\n", c, count, mod);
		}
		
		System.out.println(deletes);
		
	}
	
}
