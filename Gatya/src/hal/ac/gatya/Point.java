package hal.ac.gatya;

public class Point {

	public static int point=100;
	
	public Boolean zeroPoint(){
		
		if(point<0)
		{
			point=0;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int returnPoint(){
		return point;
	}
	
	public int pointCharge(){
		point=point+100;
		
		return point;
	}
}
