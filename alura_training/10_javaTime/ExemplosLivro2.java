import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

/*
	Importante lembrar que essa nova API lança um exception quando uma data é 
	inválida, como 30/02 ou 31/04.
*/

class ExemplosLivro2 {
	public static void main(String[] args) {
		
		// trabalhando com locale e formatacao
		Locale l = new Locale("pt");

		System.out.println(Month.DECEMBER.getDisplayName(TextStyle.FULL, l));  // dezembro
		System.out.println(Month.DECEMBER.getDisplayName(TextStyle.SHORT, l)); // dez

		LocalDateTime agora = LocalDateTime.now();
		String data = agora.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(data);

		LocalDateTime agora2 = LocalDateTime.now();
		String data2 = agora2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(data2);

		// COM LOCALE
		String data3 = agora2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy", l));
		System.out.println(data3);

		// USANDO O FORMATTER
		LocalDateTime nova = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String novaData = nova.format(formatter);
		System.out.println("usando o DateTimeFormatter: " + novaData);

		// USANDO PARSERS para converter string em data
		LocalDate soData = LocalDate.parse(novaData, formatter);
		System.out.println("String to LocalDate: " + soData);


		/* Podemos extrair diferenças de tempo entre duas datas e diversas outras
		   funcionalidades */
		LocalDate justNow = LocalDate.now();
		LocalDate anotherDate = LocalDate.of(1982, 5, 10);
		long days = ChronoUnit.DAYS.between(anotherDate, justNow);
		long months = ChronoUnit.MONTHS.between(anotherDate, justNow);
		long years = ChronoUnit.YEARS.between(anotherDate, justNow);

		System.out.printf("days: %s, months: %s, years: %s", days, months, years);





















	}
}