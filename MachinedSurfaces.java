package uHunt;

import java.io.*;
import java.util.*;

public class MachinedSurfaces {            //https://uva.onlinejudge.org/external/4/414.html

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0) return;
			if(n == 1) {
				@SuppressWarnings("unused")		String useless = br.readLine();
				System.out.println(0);
			}
			else{
			int difference = 0;
			ArrayList<Integer> differences = new ArrayList<Integer>();
			while(n > 0){
				String s = br.readLine();
				int i1 = -1; int i2 = -1;
				for (int i = 0; i < s.length(); i++) {
					if(s.charAt(i) == ' ')
						{i1 = i; break;}					
				}
				if(i1 > 0){
					for(int i = i1+1;i<s.length();i++){
						if(s.charAt(i) != ' ')
							{i2 = i; break;}
					}
					differences.add(Math.abs(s.substring(0, i1).length() - s.substring(i2).length()));
					if( Math.abs(s.substring(0, i1).length() - s.substring(i2).length()) > difference)
						difference = Math.abs(s.substring(0, i1).length() - s.substring(i2).length());
				}
				n--;
			}
			boolean allEqual = true; 
			for (int i = 1; i < differences.size(); i++) {
				if(differences.get(i) != differences.get(i-1))
				   allEqual = false;
			}
			System.out.println(allEqual?0:difference);
			}
			}
	}

}
