package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest3 {
	// 다형성 구현 예시 3
	public static void main(String[] args) {
		// 부모타입 클래스의 배열 : 배열에는 Animal 타입 인스턴스 객체의 참조값이 저장된다.
		Animal[] animals = new Animal[10];
		
		animals[0] = new Frog();
		animals[1] = new Cat();
		animals[5] = new Dog();
		animals[7] = new Frog();
		animals[8] = new Crow();
		System.out.println();

		for(Animal temp : animals) {	// 배열에서 순서대로 하나씩 꺼내오기 : 없는건 안꺼낸다.
			System.out.println("###############");
			if (temp != null) {		// 매우 중요함! 이 문장이 없으면 에러남.
				
				Cat cat;
				Dog dog;
				Frog frog;
				Crow crow;
				
				if(temp instanceof Cat) {
					cat = (Cat)temp;	// 다운(down)캐스팅 : animal의 진짜 객체 타입에 따라 오류 또는 오류 없음.
//															==> instanceof 조건식이 필요하다.
					cat.sound();		// 해당 메소드를 실행하면서 setName, setColor
				}
				if(temp instanceof Dog) {
					dog = (Dog)temp;
					dog.run();			// 해당 메소드를 실행하면서 setName, setColor
				}
				if(temp instanceof Frog) {
					frog = (Frog)temp;
					frog.jump();		// 해당 메소드를 실행하면서 setName, setColor
				}
				if(temp instanceof Crow) {
					crow = (Crow)temp;
					crow.fly();			// 해당 메소드를 실행하면서 setName, setColor
				}
				temp.act();		// 재정의된 메소드가 있다면 자식클래스의 메소드가 실행된다.
				temp.print();		// 부모클래스에 정의된 메소드니까 가능하다.
			} else {
				System.out.println("null 참조입니다.");
			}
			System.out.println("###############");
			System.out.println();

		}
	}
}
