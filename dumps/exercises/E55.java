
	// Given the code fragment:
	class Test {
		public static void main(String[] args) {
			int iVar = 100;
			float fVar = 100.100f;
			double dVar = 123;

			iVar = fVar;
			fVar = iVar;
			dVar = fVar;
			fVar = dVar;
			dVar = iVar;
			iVar = dVar;			
		}
	}

	/* WHAT IS THE RESULT ?
		A) LINE 9
		B) LINE 10
		C) LINE 11
		D) LINE 12
		E) LINE 13
		F) LINE 14
	*/