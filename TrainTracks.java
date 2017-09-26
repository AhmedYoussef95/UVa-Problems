package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class TrainTracks {    //https://uva.onlinejudge.org/external/115/p11586.pdf
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t > 0){
			Stack<String> MF = new Stack<String>();
			Stack<String> MM = new Stack<String>();
			Stack<String> FF = new Stack<String>();
			String[] arr = br.readLine().split(" ");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].equals("MM"))
					MM.push(arr[i]);
				else{
					if(arr[i].equals("FF"))
						FF.push(arr[i]);
					else
						MF.push(arr[i]);
				}
			}
			if(   ((MF.size()%2) == 0)  && (MM.size() == FF.size()))
				System.out.println("LOOP");
			else
				System.out.println("NO LOOP");
			t--;
		}
	}

	/*public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int male = 0; int female = 0;
		while(t > 0){
			String[] arr = br.readLine().split(" ");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].equals("MM"))
					male += 2;
				else{
					if(arr[i].equals("FF"))
						female += 2;
					else{
						male++;female++;
					}
				}
			}
			t--;
			if(male == 1 && female == 1)
				System.out.println("NO LOOP");
			else
			    System.out.println(male == female?"LOOP":"NO LOOP");
		}
		
	}*/

}
