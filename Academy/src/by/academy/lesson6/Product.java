package by.academy.lesson6;

public class Product {
	double price;
	String type;
	String name;
	int qualitity;

	public Product() {
		super();
	}

	public Product(double price, String type, String name, int qualitity) {
		super();
		this.price = price;
		this.name = name;
		this.type = type;
		this.qualitity = qualitity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQualitity() {
		return qualitity;
	}

	public void setQualitity(int qualitity) {
		this.qualitity = qualitity;
	}

	protected double calcDiscount() {
		if (qualitity * price > 1000) {
			return 0.8;
		}
		return 1;

	}
}