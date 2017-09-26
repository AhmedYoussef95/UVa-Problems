package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeapYear { //http://uva.onlinejudge.org/external/100/p10070.pdf
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		boolean first = true;
		while((s = br.readLine())!=null){
			if(!first)
				System.out.println();
			else
				first = false;
			boolean ord = true; boolean leap = false;
			 int year = Integer.parseInt(s);
			
			if((year%4 == 0 && year%100 != 0) || year%400 == 0){
				System.out.println("This is leap year.");
				ord = false; leap = true;}
			if(year%15 == 0){
				System.out.println("This is huluculu festival year.");
				ord = false;}
			if(year%55 == 0 && leap)
				System.out.println("This is bulukulu festival year.");
			if(ord)
				System.out.println("This is an ordinary year.");
			
			
		}
		
	}
	
}
