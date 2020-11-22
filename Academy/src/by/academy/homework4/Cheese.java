package by.academy.homework4;

public final class Cheese extends Product {
	public Cheese(double price, String type, String producerName, int quantity) {
		super(price, type, producerName, quantity);
	}

	@Override
	public double discount() {
		if (quantity > 5) {
			return 0.9;

		}
		return 1;
	}

}
