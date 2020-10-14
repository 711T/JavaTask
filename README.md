# JavaTask
  ## 1.实验内容
  + 1.基本要求是完成教材P110页的第四题关于PC、cpu,及其他模拟的程序。
  + 2.附加要求是每个类定义不少于2个属性，且属性的类型应该多样化。
  + 3.根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断。
  + 4.尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
  ## 2.实验设计
  + 1.给CPU添加speed,price对象，给CPU对象添加方法
  ```
public int getSpeed(){
		return speed;
	}
public void setSpeed(int speed){
		this.speed=speed;
	}
  ```
 + 2.给HardDisk添加amount,price对象，给HardDisk对象添加方法
 ```
public int getAmount(){
		return amount;
	}
public void setAmount(int amount){
		this.amount=amount;
	}
 ```
 + 3.给PC添加cpu，HD，size,name对象，给PC对象添加方法
 ```
public void setCPU(CPU cpu){
		this.cpu=cpu;
	}
public void setHardDisk(HardDisk HD){
		this.HD=HD;
}
 ```
 ## 核心方法
```
 		CPU cpu=new CPU();
		HardDisk HD=new HardDisk();
		cpu.setSpeed(2200);
		HD.setAmount(200);
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
```
## 实验结果
```
CPU speed2200
HD amount200
```
## 实验感想
+ 1.通过这次实验学习到了关于访问权限的不同。
+ 2.了解了构造方法。
+ 3.学习了不同的基本数据类型。
+ 4.知道了把多个类放置在不同的包中，import用法。

 
