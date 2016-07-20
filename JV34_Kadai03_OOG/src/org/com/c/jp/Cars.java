package org.com.c.jp;

import java.util.Random;

public class Cars extends Counter{
	
	static String e="";
	
	public String ElectricCar(){
		
		boolean stopflg=false;
		
		if(counter%5==0)
		{
			if(Math.random()<=0.5)
			{
				stopflg=false;
			}
			
			stopflg=true;
		}
		
		if(stopflg)
		{
			
		}
		else
		{
			e+="---";
		}
		
		return e;
	}
	
	static String b="";
	
	public String Bus(){
		
		if(counter%3==0)
		{
			
		}
		else
		{
			if(Math.random()<=0.3)
			{
				b+="*****";
			}
			else
			{
				b+="**";
			}
		}
		
		return b;
	}
	
	static String s="";
	
	public String SuperCar(){
		
		boolean stopflg=false;
		
		if(Math.random()<=0.5)
		{
			stopflg=true;
		}
		
		if(stopflg)
		{
			
		}
		else
		{
			if(Math.random()<=0.2)
			{
				s+="======";
			}
			else
			{
				s+="====";
			}
		}
		
		return s;
	}
	
	public static String[] cartype = new String[10];
	
	
	public String[] Car(){
		
		int numnum;
		Random ram=new Random();
		int[] num=new int[10];
		numnum=ram.nextInt(3);
		
		for(int i=0;i<num.length;i++)
		{
			num[i]=numnum;
		}
		
		for(int i=0;i<10;i++)
		{
			
			if(num[i]==0)
			{
				cartype[i]="S";
			}
			if(num[i]==1)
			{
				cartype[i]="B";
			}
			if(num[i]==2)
			{
				cartype[i]="E";
			}
		}
		
		return cartype;
	}
}
