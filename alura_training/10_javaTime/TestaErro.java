import java.time.*;

class TestaErro {
	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDate ld = ldt.toLocalDate();
		LocalTime lt = ldt.toLocalTime();

		// Erro
		// LocalDate ld2 = ldt.toDateTime();

	}
}