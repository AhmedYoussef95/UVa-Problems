package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CardsExchange {           //https://uva.onlinejudge.org/external/116/p11678.pdf

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String s = br.readLine();
			if(s.equals("0 0")) return;
			//String[] input = s.split(" ");
			String[] one = br.readLine().split(" ");
			String[] two = br.readLine().split(" ");
			one = removeDups(one);
			two = removeDups(two);
			
			int twounique = 0; //cards 2 has that 1 doesn't
			for (int i = 0; i < two.length; i++) {
				if(!Arrays.asList(one).contains(two[i]) )
					twounique++;					
		}
			int oneunique = 0; //opposite of upper
			for (int i = 0; i < one.length; i++) {
				if(!Arrays.asList(two).contains(one[i]))
					oneunique++;					
		}
			System.out.println(oneunique <= twounique?oneunique:twounique);
		}
	}
	
	public static String[] removeDups(String[] arr){
		int unique = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(i == arr.length-2 && !(arr[i].equals(arr[i+1])))
				unique+=2;
			else{
				if(i == arr.length-2 && (arr[i].equals(arr[i+1])))
					unique++;
				else{
				if(!(arr[i].equals(arr[i+1])))
					unique++;
			}}
		}
		
		String[] result = new String[unique];
		int k = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(i == arr.length-2 && !(arr[i].equals(arr[i+1])))
				{result[k] = arr[i]; result[k+1] = arr[i+1];}
			else{
				if(i == arr.length-2 && (arr[i].equals(arr[i+1])))
					result[k] = arr[i];			
			else{
				if(!(arr[i].equals(arr[i+1])))
					{result[k] = arr[i];k++;}				
			}
		}}
		return result;
	}

}
