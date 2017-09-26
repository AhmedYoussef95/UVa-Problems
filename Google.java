package uHunt;

import java.io.*;

public class Google {  //https://uva.onlinejudge.org/external/120/p12015.pdf

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNo = 1;
		int t = Integer.parseInt(br.readLine());
		while(t>0){
			String[] URLs = new String[10];
			int[] relevances = new int[10];
			int max = -1;                               //initial value
			for(int i = 0;i < 10; i++){
				String[] arr = br.readLine().split(" ");
				URLs[i] = arr[0];
				relevances[i] = Integer.parseInt(arr[1]);
				if(relevances[i] > max)
					max = relevances[i];				
			}
			System.out.println("Case #"+caseNo+":");
			for(int i = 0;i < 10;i++){
				if(relevances[i] == max)
					System.out.println(URLs[i]);
			}
			caseNo++;
			t--;
		}
	}

}
