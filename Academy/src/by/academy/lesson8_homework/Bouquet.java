package by.academy.lesson8_homework;

public class Bouquet {
	
	private Flower[] bouquet; 

	public Bouquet(Flower[] bouquet) {
		this.bouquet = bouquet;
		
	}
	public double calcSumm() {
		double priceFinal = 0;
		for(Flower p : bouquet) {
			priceFinal += p.price;
		}
		return priceFinal;
	}
	
	public int calcCol() {
		return bouquet.length;
		
	}

}
