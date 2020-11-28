package by.academy.lesson8_homework;

public class FowerApplication {
	
	static int flowers = 0;

	public static void main(String[] args) {
		Tulip tulip = new Tulip("Netherland", 10, 2.5);
		Rose rose = new Rose("Poland", 7, 5);
		Clove clove = new Clove("China", 15, 3);
		Chamomile chamomile = new Chamomile("Ukraine", 34, 4.99);
		
		Flower[] b1 = {rose, rose, rose, rose, rose, rose, rose, rose, rose};
		Flower[] b2 = {tulip, rose, chamomile, chamomile, chamomile, chamomile, chamomile};
		Flower[] b3 = {chamomile, chamomile, clove, clove, rose, rose, tulip, tulip, tulip};
		
		Bouquet bouquet1 = new Bouquet(b1);
		Bouquet bouquet2 = new Bouquet(b2);
		Bouquet bouquet3 = new Bouquet(b3);
		
		Bouquet[] bb = {bouquet1, bouquet2, bouquet3};
		
		System.out.println("Стоимость букета: " + bouquet1.calcSumm());
		System.out.println("Стоимость букета: " + bouquet2.calcSumm());
		System.out.println("Стоимость букета: " + bouquet3.calcSumm());
		
		for(Bouquet v: bb) {
			flowers += v.calcCol();
					
		}
		
		System.out.println("Количество проданных цветков: " + flowers);

	}

}
