package by.academy.classwork.lesson1;

public class Cat {
	
		int age = 0;
		String nickname;
		double money = 1000;
		public void grow(){
			age = age + 1;
			}
		public void sleep(){
			System.out.println("��� ����");
			}
		public void eat(){
			System.out.println("��� ���");
			}
		public void walk(){
			System.out.println("��� ������");
			}
		public Cat(){
			// nothing
			}
		public Cat(String nickname){
			System.out.println(nickname);
			}
		public void setMoney (double money) {
			this.money = money;
		}
		public double getMoney () {
			return money;
		}

}
