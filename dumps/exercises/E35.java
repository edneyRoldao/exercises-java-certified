	import java.time.*;
	import java.format.*;

	// Given the code fragment:
	class Test {
		public static void main(String[] args) {
			LocalDate date1 = LocalDate.now();
			LocalDate date2 = LocalDate.of(2014, 6, 20);
			LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
			System.out.println("date1 = " + date1);
			System.out.println("date2 = " + date2);
			System.out.println("date3 = " + date3);
		}
	}

	/* Assume that the system date is June 20, 2014. What is the result ?

		A) date1 = 2014-06-20
		   date2 = 2014-06-20
		   date3 = 2014-06-20

		B) date1 = 06/20/2014
		   date2 = 2014-06-20
		   date3 = Jun 20, 2014
		   
		C) compilation fails

		D) A DateParseException is thrown at runtime
	*/
