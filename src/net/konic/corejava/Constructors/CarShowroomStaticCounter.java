package net.konic.corejava.Constructors;

public class CarShowroomStaticCounter {
	/*
	 * 5.CarShowroomStaticCounter
	 * 
	 * Input: 3 cars created (BMW, Audi, Kia)
	 *  Output: Total Cars Sold: 3
	 *  
	 * ✳ Task:
	 * Use static variable carCount
	 * Increment inside constructor
	 * Print total sales
	 */

	String carname;
	static int carCount = 0;

	public CarShowroomStaticCounter(String name) {
		carname = name;
		carCount++;

	}

	public static void main(String[] args) {
		CarShowroomStaticCounter c1 = new CarShowroomStaticCounter("BMW");
		CarShowroomStaticCounter c2 = new CarShowroomStaticCounter("Audi");
		CarShowroomStaticCounter c3 = new CarShowroomStaticCounter("Kia");

		System.out.println("Total cars sold : " + CarShowroomStaticCounter.carCount);
	}

}
