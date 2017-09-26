package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindingNessy {                //https://uva.onlinejudge.org/external/110/11044.html

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0){
			String[] arr = br.readLine().split(" ");
			int x = Integer.parseInt(arr[0]); 
			int y = Integer.parseInt(arr[1]);			
			System.out.println((x/3*(y/3)));            //I have no idea why this is the correct answer
			t--;
		}
	}

}
