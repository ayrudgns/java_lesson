package koreait.day09a;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("--------------------------------");
		
		Dog dog = new Dog();		// dog 객체(자식클래스)를 생성했을 때, 부모클래스의 기본생성자도 실행.
		dog.run();					// ㄴ dog 객체(자식클래스)의 기본생성자를 생성하면 마찬가지로 실행됨.
		dog.print();	// 상속받은 메소드
		System.out.println("--------------------------------");
		
		Crow crow = new Crow();		// crow 객체를 생성했을 때, 부모클래스의 기본생성자도 실행.
		crow.fly();					// ㄴ crow 객체의 기본생성자를 생성하면 마찬가지로 실행됨.
		crow.print();	// 마찬가지로 상속받은 메소드
		System.out.println("--------------------------------");
		
		System.out.println("::::::::::::::::::::::::::::::::");
		Animal temp = dog;		// 자식 객체는 부모클래스 타입으로 참조할 수 있다. (자식클래스는 부모클래스 타입으로 자동 Casting)
		temp.print();
//		temp.run();			// 단, 부모타입 변수로는 자식 메소드를 실행할 수 없다. (오류 발생)
		temp = crow;			// 자식 객체는 부모클래스 타입으로 참조할 수 있다.
		temp.print();
//		temp.fly();			// 단, 부모타입 변수로는 자식 메소드를 실행할 수 없다. (오류 발생)
		
		System.out.println("--------------------------------");
		Animal puppy = new Dog();		// 부모로 자식을 참조한다. (Line 21과 마찬가지)
		puppy.print();
//		puppy.run();		// 오류 : 부모타입 변수로는 자식 메소드를 실행할 수 없다!
		
		Dog poodle = (Dog)puppy;		// Animal 타입(puppy)을 Dog 타입으로 강제 Casting. (자식클래스 Dog 객체이므로 가능하다.)
		poodle.run();					//  ㄴ puppy 변수가 참조하는 객체가 Dog 타입일 때만 가능하다.
		poodle.print();
	}
}
