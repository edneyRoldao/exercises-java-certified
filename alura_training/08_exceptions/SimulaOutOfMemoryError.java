class OutOfMemoryErrorTest {
	public static void main(String[] args) {
		
		boolean testa = true;
		StringBuilder sb = new StringBuilder();

		while(testa) {
			sb.append("vamos estourar a memoria");
		}
	}
}

/*
	$ java OutOfMemoryErrorTest
	Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3332)
	at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
	at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:448)
	at java.lang.StringBuilder.append(StringBuilder.java:136)
	at OutOfMemoryErrorTest.main(SimulaOutOfMemoryError.java:8)
*/