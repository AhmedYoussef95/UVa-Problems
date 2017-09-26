package uHunt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LanguageDetection {    //https://uva.onlinejudge.org/external/122/12250.html

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		while(true){
			String s = br.readLine();
			if(s.equals("#")) return;
			switch(s){
			case "HELLO" : System.out.println("Case "+i+": ENGLISH");break;
			case "HOLA" : System.out.println("Case "+i+": SPANISH");break;
			case "HALLO" : System.out.println("Case "+i+": GERMAN");break;
			case "BONJOUR" :System.out.println("Case "+i+": FRENCH");break;
			case "CIAO" : System.out.println("Case "+i+": ITALIAN");break;
			case "ZDRAVSTVUJTE" : System.out.println("Case "+i+": RUSSIAN");break;
			default: System.out.println("UNKNOWN");
			
			}
			i++;
		}
	}
}
