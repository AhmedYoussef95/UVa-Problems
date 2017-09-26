package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EcologicalPremium {   //https://uva.onlinejudge.org/external/103/p10300.pdf

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());		
			while(n>0){
				int farmers = Integer.parseInt(br.readLine());
				int burden = 0;
				while(farmers > 0){
					String[] arr = br.readLine().split(" ");
					burden += Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
					farmers--;
				}
				System.out.println(burden);
				n--;
			}
		}
	

}
