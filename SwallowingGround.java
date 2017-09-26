package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwallowingGround {    //https://uva.onlinejudge.org/external/109/10963.html

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n>0){
			@SuppressWarnings("unused")
			String useless = br.readLine();                   //blank line
			int gaps = Integer.parseInt(br.readLine());      //no. of gaps
			int gap = 0;                                    // gap, all gaps should be equal
			boolean first = true;
			boolean can = true;
			while(gaps > 0){
				String[] arr = br.readLine().split(" ");
				int gapSize = (Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]))+1;
				if(first)
					{gap = gapSize; first = false;}
				else{
					if(gapSize != gap)
					can = false;
				}
				gaps--;
			}
			System.out.println(can?"yes \n":"no \n");	
			n--;
		}
	}

}
