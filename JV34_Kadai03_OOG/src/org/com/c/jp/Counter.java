package org.com.c.jp;

public class Counter {
	
	static int counter=0;
	
	public int pluscon()
	{
		counter=counter+1;
		return counter;
	}
	
	public int reset(){
		
		counter=0;
		return counter;
	}
}
