package by.academy.homework4;

public class Application {

	public static void main(String[] args) {
		Person seller = new Person("Vasya", 200.00);
		Person buyer = new Person("Petya", 300.00);

		Deal deal = new Deal("21-11-2020", seller, buyer);

		deal.addProduct(new Meat(15.00, "1", "Academy Bel", 7));
		deal.addProduct(new Vine(7.00, "2", "peach", 7));
		deal.addProduct(new Milk(3.00, "3", "banana", 15, "black"));
		deal.addProduct(new Cheese(9.99, "4", "Hohland", 30));

		deal.printProducts();
//		deal.deleteProduct(2);
		System.out.println("---------------------------------------");
//		deal.printProducts();

		Person.americanPhoneValidator.isValid("+123123123");
		Person.belarusianPhoneValidator.isValid("+375292089295");
		Person.emailValidator.isValid("megabuyer@gmail.com");
		deal.deadLine();
//		deal.deal();

//		Product pTest = new Milk(3.00, "fruits", "banana", 15, "black");
//		Milk mtest = new Milk(10.00, "fruits", "apple", 5, "White");
//		Deal firstDeal = new Deal("1 January",buyer,seller);
//		firstDeal.printBill();

	}
}