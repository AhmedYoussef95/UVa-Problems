package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PermutationArray {    //https://uva.onlinejudge.org/external/4/482.html

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		boolean first = true;
		while(t > 0){
			if(!first) System.out.println();
			else first = false;
			@SuppressWarnings("unused")
			String useless = br.readLine();
			
			String[] indices = br.readLine().split(" ");
			String[] values = br.readLine().split(" ");
			
			int current = 1;
			int i = 0;
			while(i < indices.length && current <= indices.length){
				if(Integer.parseInt(indices[i]) == current){
					System.out.println(values[i]);
					i = 0;
					current++;
				}
				else
					i++;
			}
			
			t--;
		}
	}

}
