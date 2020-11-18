package by.academy.lesson6;

public class Deal {
	String date;
	Person seller;
	Person buyer;
	Product[] products;

	public Deal() {
		super();
	}

	public Deal(String date, Person seller, Person byer, Product[] products) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = byer;
		this.products = products;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getByer() {
		return buyer;
	}

	public void setByer(Person byer) {
		this.buyer = byer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public double result() {
		double sum = 0;
		for (Product product : products) {
			sum += product.getPrice() * product.getQuantity();

		}
		if (sum > buyer.getCash()) {
			System.out.println("Недостаточно средств!");
		} else {
			printBill();
		}
		return 0;
	}

	private void printBill() {
		double sum = 0;
		System.out.println("Сделка совершена ");
		System.out.println(date);
		for (Product product : products) {
			double totalProductPrice = product.getPrice() * product.getQuantity() * product.calcDiscount();
			sum += totalProductPrice;
			System.out.println("Имя: " + product.getName() + " " + "цена " + product.getPrice() + " количество "
					+ product.getQuantity() + " = " + totalProductPrice);
			
		}
		
		System.out.println("Сумма всей сделки " + sum);
		buyer.setCash(buyer.getCash() - sum);
		seller.setCash(seller.getCash() + sum);
		System.out.println("Деньги покупателя " + buyer.getCash());
		System.out.println("Деньги продавца " + seller.getCash());

	}

}
