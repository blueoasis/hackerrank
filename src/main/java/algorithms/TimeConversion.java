package algorithms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {
	
	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		String inDateString = in.nextLine();
		in.close();
		
		SimpleDateFormat twelveHourDf = new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat twentyFourHourDf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(twentyFourHourDf.format(twelveHourDf.parse(inDateString)));
	}
}
