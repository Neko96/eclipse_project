package hal.ac.gatya;

import java.util.Random;

public class Normal extends Gacha{

	@Override
	public String cardGacha() {
		
		Random random=new Random();
		int ram=random.nextInt(15);
		
		return "<tr><td>"+cas.cardset().get(ram).getNumber()+"</td><td>"+cas.cardset().get(ram).getName()+"</td><td>"+cas.cardset().get(ram).getRarelity()+"</td></tr>";
	}
}
