/* ABOUT INITIALIZE LOCAL VARIABLES */

// New need to make sure that local variables must be initialized before its utilization.

// ERROR 01
public static void main(String[] args) {
	int age;
	System.out.println(age);
}

// ERROR 02
// There is no guarantee whether 'int age' will be initialized or not.
public static void main(String[] args) {
	int age;

	if(args.length == 0) {
		age = 10;
	}else {
		System.out.println("Age variable might not have been initialized");
	}

	System.out.println(age);
}

/* ABOUT INITIALIZE CLASS VARIABLES */

// They can be uninitialized, because they will be initialized with a default value.

// Default values:
public static void main(String[] args) {

	// todos numéricos
	int = 0
	long = 0
		char = 0 // they're numeric in java and it allow just positive values
	byte = 0
	short = 0

	// ponto flutuante (-infinity, +infinity or NaN)
	double = 0
	float = 0

	// unico diferente
	boolean = false

	Objects = null // (Wrapper classes are included)
}

//Arrays does have default values as well.



// int and double are default, other types we need to something like below:

long a = 10l;
long b = 10L;

// we need to explicity those letters, otherwise we got an error.
float a = 145.0F;
float b = 145.0f;