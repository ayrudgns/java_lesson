package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest4 {
	// Animal Ŭ������ isDog, isCrow �׽�Ʈ	: �޼ҵ� ���� Object (������ ����)
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Dog poodle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		System.out.println();
		
		// �޼ҵ��� ���ڷ� Object Ÿ���� ��ü�� �޴� �޼ҵ�
		// �޼ҵ��� ���ڰ� Object Ÿ���� ���� ��~ �޴´�.
		System.out.println(Animal.isCrow(poodle));	// false
		System.out.println(Animal.isDog(poodle));	// true
		System.out.println(Animal.isDog("����"));	// false
		System.out.println(Animal.isDog(1));		// false
		System.out.println(Animal.isCrow(animal));	// false
		System.out.println(Animal.isCrow(crow));	// true
		System.out.println(Animal.isCrow(animal2));	// true
		System.out.println(Animal.isCrow("���"));	// false
	}
}
