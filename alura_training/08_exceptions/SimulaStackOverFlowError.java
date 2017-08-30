class TestaStackOverFlow {

	void chamaRecursivo() {
		chamaRecursivo();
	}

	public static void main(String[] args) {
		new TestaStackOverFlow().chamaRecursivo();
	}

}

/*
	$ java TestaStackOverFlow
	Exception in thread "main" java.lang.StackOverflowError
	    at TestaStackOverFlow.chamaRecursivo(SimulaStackOverFlowError.java:4)
	    at TestaStackOverFlow.chamaRecursivo(SimulaStackOverFlowError.java:4)
	    at TestaStackOverFlow.chamaRecursivo(SimulaStackOverFlowError.java:4)
	    at TestaStackOverFlow.chamaRecursivo(SimulaStackOverFlowError.java:4)
	    at TestaStackOverFlow.chamaRecursivo(SimulaStackOverFlowError.java:4)
*/