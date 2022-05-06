package org.var;

public class LocalVariable {
	private void add() {
		int a = 100;
		System.out.println("\n value of a in add method:"+a);
	}
	private void print() {
		int a = 1000;
		System.out.println("\n value of a in print method:"+a);
	}
	public static void main(String[] args) {
		int a = 10;
		System.out.println("\n value of a in main method:"+a);
		LocalVariable l = new LocalVariable();
		l.add();
		System.out.println("After calling add method: "+a);
		l.print();
		System.out.println("After calling print method:"+a);
		System.out.println("A Branch added few lines of code");
		System.out.println("B Branch added few lines");
		
				
	}

}
