package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreedyGiftGivers {         //https://uva.onlinejudge.org/external/1/119.html

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		boolean first = true;
		while( (s=br.readLine()) !=null){
			if(!first){
				System.out.println(); first = false;
			}
			int n = Integer.parseInt(s);
			String[] names = br.readLine().split(" ");
			int[] balances = new int[n];
			while(n > 0){
				String[] person = br.readLine().split(" ");
				if(!person[1].equals("0")){
					int index = -1;
					for (int i = 0; i < names.length; i++) {
						if(names[i].equals(person[0]))
							index = i;
					}
					balances[index] -= Integer.parseInt(person[1]);
					int gift = Integer.parseInt(person[1]) / Integer.parseInt(person[2]);
					for(int i = 3;i < person.length; i++){
						for(int j = 0; j < names.length ; j++){
							if(names[j].equals(person[i]))
								balances[j] += gift;
						}
					}
				}
				
				n--;
			}
			for(int i = 0; i < names.length;i++)
				System.out.println(names[i]+" "+balances[i]);
		}
	}

}
