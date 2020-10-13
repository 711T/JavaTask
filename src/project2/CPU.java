package project2;

public class CPU {
	private int speed;
	public double price;
	
	public CPU(){
		
	}
	public CPU(double price){
		this.price=price;
	}
	
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
}
