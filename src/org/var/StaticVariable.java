package org.var;
//Static variable

public class StaticVariable {
	static  final int a =10;
	private static void add() {
		 final int a = 100;
		System.out.println("\n the value of a in add method:"+a);
		

	}

	private void print() {

		 int  a = 100;
		System.out.println("\n the value of a in print method:" + a);

	}
	public static void main(String[] args) {
		StaticVariable s = new StaticVariable();
		System.out.println("Before method call:"+s.a);
		s.add();
		System.out.println("After callind add method:"+s.a);
		s.print();
		System.out.println("After calling print method:"+s.a);
		System.out.println("Static variable as modified");
	    System.out.println("A branch added few lines of code");
	}

}
