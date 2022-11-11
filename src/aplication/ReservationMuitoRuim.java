package aplication;
// solução muito ruim = 1
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class ReservationMuitoRuim {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/mm/yyyy) ");
		Date checkIn= sdf.parse(sc.next());
		System.out.println("Check-out date (dd/mm/yyyy) ");
		Date checkOut= sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation check-out date after check-in date :");
		}
		else {
			Reservation reservation = new Reservation (number, checkIn, checkOut);
			System.out.println("Reservation :" + reservation);
		
			System.out.println();
			System.out.println("Enter date to update reservation");
			
			System.out.println("Check-in date (dd/mm/yyyy) ");
			checkIn= sdf.parse(sc.next());
			System.out.println("Check-out date (dd/mm/yyyy) ");
			checkOut= sdf.parse(sc.next());
			
		    Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservatio : Reservation date for update muste future dates");
			}
			else {  
				if (!checkOut.after(checkIn)) {
						System.out.println("Error in reservation check-out date after check-in date :");
			    }
				else {
					reservation.updateDates(checkIn, checkOut);
					System.out.println("Reservation :" + reservation);
				}
			}
			
			reservation.updateDates(checkIn, checkOut);  // atualiza a reserva
		    System.out.println("Reservation :" + reservation);
		}
		
		
		
		sc.close();
	}
}
