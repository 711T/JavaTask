package project2;

public class PC {
	CPU cpu;
	HardDisk HD;
	float size;
	String name;
	
	public PC(){
	
}
	public PC(float size,String name){
		this.size=size;
		this.name=name;
	}
	
	public void setCPU(CPU cpu){
		this.cpu=cpu;
	}
	public void setHardDisk(HardDisk HD){
		this.HD=HD;
}
	public void show(){
	System.out.println("CPU speed"+cpu.getSpeed());
	System.out.println("HD amount"+HD.getAmount());
}
}

