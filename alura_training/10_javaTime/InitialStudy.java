import java.time.*;

class InitialStudy {
	public static void main(String[] args) {
		
		/* localTime = hora
		   localDate = data
		   localdateTime = data e hora */

	   LocalTime lt = LocalTime.now();
	   LocalDate ld = LocalDate.now();
	   LocalDateTime ldt = LocalDateTime.now();

	   System.out.println(lt);
	   System.out.println(ld);	   
	   System.out.println(ldt);

	   // using timeZone
	   LocalTime lt2 = LocalTime.now(ZoneId.of("America/Chicago"));
	   LocalTime lt3 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));

	   System.out.println("from Chicago: " + lt2);
	   System.out.println("from Sao Paulo: " + lt3);

	   LocalTime meioDia = LocalTime.of(12, 0);
	   System.out.println("meio dia: " + meioDia);

	   LocalDate natal = LocalDate.of(2015, 12, 25);
	   System.out.println("natal: " + natal);

	   LocalDate outroNatal = LocalDate.of(2016, Month.DECEMBER, 25);
	   System.out.println("outro natal: " + outroNatal);

	   LocalDateTime ldt2 = LocalDateTime.of(2013, 2, 10, 8, 30);
	   System.out.println("inicio das aulas: " + ldt2);

	   // Let's put together a date with a time
	   LocalDate newYearEve = LocalDate.of(2016, 12, 31);
	   LocalTime lunch = LocalTime.of(12, 30);
	   LocalDateTime newYearEveLunch = LocalDateTime.of(newYearEve, lunch);
	   System.out.println("date plus time: " + newYearEveLunch);











	}
}