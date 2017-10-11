class Employee {
	int salary;
}

class Manager extends Employee {
	int budget;
}

class Director extends Manager {
	int stockOptions;
}

class Test {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Director director = new Director();

		employee.budget = 200_000;
		manager.stockOption = 500; 
	}
}




















































// 		System.out.println("");
