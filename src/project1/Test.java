package project1;
import project2.*;
public class Test {

	public static void main(String[] args) {
		CPU cpu=new CPU(120.68);
		HardDisk HD=new HardDisk(18);
		PC pc=new PC(180,"Apple");
		cpu.setSpeed(3000);
		HD.setAmount(800);
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		cpu.show();
		pc.show();
		HD.show();

	}

}