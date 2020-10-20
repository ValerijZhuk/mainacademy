package by.academy.classwork.lesson1;

public class Cat {
	
		int age = 0;
		String nickname;
		double money = 1000;
		char initials = 'V';
		boolean isHomeAnimal = true;
		
		public void grow(){
			age = age + 1;
			}
		public void sleep(){
			System.out.println("Кот спит");
			}
		public void eat(){
			System.out.println("Кот ест");
			}
		public void walk(){
			System.out.println("Кот гуляет");
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
		public void setInitials (char initials) {
			this.initials = initials;
			}
		public char getInitials () {
			return initials;
		}
		public void setIsHomeAnimal (boolean isHomeAnimal) {
			this.isHomeAnimal = isHomeAnimal;
			}
		public boolean isHomeAnimal () {
			return isHomeAnimal;
		}
}