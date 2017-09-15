import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

class FormatterTest {
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		//String date = ld.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
		String date = ldt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
		System.out.println(date);

		YearMonth ym = YearMonth.from(ld);
		YearMonth ym2 = YearMonth.from(ldt);
		MonthDay md = MonthDay.from(ld);
		MonthDay md2 = MonthDay.from(ldt);

		int day = md2.getDayOfMonth();
		System.out.println(day);
	}
}