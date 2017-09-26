package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JollyJumpers {      //https://uva.onlinejudge.org/external/100/p10038.pdf

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = br.readLine())!=null){
			String[] arr = s.split(" ");
			int n = Integer.parseInt(arr[0]);
			if(arr.length == 2 )
				System.out.println("Jolly");
			else{
				boolean[] markers = new boolean[n];
				for(int i = 1; i < arr.length-1;i++){
					int diff = Math.abs(Integer.parseInt(arr[i]) - Integer.parseInt(arr[i+1]));
					//System.out.println(diff);
					if(diff < n)
						markers[diff] = true;					
				}
				for (int i = 1; i < markers.length; i++) {
					//System.out.println(markers[i]);
					if(!markers[i])
						{System.out.println("Not jolly"); break;}
					else{
						if(i == markers.length-1)
							System.out.println("Jolly");
					}
				}
			}
			
		}
	}

}
