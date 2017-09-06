import java.util.*;
import java.util.function.*;
import static java.util.Comparator.comparing;

class FirstSample {
	public static void main(String[] args) {
		
		List<Cliente> lista = new Cliente().getLista();

		// lista.sort(comparing(Cliente::getMensalidadeEscola));
		// lista.forEach(Cliente::printName);

		// Usando Streams de collections (fluent interface)
		lista.stream()
			.filter(c -> c.getMensalidadeEscola() < 900.00)
			.map(Cliente::getAge)
			.forEach(System.out::println);

		double somaMensalidades = lista
					.stream()
					.mapToDouble(Cliente::getMensalidadeEscola)
					.sum();

		System.out.println(somaMensalidades); // 2225.2

	}
}



class Cliente {
	private String name;
	private int age;
	private double mensalidadeEscola;

	Cliente() {}
	
	Cliente(String n, int a, double m) {
		name = n;
		age = a;
		mensalidadeEscola = m;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Integer getNameSize() {
		return name.length();
	}

	public double getMensalidadeEscola() {
		return mensalidadeEscola;
	}

	public void printName() {
		System.out.println(name);
	}
	
	@Override
	public String toString() {
		String text = "Cliente [name=" + name + ", age=" + age + "]";
		System.out.println(text);
		return text;
	}
	public List<Cliente> getLista() {
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("Nadine Carlos Roldao", 14, 915.20));
		clientes.add(new Cliente("Edney Roldao", 35, 0.0));
		clientes.add(new Cliente("Giselle Nogueira Roldao", 29, 950.00));
		clientes.add(new Cliente("Marjorie Nogueira Roldao", 1, 360.00));
		return clientes;
	}
}