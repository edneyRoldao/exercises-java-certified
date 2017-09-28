import java.util.*;
import java.time.*;
import java.time.temporal.*;

class A {
	public static void main(String[] args) {
		Date d = new Date();
		LocalDate ld = LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault()).toLocalDate();
		System.out.println(ld);
	}
}