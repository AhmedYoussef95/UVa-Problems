package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutoAnswer {   //https://uva.onlinejudge.org/external/115/p11547.pdf

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0){
			System.out.println( Math.abs( ( ( ( ( ( ( (Integer.parseInt(br.readLine())*567) /9) +7492) *235) /47) -498) /10)   %    10 )    );
			t--;
		}
	}
}
