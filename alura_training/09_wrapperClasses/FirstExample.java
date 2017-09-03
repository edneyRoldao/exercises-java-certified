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

		Integer i = new Integer("10");
		Double d = new Double("75.45");
		Boolean b = new Boolean("true");
		Boolean b2 = new Boolean("gggg"); // false

		// all of them does have a method to convert to string called toString()
		String s = i.toString();

		// We might retrieve their primitive value
		double d2 = d.doubleValue();

		// convert string as wrapper
		long l = Long.parseLong("444");

		// OR
		long l2 = Long.valueOf("344");
		

	}
}