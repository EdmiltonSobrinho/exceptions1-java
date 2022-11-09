package aplication;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;



public class DataEx1 {

	public static void main(String[] args) throws ParseException {
		// HORÁRIO UTC
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// HORÁRIO GMT
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("26/06/2018");
		Date y2 = sdf2.parse("26/06/2018 15:42:07");
				
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println("=========================");
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		
		System.out.println("y1 = " + sdf1.format(y1));
		System.out.println("y2 = " + sdf2.format(y2));
		
		System.out.println("x1 = " + sdf1.format(x1));	
		System.out.println("x2 = " + sdf2.format(x2));
		System.out.println("x3 = " + sdf2.format(x3)); // 3 horas antes de 1970
		System.out.println("x43 = " + sdf2.format(x4)); 
		
		// iso 8601 padrao UTC
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("Y3 = " + sdf2.format(y3)); 
	
	
		System.out.println("====( brincadeira padrao GMT )=========");
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		
		System.out.println("y1 = " + sdf3.format(y1));
		System.out.println("y2 = " + sdf3.format(y2));
		
		System.out.println("x1 = " + sdf3.format(x1));	
		System.out.println("x2 = " + sdf3.format(x2));
		System.out.println("x3 = " + sdf3.format(x3)); // 3 horas antes de 1970
		System.out.println("x43 = " + sdf3.format(x4)); 
		
		// iso 8601 padrao UTC
		Date y31 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("Y3 = " + sdf3.format(y31)); 
	
	
		System.out.println("====( SEM O HORARIO )=========");
		
		System.out.println("x1 = " + x1);	
		System.out.println("x2 = " + x2);
		System.out.println("x3 = " + x3); 
		System.out.println("x43 = " + x4); 
		
	
	}

}
