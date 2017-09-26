package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Jollo {      //https://uva.onlinejudge.org/external/122/12247.html

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String s = br.readLine();
			if(s.equals("0 0 0 0 0")) return;
			boolean[] dealed = new boolean[53];                     //for the 52 cards to avoid playing duplicates
			StringTokenizer st = new StringTokenizer(s);
			int[] princess = new int[3];
			for(int i = 0; i < 3;i++){
				int x = Integer.parseInt(st.nextToken());
				princess[i] = x;
				dealed[x] = true;
			}
			int[] prince = new int[2];
			for(int i = 0; i < 2;i++){
				int x = Integer.parseInt(st.nextToken());
				prince[i] = x;
				dealed[x] = true;
			}
			Arrays.sort(prince); Arrays.sort(princess);
			
			if(prince[0] > princess[2]){        //prince's cards bigger than all of princess'
				int i = 1;
				while( (i < 53) && dealed[i] )
					i++;
				System.out.println(i<53?i:-1);
			}
			else{
			if(prince[0] > princess[0]){ 
				int i = (princess[1]+1);
				while( (i < 53) && dealed[i] )
					i++;
				System.out.println(i<53?i:-1);
			}
			else{           
				if(prince[1] < princess[0])      //prince's cards all lower than princess'
					System.out.println(-1);
				else{                            //prince[0] < princess[0]  && prince[1] > princess[0]
					if(princess[2] > prince[1])
						System.out.println(-1);
					else{                        //prince[0] < princess[0]  && prince[1] > princess[0] && prince[1] > princess[2]
						int i = princess[2]+1;
						while( (i < 53) && dealed[i] )
							i++;
						System.out.println(i<53?i:-1);
					}
					
				}
			}
				
		}
		}
	}

}