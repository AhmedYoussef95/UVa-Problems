package uHunt;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BridgeHand {          //https://uva.onlinejudge.org/external/4/462.html

	public static boolean[] stopped = new boolean[4];         //0)spades 1)hearts 2)diamonds 3)clubs
	
		public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while( (s=br.readLine())!=null){
			StringTokenizer st = new StringTokenizer(s);
			ArrayList<String> spades = new ArrayList<String>();    ArrayList<String> hearts = new ArrayList<String>();
			ArrayList<String> diamonds = new ArrayList<String>();  ArrayList<String> clubs = new ArrayList<String>();
			
			while(st.hasMoreTokens()){
				String card = st.nextToken();
				switch( card.charAt(1) ){
				case 'S' : spades.add(card);break;
				case 'H' : hearts.add(card);break;
				case 'D' : diamonds.add(card);break;
				default : clubs.add(card);				
				}
			}                                                          //ordered cards by suit
			
			int points = points(spades,0) + points(hearts,1) + points(diamonds,2) + points(clubs,3);
			if(alltrue(stopped) && points >15)
				System.out.println("BID NO-TRUMP");
			else{
				points += sizepoints(spades) + sizepoints(hearts) + sizepoints(diamonds) + sizepoints(clubs);
				if(points < 14)
					System.out.println("PASS");
				else{
					if( (spades.size() >= hearts.size()) && (spades.size() >= diamonds.size()) && (spades.size() >= clubs.size()))
						System.out.println("BID S");
					else{
						if((hearts.size() >= spades.size()) && (hearts.size() >= diamonds.size()) && (hearts.size() >= clubs.size()))
							System.out.println("BID H");
						else{
							if((diamonds.size() >= spades.size()) && (diamonds.size() >= hearts.size()) && (diamonds.size() >= clubs.size()))
								System.out.println("BID D");
							else
								System.out.println("BID C");
						}
					}
				}
			}
			
		stopped = new boolean[4];    //resetting for next input	
		}
	}
	
	public static int points(ArrayList<String> arr,int code){
		int points = 0;
		for (int i = 0; i < arr.size(); i++) {
			String c = (String) arr.get(i);
			if(c.charAt(0) == 'A')
				{points += 4; stopped[code] = true;}
			else{
				if(c.charAt(0) == 'K'){
					if(arr.size() == 1)
						points += 2;
					else
					{points += 3; stopped[code] = true;}
				}
				else{
					if(c.charAt(0) =='Q'){
						if(arr.size() > 2)
						{points+=2;stopped[code] = true;}
						else points++;
					}
					else{
						if(c.charAt(0) == 'J'  && arr.size() > 3)
							points++;
					}
				}
			}
			
				
		}
		return points;
	}
	
	public static boolean alltrue(boolean[] arr){
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i])
				return false;
		}
		return true;
	}
	
	public static int sizepoints(ArrayList<String> arr){
		switch(arr.size()){
		case 2 : return 1;
		case 0:
		case 1 : return 2;
		default : return 0;
		
		}
	}

}
