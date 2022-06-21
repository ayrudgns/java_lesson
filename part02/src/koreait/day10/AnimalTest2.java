package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {
	public static void main(String[] args) {
		Animal ani1 = new Frog();			// 업(up)캐스팅 : 부모의 객체 타입(Animal)으로 자식(Frog)을 참조(ani1)한다. (자동변환)
		Animal ani2 = new Cat();			// <-> 다운(down)캐스팅 : 강제변환
		
		Dog poodle = new Dog();
		Crow crow = new Crow();
		// 자식 객체가 생성될 때 부모클래스 객체를 생성하면서 부모클래스 생성자 실행.
		System.out.println();
		
		System.out.println(":::::::::::::::::::::::::::::::::");
		// animal 메소드 실행, 인자 타입은 Animal 타입
		animal(ani1);			// instanceof 연산  3번째 줄 true : ani1 변수는 Animal 클래스 타입 참조, 객체는 Frog 클래스 타입 참조
		System.out.println();
		animal(ani2);			// instanceof 연산  4번째 줄 true : ani2 변수는 Animal 클래스 타입 참조, 객체는 Cat 클래스 타입 참조
		System.out.println();
		animal(poodle);			// instanceof 연산  1번째 줄 true : poodle 변수는 Animal 클래스 타입 참조, 객체는 Dog 클래스 타입 참조
		System.out.println();
		animal(crow);			// instanceof 연산  2번째 줄 true : crow 변수는 Animal 클래스 타입 참조, 객체는 Crow 클래스 타입 참조
		System.out.println();
		animal(new Frog());		// instanceof 연산  3번째 줄 true : 생성된 new Frog() 객체 Frog 클래스 타입 참조
		// ㄴ Animal a = new Frog();
		// ㄴ animal(a);				// Line 21은 Line 22, 23에서 a를 생략하고 한줄로 줄인 것과 같다.
	}
	
	// 다형성
	public static void animal(Animal animal) {		// 예시 1: 메소드 인자 타입(또는 리턴타입)은 Animal 타입
													//		 ==> Animal, Dog, Crow, Frog, Cat 객체 모두 가능
		// 구현 예시 2 : 메소드 재정의
		animal.act();		// animal 객체 인스턴스 타입에 따라서 실행되는 act가 다르다.
		
		animal.print();	
		// 인자로 참조값을 전달받은 animal 객체가 참조하는 것의 진짜 타입(인스턴스의 타입)을 검사 : instanceof 연산.
		// 형식 ==> (객체참조변수 instanceof 클래스명)
		// true or false로 나오겠군
		System.out.println("dog ? " + (animal instanceof Dog));
		System.out.println("crow ? " + (animal instanceof Crow));
		System.out.println("frog ? " + (animal instanceof Frog));
		System.out.println("cat ? " + (animal instanceof Cat));
		
		// Animal(부모 타입) 참조는 자식클래스 필드와 메소드에 접근할 수 없음.
//		animal.jump();		// Frog
//		animal.run();		// Dog
//		animal.fly();		// Crow
//		animal.sound();		// Cat
		
		Cat cat;		// Cat 타입의 참조변수 선언
		Dog dog;
		Frog frog;
		Crow crow;
		
		if(animal instanceof Cat) {
			cat = (Cat)animal;	// 다운(Down)캐스팅 : animal의 진짜 객체 타입에 따라 오류 또는 오류 없음.
//													==> instanceof 조건식이 필요하다.
			cat.sound();		// 해당 메소드를 실행하면서 setName, setColor
		}
		if(animal instanceof Dog) {
			dog = (Dog)animal;
			dog.run();			// 해당 메소드를 실행하면서 setName, setColor
		}
		if(animal instanceof Frog) {
			frog = (Frog)animal;
			frog.jump();		// 해당 메소드를 실행하면서 setName, setColor
		}
		if(animal instanceof Crow) {
			crow = (Crow)animal;
			crow.fly();			// 해당 메소드를 실행하면서 setName, setColor
		}
		animal.print();		// animal의 진짜 객체 타입에 따라 name, color 출력
	}		// animal() 메소드 끝.
}


class Frog extends Animal{	// 개구리
	
	protected String mouth;	// 접근 허용 범위 : default 한정자(같은 패키지) + 다른 패키지의 자식클래스
	
	public Frog() {
		System.out.println("새로운 동물 가족은 frog");
	}
	
	public void jump() {
		setName("개구리");
		setColor("초록색");
		System.out.println("특징 : 점핑");
	}
	
	// 다형성 구현 : 메소드 오버라이드  *주의! 메소드 오버로딩(overloading)과는 다름, 헷갈리지 않게 조심!*
	// 메소드 오버라이드는 "부모클래스의 메소드를 재정의하는 것!" 가져와서 활용하는 느낌이군.
	// 이때 인자와 리턴타입은 동일하게 한다.
	@Override		// annotation (애너테이션) : 코딩(또는 실행)할 때 참고가 되는 주석.
	public void act() {
//		super.act();		// 부모클래스의 act() 실행 : 선택적임. 불필요시 주석처리.
		System.out.println("Animal 행동 : 수시로 점핑하기");
	}
}

class Cat extends Animal{	// 고양이
	
	protected String eyes;
	
	public Cat() {
		System.out.println("새로운 동물 가족은 cat");
	}
	
	public void sound() {
		setName("고양이");
		setColor("하얀색");
		System.out.println("특징 : 야옹야옹");
	}
	
	@Override
	public void act() {
		System.out.println("Animal 행동 : 수시로 야옹야옹 울기");
	}
}
