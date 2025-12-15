package net.konic.corejava.polymorphism;

public class RideBooking {
/*	QUESTION:

		Overload bookRide() with carType and passenger count.

		INPUT:
		bookRide("Ameerpet", "Hitech City")
		bookRide("Ameerpet", "Hitech City", "SUV")
		bookRide("Ameerpet", "Hitech City", 3)

		OUTPUT:
		Ride booked from Ameerpet to Hitech City
		SUV ride booked from Ameerpet to Hitech City
		Ride booked for 3 passengers from Ameerpet to Hitech City
*/
	void bookRide(String a, String b) {
		System.out.println("Ride booked from "+a+" to "+b);
	}
	void bookRide(String a, String b, String c) {
		System.out.println(c+" ride booked from "+a+" to "+b);
	}
	void bookRide(int c, String a, String b) {
		System.out.println("Ride booked for "+c+" passengers from "+a+" to "+b);
	}
	public static void main(String[] args) {
		RideBooking obj = new RideBooking();
		obj.bookRide("Ameerpet", "Hitech City");
		obj.bookRide("Ameerpet", "Hitech City", "SUV");
		obj.bookRide(3,"Ameerpet", "Hitech City");
	}
}
