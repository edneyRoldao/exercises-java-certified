
	// Given the code fragment:
	class Person {
		String name;
		int age = 25;

		public Person(String name) {
			this();									// Line n1
			this.name = name;
		}

		public Person(String name, int age) {
			Person(name);							// Line n2
			setAge(age);
		}

		// Getter and Setter methods does here

		public String show() {
			return name + " " + age + " " + number;
		}  

		public static void main(String[] args) {
			Person p1 = new Person("Jesse");
			Person p2 = new Person("Walter", 52);
			System.out.println(p1.show());
			System.out.println(p2.show());
		}
	}

	/* WHAT IS THE RESULT ?
		A) Jesse 25		and 	Walter 52
		B) compilation fails only at line n1
		C) compilation fails only at line n2
		D) compilation fails at both line n1 and line n2
	*/