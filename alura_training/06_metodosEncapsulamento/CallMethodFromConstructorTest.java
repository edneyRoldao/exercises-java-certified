class CallMethod {
	String name;

	CallMethod(String n) {
		printName();
		name = n;
	}

	void printName() {
		System.out.println(name.length());
	}

}

public class CallMethodFromConstructorTest {
	public static void main(String[] args) {

		// We have a nullPointer, just because the var member is being assigned after call method.
		new CallMethod("edney").printName();

		/*
			Let's pretend that we have the same scenario, but in bit different way:
			A parent class with method print without .length() and child class that override print
			method with nome.length();

			If you call parent constructor from child class, we'll facing the same problem. nullPointer, because
			the print method from child that will be invoked.

			One way the avoid this problem, is change access modifier from parent method to private.
		*/
			
	}
}