import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

class UsandoDateTimeFormatter {
	public static void main(String[] args) {
	
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println(agora.format(formatter));
		System.out.println(formatter.format(agora));

		String dataComoTexto = "10/05/1982";
		LocalDate meuNiver = LocalDate.parse(dataComoTexto, formatter);
		System.out.println("Meu aniver: " + meuNiver);

		LocalDate ld = LocalDate.now();
		System.out.println(ld.isSupported(ChronoUnit.HOURS)); // false

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.isSupported(ChronoUnit.HOURS)); // true

		








	}
}