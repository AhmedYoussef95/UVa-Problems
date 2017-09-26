package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptimalParking {       //https://uva.onlinejudge.org/external/113/11364.html

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		while(c>0){
			int min = 100;  int max = -1;
			br.readLine();                             //n not needed
			String[] arr = br.readLine().split(" ");
			for (int i = 0; i < arr.length; i++) {
				if(Integer.parseInt(arr[i])>max) max = Integer.parseInt(arr[i]);
				if(Integer.parseInt(arr[i]) < min) min = Integer.parseInt(arr[i]);
			}
			
			System.out.println(2*(max-min));
			
			c--;
		}
	}

}
