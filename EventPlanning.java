package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EventPlanning {         //https://uva.onlinejudge.org/external/115/p11559.pdf

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = br.readLine()) != null){
			String[] arr = s.split(" ");
			int participants = Integer.parseInt(arr[0]);
			int budget = Integer.parseInt(arr[1]);
			int hotels = Integer.parseInt(arr[2]);
			//int weekends = Integer.parseInt(arr[3]);
			
			int cheapestSoFar = 2000001;     //max cost is 2 million
			
			@SuppressWarnings("unused")
			String useless;                  //reserved for later to resolve inexplicable compilation error
			
			while(hotels > 0){
				int cost = Integer.parseInt(br.readLine());
				if( ((cost*participants) <= budget) && (cost*participants) < cheapestSoFar){
					String[] hotel = br.readLine().split(" ");
					for (int i = 0; i < hotel.length; i++) {
						if(Integer.parseInt(hotel[i]) >= participants){
							cheapestSoFar = cost*participants;
							break;
						}
					}
				}
				else
					 useless = br.readLine();               //don't care about hotel details if out of budget
				                    
				hotels--;
			}
			System.out.println(cheapestSoFar > 2000000?"stay home":cheapestSoFar);
		}
	}

}
