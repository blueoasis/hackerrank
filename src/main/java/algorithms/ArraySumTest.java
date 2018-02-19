package algorithms;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraySumTest {

	public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        System.out.println(count);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            nums.add(in.nextInt());
        }
        
        in.close();
        long value = (long)nums.stream().reduce(0,(acc,element) -> acc + element);
        System.out.println(value);
        
    }
	
}
