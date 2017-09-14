	
	// Person.java
	public class Person {
		String name;
		int age;

		public Person(String n, int a) {
			name = n;
			age = a;
		}

		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
	}

	// Test.class
	import java.util.*;
	import java.util.function.*;

	class Test {
		public static void checkAge(List<Person> list, Predicate<Person> pred) {
			for(Person p : list) {
				if(pred.test(p)) {
					System.out.println(p.name + " ");
				}
			}
		}

		public static void main(String[] args) {
			List<Person> iList = Arrays.asList(new Person("Hank", 45),
											   new Person("Charlie", 40),
											   new Person("Smith", 38));

			// Line n1
		}
	}

	/*	Which code fragment, when inserted at line n1, enables the code
	    to print Hank ?
		A) checkAge(iList, () -> p.getAge() > 40);
		B) checkAge(iList, Person p -> p.getAge() > 40);
		C) checkAge(iList, p -> p.getAge() > 40);
		D) checkAge(iList, (Person p) -> {p.getAge() > 40;});
	*/
