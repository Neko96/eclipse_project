package hal.ac.gatya;

public abstract class Gacha {
	
	Cardset cas=new Cardset();
	
	public Gacha(){
		cardGacha();
	}
	
	abstract protected String cardGacha();
}
