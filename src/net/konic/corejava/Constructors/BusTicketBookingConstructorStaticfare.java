package net.konic.corejava.Constructors;

public class BusTicketBookingConstructorStaticfare {

	/*
	 * 8.Bus Ticket Booking (Constructor + Static fare)
	 * 
	 * Input:passenger="Mohammed",fare=500
	 * Output:
	 * Passenger:Mohammed 
	 * Ticket Fare: 500
	 *  Company: IRCTC
	 * 
	 * ✳ Task:
	 * 
	 * Constructor sets passenger name
	 * 
	 * Static variable for company name and fare
	 */
   static  String Company;
	String passenger;
	static int fare ;
	
	public BusTicketBookingConstructorStaticfare(String c,String a, int f) {
		Company = c;
		passenger = a;
		fare = f;
		
	}
	
	public static void main(String[] args) {
		BusTicketBookingConstructorStaticfare obj = new BusTicketBookingConstructorStaticfare("IRCTC","Srikanth",500);
		System.out.println("Company Name : "+BusTicketBookingConstructorStaticfare.Company);
		System.out.println("Passenger Name : "+obj.passenger);
		System.out.println("Fare : "+BusTicketBookingConstructorStaticfare.fare);
	}
	
	
	
	
	
	
	
	
}
