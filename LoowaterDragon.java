package uHunt;

import java.io.*;

public class LoowaterDragon {      //https://uva.onlinejudge.org/external/112/11292.html

	public static void main(String[] args) throws IOException {

		while(true){
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		String s = br.readLine();
		if(s.equals("0 0"))
			return;
		String[] pair = s.split(" ");
		int n = Integer.parseInt(pair[0]);      //no. of heads
		int m = Integer.parseInt(pair[1]);      //no. of knights
		int[] heads = new int[n];
		for (int i = 0; i < heads.length; i++) 
			heads[i] = Integer.parseInt(br.readLine());
		heads = sort(heads);                        // sort in abrending order
		int[] knights = new int[m];
		for (int i = 0; i < knights.length; i++) 
			knights[i] = Integer.parseInt(br.readLine());
		knights = sort(knights);                    // handled input
		
		if(n > m || heads[heads.length-1] > knights[knights.length-1])
			System.out.println("Loowater is doomed!");
		else{
			int result = 0;
			boolean t = true;                            //flag represents there is a knight able to take down a head
			int i = 0;  int j = 0;
			while(i < n && j < m && t){
				if(knights[j] >= heads[i]){
					result += knights[j];
					i++;
				}
				j++;
				if(j == m && i < n)
					t = false;
				
			}
			System.out.println(t?result:"Loowater is doomed!");
		}
		}
		}
	}
	
	public static int[] sort(int[] arr){                    //selection sort
		int min = 20001;   //stated that max possible value is 20,000
		int minIndex = 0;
		for (int i = 0; i < arr.length -1 ; i++) {
			for(int j = i;j < arr.length; j++){
				if(arr[j] < min){
					min = arr[j];
					minIndex = j;
				}
			}
			arr[minIndex] = arr[i];
			arr[i] = min;
			min = 20001;
		}
		return arr;
	}
	
}
