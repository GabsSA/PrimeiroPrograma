package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("05/12/1997");
		Date y2 = sdf2.parse("05/12/1997 15:12:10");
		Date x1 = new Date();
		Date x2 = new Date(1000L * 60L * 60L * 5L);
		Date x3 = new Date(System.currentTimeMillis());
				
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(x3));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(y2);
		cal.add(Calendar.HOUR_OF_DAY, 5);
		y2 = cal.getTime();
		System.out.println(sdf2.format(y2));
		
		sc.close();

	}
}

