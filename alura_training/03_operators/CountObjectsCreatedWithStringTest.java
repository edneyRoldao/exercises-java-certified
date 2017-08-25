public class CountObjectsCreatedWithStringTest {
	public static void main(String[] args) {
		
		/*
			When we creating a String object by using literal vulues,
			something like below: 
				String a = "I'm a literal value";
			The JVM creates a String pool in order avoid create 
			String objects unnecessarily. If you create a String
			in a literal way and that value is present in String pool,
			both variable does have the same reference.
			Obs: String objects created with new operator, JVM won't use String pool.
		*/

		String a = "literal way";
		String b = "literal way";
		String c = new String("literal way");

		// we have just two objects created, a and b has the same reference,
		// because string pool system.

		System.out.println(a == b); // true
		System.out.println(a == c); // false

		/*--------------------   JVM WILL USE POOL   ----------------------------*/
		String ab = "a" + "b";
		System.out.println(ab == "ab"); // true

		String g = "g";
		System.out.println(g.toLowerCase() == g); // true
		System.out.println(g.toString() == g); // true

		/*--------------------   JVM WON'T USE POOL   ----------------------------*/
		String e = "e";
		String ef = e + "f";
		System.out.println(ef == "ef"); // false 
		// when we use concat with a reference, JVM won't use string pool.

		String txt = "i am just a simples text";
		String text = txt.substring(txt.length() - 4); // text
		System.out.println(text == "text"); // false
		// A string result from a method always will create a new String object.

		/*-------------------- COUNT OBJECTS ----------------------------*/

		// Here we have two object, the normal creted with new operator and the literal 
		// value that will thrown into String pool.
		String h = new String("hello "); // 2
		String h2 = "hello "; // 0 - hello already exists into String pool.
		String h3 = "world"; // 1

		System.out.println("hello "); // 0
		System.out.println(h + "world"); // 1
		System.out.println("Hello " == h1);		
	}
}