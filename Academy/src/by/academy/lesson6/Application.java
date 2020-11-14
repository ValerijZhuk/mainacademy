package by.academy.lesson6;

public class Application {

	public static void main(String[] args) {
		Person seller = new Person("Вася", 200.00);
		Person byer = new Person("Петя", 300.00);

		Product[] products = new Product[3];
		products[0] = new Product(10.00, "fruits", "apple", 5);
		products[1] = new Product(7.00, "fruits", "peach", 7);
		products[2] = new Product(3.00, "fruits", "banana", 15);

		Deal firstDeal = new Deal("1 January", byer, seller, products);
		firstDeal.result();
	}

}
