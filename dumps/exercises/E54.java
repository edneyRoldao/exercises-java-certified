
	// Given the definition of MyString class and the Test class:
	package p1;
	class MyString {
		String msg;
		MyString(String msg) {
			this.msg = msg;
		}
	}

	package p1;
	public class Test {
		public static void main(String[] args) {
			System.out.println("Hello " + new StringBuilder("Java SE 8"));
			System.out.println("Hello " + new MyString("Java SE 8"));
		}
	}

	/* WHAT IS THE RESULT ?
		A) Hello Java SE 8
		   Hello Java SE 8

		B) Hello java.lang.StringBuilder@<<hashcode1>>
		   Hello p1.MyString@<<hashcode2>>

		C) Hello Java SE 8
		   Hello p1.MyString@<<hashcode2>>

		D) Compilation fails at the Test class
	*/