package by.academy.lesson6;

public class Meat extends Product{
	String breed;

	public Meat(double price, String type, String name, int qualitity, String breed) {
		super(price, type, name, qualitity);
		this.breed = breed;
	}
	
	protected double calcDiscount() {
		if(qualitity > 10) {
			return 0.85;
		}
		return 1;
	}

}
