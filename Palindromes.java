package uHunt;

import java.util.Scanner;

public class Palindromes {  //http://uva.onlinejudge.org/external/4/401.html

	public static boolean palindrome(String s){
		int i = 0 ; int j = s.length()-1;
		while (j>i){
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++; j--;
		}
		return true;
	}
	
	public static boolean mirror(String s){
		int i = 0; int j = s.length()-1;
		while(j>=i){			
			switch(s.charAt(i)){
			case 'A' : if(s.charAt(j)!='A') return false;break;
			case 'E' : if(s.charAt(j)!='3') return false;break;
			case 'H' : if(s.charAt(j)!='H') return false;break;
			case 'I' : if(s.charAt(j)!='I') return false;break;
			case 'J' : if(s.charAt(j)!='L') return false;break;
			case 'L' : if(s.charAt(j)!='J') return false;break;
			case 'M' : if(s.charAt(j)!='M') return false;break;
			case 'O' : if(s.charAt(j)!='O') return false;break;
			case 'S' : if(s.charAt(j)!='2') return false;break;
			case 'T' : if(s.charAt(j)!='T') return false;break;
			case 'U' : if(s.charAt(j)!='U') return false;break;
			case 'V' : if(s.charAt(j)!='V') return false;break;
			case 'W' : if(s.charAt(j)!='W') return false;break;
			case 'X' : if(s.charAt(j)!='X') return false;break;
			case 'Y' : if(s.charAt(j)!='Y') return false;break;
			case 'Z' : if(s.charAt(j)!='5') return false;break;
			case '1' : if(s.charAt(j)!='1') return false;break;
			case '2' : if(s.charAt(j)!='S') return false;break;
			case '3' : if(s.charAt(j)!='E') return false;break;
			case '5' : if(s.charAt(j)!='Z') return false;break;
			case '8' : if(s.charAt(j)!='8') return false;break;
			default: return false;
			}
			i++; j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean first = true;
		while(sc.hasNext()){
			if(!first)
				System.out.println();
			String s = sc.nextLine();
			first = false;
			if(palindrome(s) && mirror(s))
				System.out.println(s+" -- is a mirrored palindrome.");
			else
				if(palindrome(s))
					System.out.println(s+" -- is a regular palindrome.");
				else
					if(mirror(s))
						System.out.println(s+" -- is a mirrored string.");
					else
						System.out.println(s+"  -- is not a palindrome.");
			//System.out.println();
		}
		sc.close();
	}

}
