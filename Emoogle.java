package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Emoogle {   //https://uva.onlinejudge.org/external/122/12279.html

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = 1;
		while(true){
		int n = Integer.parseInt(br.readLine());
		if(n == 0) return;
		String[] arr = br.readLine().split(" ");
		int should = 0;  int gave = 0;
		for (int i = 0; i < arr.length; i++) {
			if(Integer.parseInt(arr[i]) == 0)
				gave++;
			else
				should++;
		}
		System.out.println("Case "+c+": "+(should-gave));
		c++;
		}}

}
