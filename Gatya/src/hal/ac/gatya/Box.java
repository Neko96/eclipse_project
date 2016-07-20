package hal.ac.gatya;

import java.util.Random;

public class Box extends Gacha{
	
	@Override
	public String cardGacha() {
		
		String loop="";
		String loopH=loop;
		
		for(int i=0;i<5;i++)
		{
			Random random=new Random();
			int ram=random.nextInt(15);
			
			loop="<tr><td>"+cas.cardset().get(ram).getNumber()+"</td><td>"+cas.cardset().get(ram).getName()+"</td><td>"+cas.cardset().get(ram).getRarelity()+"</td></tr>";
			
			loopH=loopH+loop;
		}
		
		return loopH;
	}
	
}
