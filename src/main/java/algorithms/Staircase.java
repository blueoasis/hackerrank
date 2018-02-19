package algorithms;
import java.util.Scanner;

public class Staircase {

	static void StairCase(int n) {
		/*
        int step = n - 1;
        while(step >= 0) {
            StringBuilder sb = new StringBuilder();
            int prefixLength = step;
            for (int i = 0; i < prefixLength; i++) {
            	sb.append(' ');
			}
            for (int i = prefixLength; i < n; i++) {
				sb.append('#');
			}
            
        	System.out.format("%s\n", sb.toString());
            step--;
            
        }*/
		
		// given the number 6,
		// iterate from 0 to 6
		for(int j=0;j<n;j++){
			
			// go from position 1 to 6 for each row
            for(int i=1;i<=n;i++){
            	
            	// first row:
            	
            	// first compare: is 1 < 6 - 0 ? yes, print a " "
            	// second compare: is 2 < 6 - 0 ? yes, print a " "
            	// second compare: is 3 < 6 - 0 ? yes, print a " "
            	// second compare: is 4 < 6 - 0 ? yes, print a " "
            	// second compare: is 5 < 6 - 0 ? yes, print a " "
            	// second compare: is 6 < 6 - 0 ? no, print a "#"
            	
            	// second row: 
            	
            	// first compare: is 1 < 6 - 1 ? yes, print a " "
            	// second compare: is 2 < 6 - 1 ? yes, print a " "
            	// second compare: is 3 < 6 - 1 ? yes, print a " "
            	// second compare: is 4 < 6 - 1 ? yes, print a " "
            	// second compare: is 5 < 6 - 1 ? no, print a "#"
            	// second compare: is 6 < 6 - 1 ? no, print a "#"
            	
            	// repeat until j < 6
            	
                System.out.print(i<n-j?" ":"#");
            }
            System.out.println("");
        }
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//
        int _n;
//        _n = Integer.parseInt(in.nextLine().trim());
        _n = 6;
        StairCase(_n);
	}
	
}
