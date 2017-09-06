import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.Comparator.comparing;

class FirstSample2 {
	public static void main(String[] args) {
		
		List<Cliente> lista = new Cliente().getLista();

		List<Cliente> listaFiltrada = lista.stream()
			.filter(cliente -> cliente.getMensalidadeEscola() < 700.00)
			.collect(Collectors.toList());

		listaFiltrada.forEach(Cliente::printName);

		lista.stream()
			  .filter(cliente -> cliente.getMensalidadeEscola() < 700.00)
			  .collect(Collectors.toMap(m -> m.getName(), m -> m.getMensalidadeEscola()))
			  .forEach((chave, valor) -> {
		  		System.out.println("mensalidade " + chave + " custa " + valor);
			  });


		Optional<Cliente> filtroClientes = 
			lista.stream()
				 .filter(c -> c.getMensalidadeEscola() > 500)
				 .findAny();

		Cliente cli = filtroClientes.orElse(null);
		System.out.println(cli.toString());

		filtroClientes.ifPresent(Cliente::printName);

		OptionalDouble media = lista.stream()
								.mapToDouble(c -> c.getMensalidadeEscola())
								.average();
		System.out.println( media.getAsDouble() );


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
		return "Cliente [name=" + name + ", age=" + age + "]";
	}

	public List<Cliente> getLista() {
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("Nadine Carlos Roldao", 14, 915.20));
		clientes.add(new Cliente("Edney Roldao", 35, 123.67));
		clientes.add(new Cliente("Giselle Nogueira Roldao", 29, 950.00));
		clientes.add(new Cliente("Marjorie Nogueira Roldao", 1, 360.00));
		return clientes;
	}
}