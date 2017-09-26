package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionNlogonia {     //https://uva.onlinejudge.org/external/114/p11498.pdf

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int k = Integer.parseInt(br.readLine());
			if(k == 0) return;
			String[] arr = br.readLine().split(" ");
			int xd = Integer.parseInt(arr[0]);   int yd = Integer.parseInt(arr[1]);
			while(k>0){
				String[] arr2 = br.readLine().split(" ");
				int x = Integer.parseInt(arr2[0]);   int y = Integer.parseInt(arr2[1]);
				if(x == xd || y == yd)
					System.out.println("divisa");
				else{
					if(x > xd && y > yd)
						System.out.println("NE");
					else{
						if(x > xd && y <yd)
							System.out.println("SE");
						else{
							if(x < xd && y > yd)
								System.out.println("NO");
							else
								System.out.println("SO");
						}
					}
				}
				k--;
			}
		}
	}

}
