package by.academy.lesson6;

public class Meat extends Product {
	String breed;

	public Meat(double price, String type, String name, int quantity, String breed) {
		super(price, type, name, quantity);
		this.breed = breed;
	}

	protected double calcDiscount() {
		if (quantity > 10) {
			return 0.85;
		}
		return 1;
	}

}
