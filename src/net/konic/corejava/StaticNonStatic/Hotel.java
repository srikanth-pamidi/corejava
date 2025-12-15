package net.konic.corejava.StaticNonStatic;

public class Hotel {
	/*
	 * 1 Create a class Hotel 
	 * • static variable: hotelName 
	 * • instance variable:roomNumber
	 * • Create object and print both values
	 * Task: Show that static can be accessed without object, non-static cannot.
	 */
	
	static String hotelname="Lemon Tree";
	int roomnum;
	
	public void details(int r) {
		roomnum=r;
		System.out.println("Room Num : "+roomnum);
	}
	static void name() {
		System.out.println("Hotel Name : "+hotelname);
	}
	public static void main(String[] args) {
		Hotel obj = new Hotel();
		Hotel.name();
		obj.details(5);
		
		
	}
}
