package by.academy.homework4;

public class Meat extends Product {
	public Meat(double price, String type, String producerName, int quantity) {
		super(price, type, producerName, quantity);
	}

	@Override
	public double discount() {
		if (producerName.contains("Bel")) {
			return 0.8;
		}
		return 1;
	}

}
