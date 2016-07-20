package hal.ac.gatya;

public class Card {
	
	private int number;
	private String name;
	private int rare;
	
	public Card(int n,String na,int r){
		this.number=n;
		this.name=na;
		this.rare=r;
	}
	
	public int getNumber(){
		return number;
	}
	
	public String getName(){
		return name;
	}
	
	public int getRarelity(){
		return rare;
	}
}
