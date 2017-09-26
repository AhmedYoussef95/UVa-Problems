package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lumberjack {                         //https://uva.onlinejudge.org/external/119/p11942.pdf

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println("Lumberjacks:");
		while(n>0){
			String[] arr = br.readLine().split(" ");
			boolean ascending;
			boolean ordered = true;
			int c = 0;
			while(Integer.parseInt(arr[c]) == Integer.parseInt(arr[c+1]) && c < arr.length-1) 
				c++;
			if(c != arr.length-1){
				if(Integer.parseInt(arr[c]) < Integer.parseInt(arr[c+1]))
					ascending = true;
				else
					ascending = false;
				if(ascending){
					for(int i = c; i < arr.length-1;i++){
						if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[i+1]))
							ordered = false;
					}	
				}
				else{            //descending
					for(int i = c; i < arr.length-1;i++){
						if(Integer.parseInt(arr[i]) < Integer.parseInt(arr[i+1]))
							ordered = false;
					}
				}					
			}
			
			System.out.println(ordered?"Ordered":"Unordered");
			n--;
		}
	}
}
