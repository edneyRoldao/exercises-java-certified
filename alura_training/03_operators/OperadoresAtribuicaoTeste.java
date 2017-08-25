public class OperadoresAtribuicaoTeste {
	public static void main(String[] args) {
		
		// byte -> short -> int -> long
		// float -> double
		// char

		// 	biggerScope = smallerScope
		//	smallerScope = (cast) biggerScope;

		// about char (it has the same scope from short, but does not allow negative values)
		// we can't assign char to short and the reverse without a cast

		// we might to assign a value from a type with smaller scope into a bigger one, but on the other hand,
		// the reverse we need to explicit by using cast.
		// Let's focusing on the first one:
		byte b = 127;
		char c = 10000;
		short s = 10000;
		int i = 20;
		long l = 100;

		float f = 30.0f;
		double d = 40.0;

		// double allow all of them:
		d = f;
		d = l;
		d = i;
		d = s;
		d = c;
		d = b;

		// float doesn't allow double without a cast because double it is the bigger one
		f = l;
		f = i;
		f = s;
		f = c;
		f = b;
		f = (float) d; // using casting explicitly - " possible lossy conversion from double to float "
		// and so on...

		// char to short and short to char (it is necessary apply a cast)
		c = (char) s;
		s = (short) c;

	}
}