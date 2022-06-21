package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest4 {
	// Animal 클래스의 isDog, isCrow 테스트	: 메소드 인자 Object (다형성 구현)
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Dog poodle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		System.out.println();
		
		// 메소드의 인자로 Object 타입의 객체를 받는 메소드
		// 메소드의 인자가 Object 타입일 때는 다~ 받는다.
		System.out.println(Animal.isCrow(poodle));	// false
		System.out.println(Animal.isDog(poodle));	// true
		System.out.println(Animal.isDog("동물"));	// false
		System.out.println(Animal.isDog(1));		// false
		System.out.println(Animal.isCrow(animal));	// false
		System.out.println(Animal.isCrow(crow));	// true
		System.out.println(Animal.isCrow(animal2));	// true
		System.out.println(Animal.isCrow("까마귀"));	// false
	}
}
