import java.util.*;
import java.util.function.*;
import static java.util.Comparator.comparing;

class FirstSample {
	public static void main(String[] args) {
		List<Cliente> clientes = new Cliente().getLista();

//		sortByNameSizeWithoutLambda(clientes); 		// 15 linhas
//		sortByNameSizeWithoutLambda2(clientes);		// 17 linhas   
//		sortByNameSizeWithoutLambda3(clientes);		// 15 linhas
//		sortByNameSizeLambda(clientes);				//  4 linhas
//		sortByNameSizeLambda2(clientes);			//  2 linhas
		lambdaMaisEnxuto(clientes);					//  2 linhas

		// para fixar
		Function<Cliente, Integer> funcao1 = c -> c.getName().length();
		Function<Cliente, Integer> funcao2 = Cliente::getNameSize;
		Comparator<Cliente> comp1 = Comparator.comparing(c -> c.getName().length());
		Comparator<Cliente> comp2 = Comparator.comparing(Cliente::getNameSize);
		Comparator<Cliente> comp3 = comparing(c -> c.getName().length());
		Comparator<Cliente> comp4 = comparing(Cliente::getNameSize);
		Comparator<Cliente> comp5 = comparing(funcao1);
	}

	/* 
		Mais curto de todos usando:
		- import atatic e reference method.
		  (metodo com 2 linhas de codigo)
	 */ 
	public static void lambdaMaisEnxuto(List<Cliente> lista) {
		lista.sort(comparing(Cliente::getNameSize));
		lista.forEach(Cliente::printName);
	}


	/* 
		1 - loop tradicional com for
		2 - criação de um comparator com classe anônima
		(metodo com 15 linhas de codigo)
	 */ 
	public static void sortByNameSizeWithoutLambda(List<Cliente> lista) {
		
		// criando o comparator
		Comparator<Cliente> comparador = new Comparator<Cliente>() {
			@Override
			public int compare(Cliente c1, Cliente c2) {
				int l1 = c1.getName().length();
				int l2 = c2.getName().length();
				return Integer.compare(l1, l2);
			}
		};

		// ordenando
		Collections.sort(lista, comparador);

		// loop que imprime os nomes ordenados por tamanho
		for(Cliente cli : lista) {
			System.out.println(cli.getName());
		}
	}

	/* 
		1 - usando o forEach e o sort da interface List do java 8
		2 - criação de um comparator com classe anônima
		3 - criação de um consumer para usar no forEach com classe anônima
		(metodo com 17 linhas de codigo)
	 */ 
	public static void sortByNameSizeWithoutLambda2(List<Cliente> lista) {

		// criando o comparator
		Comparator<Cliente> comparador = new Comparator<Cliente>() {
			@Override
			public int compare(Cliente c1, Cliente c2) {
				int l1 = c1.getName().length();
				int l2 = c2.getName().length();
				return Integer.compare(l1, l2);
			}
		};

		// criando o consumer
		Consumer<Cliente> consumidor = new Consumer<Cliente>() {
			@Override
			public void accept(Cliente c) {
				System.out.println(c.getName());
			}
		};

		// Ordenando
		lista.sort(comparador);

		// imprimindo o resultado
		lista.forEach(consumidor);
	}

	/* 
		Mesmo exemplo acima de forma direta, sem criação de variávies
		temporárias
		(metodo com 15 linhas de codigo)
	 */ 
	public static void sortByNameSizeWithoutLambda3(List<Cliente> lista) {
		
		// Ordenando
		lista.sort(new Comparator<Cliente>() {
			@Override
			public int compare(Cliente c1, Cliente c2) {
				int l1 = c1.getName().length();
				int l2 = c2.getName().length();
				return Integer.compare(l1, l2);
			}
		});

		// imprimindo o resultado
		lista.forEach(new Consumer<Cliente>() {
			@Override
			public void accept(Cliente c) {
				System.out.println(c.getName());
			}
		});
	}

	/* 
		Usando lambda com a criação de variáveis temporárias
		(metodo com 4 linhas de codigo)
	 */ 
	public static void sortByNameSizeLambda(List<Cliente> lista) {
		Function<Cliente, Integer> funcao = c -> c.getName().length();
		Comparator<Cliente> comparador = Comparator.comparing(funcao);

		lista.sort(comparador);
		lista.forEach(c -> System.out.println(c.getName()));
	}

	/* 
		Usando lambda com a criação de variáveis temporárias
		(metodo com 2 linhas de codigo)
	 */ 
	public static void sortByNameSizeLambda2(List<Cliente> lista) {
		lista.sort(Comparator.comparing(c -> c.getName().length()));
		lista.forEach(c -> System.out.println(c.getName()));
	}

}

class Cliente {
	private String name;
	private int age;
	
	Cliente() {}

	Cliente(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	// metodo criado para reduzir a expressao lambda podr meio do
	// reference method.
	public Integer getNameSize() {
		return name.length();
	}

	// metodo criado para reduzir a expressao lambda podr meio do
	// reference method.
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
		clientes.add(new Cliente("Nadine Carlos Roldao", 14));
		clientes.add(new Cliente("Edney Roldao", 35));
		clientes.add(new Cliente("Giselle Nogueira Roldao", 29));
		clientes.add(new Cliente("Marjorie Nogueira Roldao", 1));
		return clientes;
	}

}