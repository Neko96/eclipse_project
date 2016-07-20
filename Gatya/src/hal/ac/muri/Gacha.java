package hal.ac.muri;

public class Gacha {
	
	static int point=100;
	
	public Boolean zeroPoint(){
		
		if(point<0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void Normal(){
		point=point-5;
	}
	
	public void Box(){
		point=point-20;
	}
	
	public int returnPoint(){
		return point;
	}
	
	public int pointCharge(){
		point=point+100;
		
		return point;
	}
}
