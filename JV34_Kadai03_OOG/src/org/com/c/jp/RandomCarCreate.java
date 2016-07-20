package org.com.c.jp;

public class RandomCarCreate {
	
	Cars car=new Cars();
	
	public String determine(){
		
		float ram=(float)Math.random();
		
		String s="S";
		String b="B";
		String e="E";
		
		if(0<ram&&ram<=0.3)
		{
			return car.Bus()+b;
		}
		else
		{
			if(0.8<=ram&&ram<1)
			{
				return car.SuperCar()+s;
			}
			else
			{
				return car.ElectricCar()+e;
			}
		}
	}
}
