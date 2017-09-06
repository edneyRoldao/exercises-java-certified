import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

class ExemplosLivro3 {
	public static void main(String[] args) {
	

	ZonedDateTime zdt = LocalDateTime.now().atZone(ZoneId.of("America/Chicago"));
	ZonedDateTime zdt2 = LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo"));
	System.out.println("Chicago: " + zdt);
	System.out.println("Sao Paulo: " + zdt2);


	// Date e Time para DateTime
	LocalDate data = LocalDate.now();
	LocalTime hora = LocalTime.now();

	// forma 01 de criar um LocalDateTime
	LocalDateTime forma1 = data.atTime(hora);
	LocalDateTime forma2 = hora.atDate(data);
























	}
}