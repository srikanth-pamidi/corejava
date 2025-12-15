package net.konic.corejava.StaticNonStatic;

public class CounterDemo {
	
	/*
	 * 4️. Create a class CounterDemo
	 *  • static variable: count
	 *   • Constructor increases count 
	 *   Task: Create 3 objects and print final count = 3
	 */

	static int count = 0;

	CounterDemo() {
		count++;
	}

	public static void main(String[] args) {

		CounterDemo obj1 = new CounterDemo();
		CounterDemo obj2 = new CounterDemo();
		CounterDemo obj3 = new CounterDemo();

		System.out.println("Final Count = " + CounterDemo.count);
	}
}
