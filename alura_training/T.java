class Animal {
	void eat() {
		System.out.println("animal eat");
	}
}

class Fish extends Animal {
	void swim() {
		System.out.println("Fish swim");
	}
}

class t {
	public static void main(String[] args) {
		
		Animal an1 = new Fish();
		Animal an2 = new Animal();
		
		an2 = an1;
		((Fish) an2).swim();
		
	}
}