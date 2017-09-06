import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

class DurationTeste {
	public static void main(String[] args) {
		
		Instant inst = Instant.now();
		Duration d = Duration.ofSeconds(10);
		Instant inst2 = inst.plus(d);
		System.out.println(inst);
		System.out.println(inst2);

		long segundosDiferenca = Duration.between(inst, inst2).getSeconds();
		System.out.println(segundosDiferenca);




	}
}