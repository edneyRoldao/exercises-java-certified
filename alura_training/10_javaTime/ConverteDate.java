import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

class ConverteDate {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		Date d = new Date();
		LocalDateTime ldt = LocalDateTime.now();

		System.out.println(calendarToLocalDateTime(c) instanceof LocalDateTime);
		System.out.println(dateToLocalDateTime(d) instanceof LocalDateTime);
		System.out.println(localDateTimeToCalendar(ldt) instanceof Calendar);
		System.out.println(localDateTimeToDate(ldt) instanceof Date);
		
	}

	public static LocalDateTime calendarToLocalDateTime(Calendar c) {
		return LocalDateTime.ofInstant(c.toInstant(), ZoneId.systemDefault());
	}

	public static LocalDateTime calendarToLocalDateTime(Calendar c, ZoneId z) {
		return LocalDateTime.ofInstant(c.toInstant(), z);
	}

	public static LocalDateTime dateToLocalDateTime(Date d) {
		return LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
	}

	public static LocalDateTime dateToLocalDateTime(Date d, ZoneId z) {
		return LocalDateTime.ofInstant(d.toInstant(), z);
	}

	public static Calendar localDateTimeToCalendar(LocalDateTime ldt) {
		Instant inst = ldt.toInstant(ZoneOffset.UTC);
		Date d = Date.from(inst);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		return c;
	}

	public static Date localDateTimeToDate(LocalDateTime ldt) {
		return Date.from(ldt.toInstant(ZoneOffset.UTC));
	}

}