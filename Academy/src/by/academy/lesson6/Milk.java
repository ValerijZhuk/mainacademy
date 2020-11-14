package by.academy.lesson6;

public class Milk extends Product {
	String color;

	public Milk(double price, String type, String name, int qualitity, String color) {
		super(price, type, name, qualitity);
		this.color = color;
	}
	
	protected double calcDiscount() {
		if(name.contains("a")) {
			return 0.9;
		}
		return 1;
	}

}
