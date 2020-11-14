package by.academy.lesson6;

public class Application {

	public static void main(String[] args) {
		Person seller = new Person("Вася", 2000.00);
		Person byer = new Person("Петя", 3000.00);

		Product[] products = new Product[5];
		products[0] = new Product(10.00, "fruits", "apple", 50);
		products[1] = new Product(7.00, "fruits", "peach", 70);
		products[2] = new Product(3.00, "fruits", "banana", 45);
		products[3] = new Milk(15.00, "milk", "milk", 5, "black");
		products[4] = new Meat(20.00, "meat", "pig", 10, "свинина");


		Deal firstDeal = new Deal("1 January", byer, seller, products);
		firstDeal.result();
	}

}
