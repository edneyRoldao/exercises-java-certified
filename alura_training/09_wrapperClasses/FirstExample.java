class FirstExample {
	public static void main(String[] args) {
		
		
		/*	byte    = Byte
			short   = Short
			char    = Character
			int     = Integer
			long    = Long
			float   = Float
			double  = Double
			boolean = Boolean */

		// Tipos de construtor
		// Double d1 = new Double(); nao existe construtor vazio.
		Double d2 = new Double(25.30);
		Double d3 = new Double("33.44");

		Boolean b1 = new Boolean("true");  // true
		Boolean b2 = new Boolean("gggg"); // false
		Bollean b3 = new Bollean(false);
		Boolean b2 = new Boolean("TrUe");  // true


		// all of them does have a method to convert to string called toString()
		String s = i.toString();

		// We might retrieve their primitive value
		double dd = d.doubleValue();

		// convert string as wrapper
		long l = Long.parseLong("444");

		// OR
		long l2 = Long.valueOf("344");
		

	}
}