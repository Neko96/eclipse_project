package hal.ac.muri;

import java.util.ArrayList;
import java.util.Random;


public class CardSet {
	
	public ArrayList<Card> cardset(){
		ArrayList<Card> list=new ArrayList<Card>();
		String words[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"};
		Random random=new Random();
		int ram=random.nextInt(5);
		
		for(int i=0;i<15;i++)
		{
			list.add(new Card(i,words[ram],ram));
		}
		
		return list;
	}
}
