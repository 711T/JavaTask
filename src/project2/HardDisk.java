package project2;

public class HardDisk {
	public int amount;
	double price;
	
	public HardDisk(){
		
	}
	public HardDisk(double price){
		this.price=price;
	}
	public int getAmount(){
		return amount;
	}
	public void setAmount(int amount){
		this.amount=amount;
	}
}
