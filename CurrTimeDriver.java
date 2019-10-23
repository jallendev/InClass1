import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CurrTimeDriver {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		long milli = date.getTime();
		
		CurrentTime ct = new CurrentTime(milli);
		System.out.println(ct);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Calendar calendar = new GregorianCalendar();
		System.out.println(dateFormat.format(calendar.getTime()));
		
		Calendar wayBack = new GregorianCalendar(1960, 1, 10, 1, 11);
		System.out.println(dateFormat.format(wayBack.getTime()));
	}

}
