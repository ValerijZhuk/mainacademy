package by.academy.classwork.lesson1;

public class Application {
	public static void main(String[] args) {
	Cat Cat = new Cat();
	Cat NameCat = new Cat("����");
	NameCat.sleep();
	NameCat.eat();
	NameCat.walk();
	Cat.grow();
	Cat.grow();
	Cat.grow();
	System.out.println("����������� ���� " + Cat.age + " ����");
	System.out.println(Cat.getMoney());
	System.out.println(Cat.getInitials());
	System.out.println(Cat.isHomeAnimal());
	}
}
