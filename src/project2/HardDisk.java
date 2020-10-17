package project2;

public class HardDisk {
	public int amount;
	protected int cache;
	
	public HardDisk(){
		
	}
	public HardDisk(int cache){
		this.cache=cache;
	}
	public int getAmount(){
		return amount;
	}
	public void setAmount(int amount){
		this.amount=amount;
	}
	public void show() {
		System.out.println("HardDisk cache:"+cache+"M");
	}
}