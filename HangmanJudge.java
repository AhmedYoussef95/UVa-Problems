package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HangmanJudge {            //https://uva.onlinejudge.org/external/4/489.html

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int round = Integer.parseInt(br.readLine());
			if(round == -1) return;
			String word = br.readLine();
			char[] correct1 = new char[word.length()];
			for (int i = 0; i < correct1.length; i++) 
				correct1[i] = word.charAt(i);
			ArrayList<Character> correct = removeDups(correct1);
			String guess = br.readLine();
			char[] g = new char[guess.length()];
			for (int i = 0; i < g.length; i++) 
				g[i] = guess.charAt(i);
			ArrayList<Character> guesses = removeDups(g);
			System.out.println("Round "+round);
			int strokes = 0; // int right = 0;
			boolean chickened = true;  
			while(!guesses.isEmpty() && chickened) {
				if(correct.contains(guesses.get(0))){
					correct.remove(correct.indexOf(guesses.get(0)));
					if(correct.isEmpty()){
						System.out.println("You win.");
						chickened = false; 					}
					}
				else{
					strokes++;
					if(strokes == 7){
						System.out.println("You lose.");
						chickened = false;
					}	
				}
				guesses.remove(0);
			}
			if(chickened)
				System.out.println("You chickened out.");
		}
	}
	
	public static ArrayList<Character> removeDups(char[] arr){
		ArrayList<Character> result = new ArrayList<Character>();
		for (int i = 0; i < arr.length-1; i++) {
			boolean flag = true;
			for(int j = i+1; j < arr.length && flag;j++){
				if(arr[j] == arr[i])
					flag = false;
			}
			if(flag)
				result.add(arr[i]);
		}
		result.add(arr[arr.length-1]);
		return result;
}}