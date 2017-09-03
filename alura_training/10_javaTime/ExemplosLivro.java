import java.time.*;
import java.time.temporal.*;

class ExemplosLivro {

	public static void main(String[] args) {
		
		// obter um localDateTime a partir de um localDate com atTime
		LocalDateTime dataNoMeio = LocalDate.now().atTime(12, 0);
		System.out.println(dataNoMeio);

		// outra forma a partir do proprio objeto
		LocalDate data = LocalDate.now();
		LocalTime hora = LocalTime.now();
		LocalDateTime dataComHora = data.atTime(hora);
		System.out.println(dataComHora);

		// vamos trabalhar com zoneID
		ZonedDateTime dataComZona = dataComHora.atZone(ZoneId.of("America/Chicago"));
		System.out.println(dataComZona);

		// Convertendo datas
		LocalDateTime dataComHora2 = dataComZona.toLocalDateTime();
		System.out.println(dataComHora2);

		// metodos with
		LocalDate ldAnoPassado = LocalDate.now().withYear(1988);
		System.out.println(ldAnoPassado);

		// COMPARANDO DATAS
		LocalDateTime hoje = LocalDateTime.now();
		LocalDateTime amanha = LocalDateTime.now().plusDays(1);

		// TESTES
		boolean testaData = hoje.isBefore(amanha);
		boolean testaData2 = hoje.isAfter(amanha);
		boolean testaData3 = hoje.isEqual(amanha);


		System.out.println("comparando datas: " + testaData);
		System.out.println("comparando datas: " + testaData2);
		System.out.println("comparando datas: " + testaData3);

		YearMonth ym = YearMonth.from(hoje);
		System.out.println("mes: " + ym.getMonth() + " ano: " + ym.getYear());

		// OUTROS ENUMS
		System.out.println( Month.DECEMBER.firstMonthOfQuarter() ); // october
		System.out.println( Month.DECEMBER.plus(2) ); 				// february
		System.out.println( Month.DECEMBER.minus(1) );				// november

	}

}