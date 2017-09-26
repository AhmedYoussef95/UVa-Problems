package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Snail {
	//http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=514
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		String s = br.readLine();
		String[] arr = s.split(" ");
		if(arr[0].equals("0"))
			return;
		else{
			int height = Integer.parseInt(arr[0]);
			int climb = Integer.parseInt(arr[1]);
			int slide = Integer.parseInt(arr[2]);
			int fatigue = Integer.parseInt(arr[3]);
			action(height,climb,slide,fatigue);
		}
		}
	}

	 static void action(int height, double climb, int slide, double fatigue) {
		double ft = (fatigue/100)*climb;
		int day = 1;
		double heightSoFar = climb;
		if(heightSoFar >= height){
			System.out.println("success on day "+ day);
		     return;}
		heightSoFar -= slide;
		if(heightSoFar < 0){
			System.out.println("failure on day "+ day);
		     return;
		}
		day++;	
		climb -= ft;
		while(true){
			heightSoFar += climb;
			//System.out.println("Day "+day+" climbed "+climb+" and height so far "+heightSoFar);
			if(heightSoFar >= height){
				System.out.println("success on day "+ day);
				return;}
			else{
				heightSoFar -= slide;
				//System.out.println("Day "+day+" slided "+slide+" and height so far "+heightSoFar);
				if(heightSoFar < 0){
					System.out.println("failure on day "+ day);
					return;
				}
				day++;
				climb -= ft;
				if(climb < 0) climb = 0;
			}
		}
		
	}

}
