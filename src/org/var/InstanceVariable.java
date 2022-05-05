package org.var;
//Instance variable
public class InstanceVariable {
	int a=2000;
	private void add() {
		a=100;
		System.out.println("Value of a in add method:"+a);
		
	
	}
private void print() {
	a=1000;
	System.out.println("Value of a in print method:"+a);
}
public static void main(String[] args) {
	InstanceVariable i = new InstanceVariable();
	System.out.println("Before method call"+i.a);
	i.add();
	System.out.println("After calling a value in add method:"+i.a);
	i.print();
	System.out.println("After calling a value in print method:"+i.a);
	InstanceVariable i2 = new InstanceVariable();
	System.out.println("After new object creation"+i2.a);
	System.out.println("B Branch added few lines");
}
}
