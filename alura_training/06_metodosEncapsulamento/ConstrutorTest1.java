public class ConstrutorTest1 {
	// The default constructor follow the same access modifier from its class, therefore it can be:
	// private, protected, public, default

	int length = getNameLength(); // when we try to call this method it will throw a nullPointException								  
	String name = "edney";       // the literal value will be assigned after call method.

	public int getNameLength() {
		return name.length();
	}

	public static void main(String[] args) {
		new ConstrutorTest1().getNameLength(); // nullPointerException
	 } 

}