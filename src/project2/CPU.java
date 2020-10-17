package project2;

public class CPU {
	int speed;
	private double price;
	
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
	public void show() {
		System.out.println("CPU Price:"+price+"RMB");
	}
}