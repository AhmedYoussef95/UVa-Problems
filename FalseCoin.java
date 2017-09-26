package uHunt;

import java.io.*;
import java.util.*;

public class FalseCoin {   //https://uva.onlinejudge.org/external/6/665.html

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		boolean first = true;
		while(m > 0){
			@SuppressWarnings("unused")		String useless = br.readLine();    //blank line
			if(!first) System.out.println();
			else first = false;
			
			String[] arr = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			int k = Integer.parseInt(arr[1]);
			boolean[] flags = new boolean[n+1];
			while(k > 0){
				StringTokenizer st = new StringTokenizer(br.readLine());
				int p = Integer.parseInt(st.nextToken());
				Stack<Integer> left = new Stack<Integer>();
				Stack<Integer> right = new Stack<Integer>();
				for(int i = 0;i < p;i++)
					left.push(Integer.parseInt(st.nextToken()));
				while(st.hasMoreTokens())
					right.push(Integer.parseInt(st.nextToken()));
				switch(br.readLine().charAt(0)){
				case '=' : 
					while(!left.isEmpty()){
						flags[left.peek()] = true;
						left.pop();
					}
					while(!right.isEmpty()){
						flags[right.peek()] = true;
						right.pop();
					}
					break;
				case '<' : 
					while(!left.isEmpty()){
						flags[left.peek()] = true;
						left.pop();
					}
					break;
				default :  //case '>'
					while(!right.isEmpty()){
						flags[right.peek()] = true;
						right.pop();
					}
					break;
				}
				
				k--;
			}
			int counter = 0;
			int result = -1;
			for (int i = 1; i < flags.length; i++) {
				if(!flags[i]){
					counter++;
					result = i;
					}
			}
			System.out.println(counter==1?result:0);
			m--;
		}
	}

}