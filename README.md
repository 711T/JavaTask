# JavaTask
# 2020322062 计G201 苗广汉
  ## 1.实验内容
  + 1.基本要求是完成教材P110页的第四题关于PC、cpu,及其他模拟的程序。
  + 2.附加要求是每个类定义不少于2个属性，且属性的类型应该多样化。
  + 3.根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断。
  + 4.尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
  ## 2.实验设计
  + 1.给CPU添加speed,price属性
  ```
int speed;
private double price;
  ```
  给CPU添加构造方法
  ``` 
public CPU(){
		
	}
public CPU(double price){
	this.price=price;
	}
  ```
  给CPU添加普通方法
  ```
public int getSpeed(){
       return speed;
}
public void setSpeed(int speed){
	this.speed=speed;
}
public void show() {
	System.out.println("CPU Price:"+price+"RMB");
}
  ```
 + 2.给HardDisk添加amount,cache属性
 ```
 public int amount;
protected int cache;
 ```
 给HardDisk添加构造方法
 ```
public HardDisk(){
		
}
public HardDisk(int cache){
	this.cache=cache;
}
 ```
给HardDisk添加普通方法
 ```
public int getAmount(){
	return amount;
}
public void setAmount(int amount){
	this.amount=amount;
}
public void show() {
         System.out.println("HardDisk cache:"+cache+"M");
}
 ```
 + 3.给PC添加cpu，HD，size,name属性
 ```
CPU cpu;
HardDisk HD;
float size;
String name;
 ```
 给PC添加构造方法
 ```
public PC(){
	
}
public PC(float size,String name){
	this.size=size;
	this.name=name;
}
 ```
 给PC添加普通方法
 ```
 public void setCPU(CPU cpu){
	this.cpu=cpu;
}
public void setHardDisk(HardDisk HD) {
	this.HD=HD;
}
public void show(){
	System.out.println("CPU speed:"+cpu.getSpeed());
	System.out.println("HD amount:"+HD.getAmount());
	System.out.println("PC size:"+size);
	System.out.println("PC name:"+name);
}
 ```
 ## 核心方法
 创建Test类，在main方法下，添加CPU,PC,HardDisk对象
```
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
```	
## 实验结果
```
CPU Price:120.68RMB
CPU speed:3000
HD amount:800
PC size:180.0
PC name:Apple
HardDisk cache:18M
```
## 实验感想
+ 1.通过这次实验学习到了关于访问权限的不同，public,protected,private修饰符。
+ 2.熟悉构造方法和普通方法的使用。
+ 3.学习了不同的基本数据类型，int,float,double,String等。
+ 4.知道了把多个类放置在不同的包中以及import用法。
+ 5.了解了如何通过GitHub上传Java作业。

 
