package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Reservation {

	//public Reservation(int number, Date checKin, Date checKOut) {
	//	// TODO Auto-generated constructor stub
	//}

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	System.out.print("Room number: ");
	int number = sc.nextInt();
	System.out.print("Check-in date (dd/mm/yyyy) : ");
	Date checKin = sdf.parse(sc.next());
	System.out.print("Check-out date (dd/mm/yyyy) : ");
	Date checKOut = sdf.parse(sc.next());
	
	
	if (!checKOut.after(checKin)) {
		System.out.println("Error in reservation : Checkout date must after checkin date : ");
	}
	else {
		Reservation reservation = new Reservation();
		System.out.println("Reservation : " + reservation);
		
		
	}
	
		
		
		sc.close();
		

	}

}
