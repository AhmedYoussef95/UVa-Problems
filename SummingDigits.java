package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummingDigits {     //https://uva.onlinejudge.org/external/113/11332.html

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0) return;
			while(n > 9)
				n = action(n);
			System.out.println(n);
		}
	}
	
	public static int action(int n){
		if(n <= 0)
			return 0;
		return (n % 10) + action(n/10);
	}

}
