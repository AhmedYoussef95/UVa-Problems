package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class WhatIsTheCard {   //https://uva.onlinejudge.org/external/106/10646.html

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNo = 1;
		int t = Integer.parseInt(br.readLine());
		while(t > 0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			Stack<String> pile = new Stack<String>();
			for(int i = 0; i < (52-25);i++)
				pile.push(st.nextToken());
			int y = 0;
			for(int i = 0; i < 3;i++){
				String topCard = pile.pop();
				int x = value(topCard);
				y +=x ;
				for(int j = 0; j < (10-x);j++)
					pile.pop();
			}
			for(int i = 0; i < 25;i++)
				pile.push(st.nextToken());
			int pileSize = pile.size();
			for(int i = 0; i < (pileSize-y);i++)
				pile.pop();
			//System.out.println(y);
			System.out.println("Case "+caseNo+": "+pile.pop());
			
			t--;
			caseNo++;
		}
	}
	
	public static int value(String s){
		switch(s.charAt(0)){
		case 'A':case 'T':case 'K':case 'Q':case 'J' : return 10;
		default: return Integer.parseInt(s.substring(0, 1));
		}
	}

}
