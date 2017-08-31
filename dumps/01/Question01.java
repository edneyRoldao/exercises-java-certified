class Product {
	double price;
}

class Question01Test {

	public void update(Product product, double price) {
		price = price * 2;
		product.price = product.price + price;
	}

	public static void main(String[] args) {
		Product prt = new Product();
		prt.price = 200;
		double newPrice = 100;

		Question01Test t = new Question01Test();
		t.update(prt, newPrice);

		System.out.println(prt.price + " : " + newPrice);
	}

}

/*
	A) 200.0 : 100.0
	B) 400.0 : 200.0
	C) 400.0 : 100.0
	D) compilation fails
*/