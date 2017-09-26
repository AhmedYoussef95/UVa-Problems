package uHunt;

import java.io.*;
import java.util.*;

public class BoxOfBricks {            //https://uva.onlinejudge.org/external/5/591.html

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int set = 1;
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0) return;
			int[] stacks = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			int total = 0;
			for(int i = 0; i<n;i++){
				int x = Integer.parseInt(st.nextToken());
				stacks[i] = x;
				total += x;
			}
			int eachStack = total/n;
			int diffs = 0;
			for (int i = 0; i < stacks.length; i++) 
				diffs += Math.abs(stacks[i] - eachStack);
			System.out.println("Set #"+set);
			System.out.println("The minimum number of moves is "+diffs/2+".");
			System.out.println();
			set++;
		}
	}

}
