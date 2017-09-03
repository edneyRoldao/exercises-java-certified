import java.time.*;
import java.time.temporal.*;

class ExtractDateChunks {
	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.of(2014, 10, 29, 11, 35);
		System.out.println("Date that will be used as our examples: " + ldt);

		int month = ldt.getDayOfMonth();
		System.out.println("retrieving day of month from a date: " + month);

		int year = ldt.getYear();
		System.out.println("retrieving year from a date: " + year);

		// We could use an enum called ChronoField to retrieve those dates
		// as well
		System.out.println();
		System.out.println("### USING CHRONO FIELD ENUM TO RETRIEVE DATES ###");
		System.out.println("day of week: " + ldt.get(ChronoField.DAY_OF_WEEK));
		System.out.println("day of month: " + ldt.get(ChronoField.DAY_OF_MONTH));
		System.out.println("day of year: " + ldt.get(ChronoField.DAY_OF_YEAR));


	}
}