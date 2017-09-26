package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretResearch {     //https://uva.onlinejudge.org/external/6/621.html

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n>0){
			String s = br.readLine();
			if(s.charAt(0) == '9' && s.charAt(s.length()-1) == '4')
				System.out.println("*");
			else{
				if(s.length() >= 3 && s.substring(0, 3).equals("190"))
					System.out.println("?");
				else{
					if(s.length() >=2 && s.substring(s.length()-2).equals("35"))
						System.out.println("-");
					else
						System.out.println("+");
				}
			}
			
			n--;
		}
	}

}
