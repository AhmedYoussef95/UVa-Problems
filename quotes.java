package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quotes {  //https://uva.onlinejudge.org/external/2/272.html

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		boolean left = true;
		while((s = br.readLine()) != null){
			String result = "";
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '"'){
					if(left)
						{result += "``"; left = false;}
					else
						{result += "''"; left = true;}
				}
				else
					result += s.charAt(i);
			}
			System.out.println(result);
		}
		
	}
}
