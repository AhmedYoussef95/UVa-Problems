package uHunt;

import java.io.*;

public class BurgerTime {            //https://uva.onlinejudge.org/external/116/p11661.pdf

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0) return;
			String s = br.readLine();
			if(s.contains(""+'Z'))
				System.out.println(0);
			else{
				int index = 0;
				int minDistance = 2000001;   //max length of highway is 2 million
				for(int i = 0; i < n;i++){
					if(   ( s.charAt(i) == 'R' && s.charAt(index) == 'D' )  || (  s.charAt(i) == 'D' && s.charAt(index) == 'R'  )  ){
						if( (i - index) < minDistance)
							minDistance = i - index;
						index = i;
					}
					else{
						if(s.charAt(i) == 'D' || s.charAt(i) == 'R')
							index = i;
					}
				}
				System.out.println(minDistance);
			}
		}
	}

}
