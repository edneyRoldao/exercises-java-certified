	
// Given the code fragment:
class X {
	public void printFileContent() {
		/* code goes here */
		throw new IOException();
	}
}
class Test {
	public static void main(String[] args) {
		X xobj = new X();
		xobj.printFileContent();
	}
}

/* Which two modifications should you make so that the code
   compiles seccessfully ?

	A) replace line 10 with:
		  public static void main(String[] args) throws Exception {
	B) replace line 12 with:
		  try { xobj.printFileContent(); }
		  catch(Exception e) { }
		  catch(IOException e) { }
	C) replace line 4 with:
		  public void printFileContent() throws IOException {
	D) replace line 6 with:
		  throw IOException("Exception raised");
	E) At line 13, insert:
		  throw new IOException();
*/

