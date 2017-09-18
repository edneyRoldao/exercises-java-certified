import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

class DifEntreDatas {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime another = LocalDateTime.of(1982, 5, 10, 11, 30, 10);

		Duration duracao = Duration.between(another, now);
//		System.out.println(duracao.getYears());
//		System.out.println(duracao.getMonths());
		System.out.println(duracao.toHours());		
		System.out.println(duracao.toMinutes());
		System.out.println(duracao.getSeconds());
		
		LocalDate now2 = LocalDate.now();
		LocalDate another2 = LocalDate.of(1982, 5, 10);

		System.out.println(ChronoUnit.DAYS.between(another, now));
		System.out.println(ChronoUnit.MINUTES.between(another, now));

		Period periodo = Period.between(another2, now2);
		System.out.println(periodo.getDays());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getYears());
		// System.out.println(periodo.getMinutes()); does not exists

	}
}