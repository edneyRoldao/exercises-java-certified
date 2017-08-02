/* Some sample errors */

// ERROR 01
public static void main(String[] args) {
	int age;
	System.out.println(age);
}

// ERROR 02
public static void main(String[] args) {
	int age;

	if(args.length == 0) {
		age = 10;
	}else {
		System.out.println("Age variable might not have been initialized");
	}

	System.out.println(age);
}
