package model.entities;
// solu��o 1 - muito ruim
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private static Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reservation(){
		
	}

	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
	//	super();
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	//public void setCheckIn(Date checkIn) {   // pra n�o deixar que as datas seja modificadas aqui
	//	this.checkIn = checkIn;
	//}

	public Date getCheckOut() {
		return checkOut;
		
	}

	//public void setCheckOut(Date checkOut) {  // idem setCheckIn porqu� vai ter um 
	//	this.checkOut = checkOut;               // update - assim desde o come�o do curso
	//}                                         // um metodo separado para atualiza��o
	
	// c�lculo em milisegundos , normal da plaaforma java
	// devolve a diferen�a de datas 
	public long duration() {
		long dif = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS); // converte dif para dias
	}

	public void updateDates(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nights";
	}
}

