package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {
	public static void main(String[] args) {
		Animal ani1 = new Frog();			// ��(up)ĳ���� : �θ��� ��ü Ÿ��(Animal)���� �ڽ�(Frog)�� ����(ani1)�Ѵ�. (�ڵ���ȯ)
		Animal ani2 = new Cat();			// <-> �ٿ�(down)ĳ���� : ������ȯ
		
		Dog poodle = new Dog();
		Crow crow = new Crow();
		// �ڽ� ��ü�� ������ �� �θ�Ŭ���� ��ü�� �����ϸ鼭 �θ�Ŭ���� ������ ����.
		System.out.println();
		
		System.out.println(":::::::::::::::::::::::::::::::::");
		// animal �޼ҵ� ����, ���� Ÿ���� Animal Ÿ��
		animal(ani1);			// instanceof ����  3��° �� true : ani1 ������ Animal Ŭ���� Ÿ�� ����, ��ü�� Frog Ŭ���� Ÿ�� ����
		System.out.println();
		animal(ani2);			// instanceof ����  4��° �� true : ani2 ������ Animal Ŭ���� Ÿ�� ����, ��ü�� Cat Ŭ���� Ÿ�� ����
		System.out.println();
		animal(poodle);			// instanceof ����  1��° �� true : poodle ������ Animal Ŭ���� Ÿ�� ����, ��ü�� Dog Ŭ���� Ÿ�� ����
		System.out.println();
		animal(crow);			// instanceof ����  2��° �� true : crow ������ Animal Ŭ���� Ÿ�� ����, ��ü�� Crow Ŭ���� Ÿ�� ����
		System.out.println();
		animal(new Frog());		// instanceof ����  3��° �� true : ������ new Frog() ��ü Frog Ŭ���� Ÿ�� ����
		// �� Animal a = new Frog();
		// �� animal(a);				// Line 21�� Line 22, 23���� a�� �����ϰ� ���ٷ� ���� �Ͱ� ����.
	}
	
	// ������
	public static void animal(Animal animal) {		// ���� 1: �޼ҵ� ���� Ÿ��(�Ǵ� ����Ÿ��)�� Animal Ÿ��
													//		 ==> Animal, Dog, Crow, Frog, Cat ��ü ��� ����
		// ���� ���� 2 : �޼ҵ� ������
		animal.act();		// animal ��ü �ν��Ͻ� Ÿ�Կ� ���� ����Ǵ� act�� �ٸ���.
		
		animal.print();	
		// ���ڷ� �������� ���޹��� animal ��ü�� �����ϴ� ���� ��¥ Ÿ��(�ν��Ͻ��� Ÿ��)�� �˻� : instanceof ����.
		// ���� ==> (��ü�������� instanceof Ŭ������)
		// true or false�� �����ڱ�
		System.out.println("dog ? " + (animal instanceof Dog));
		System.out.println("crow ? " + (animal instanceof Crow));
		System.out.println("frog ? " + (animal instanceof Frog));
		System.out.println("cat ? " + (animal instanceof Cat));
		
		// Animal(�θ� Ÿ��) ������ �ڽ�Ŭ���� �ʵ�� �޼ҵ忡 ������ �� ����.
//		animal.jump();		// Frog
//		animal.run();		// Dog
//		animal.fly();		// Crow
//		animal.sound();		// Cat
		
		Cat cat;		// Cat Ÿ���� �������� ����
		Dog dog;
		Frog frog;
		Crow crow;
		
		if(animal instanceof Cat) {
			cat = (Cat)animal;	// �ٿ�(Down)ĳ���� : animal�� ��¥ ��ü Ÿ�Կ� ���� ���� �Ǵ� ���� ����.
//													==> instanceof ���ǽ��� �ʿ��ϴ�.
			cat.sound();		// �ش� �޼ҵ带 �����ϸ鼭 setName, setColor
		}
		if(animal instanceof Dog) {
			dog = (Dog)animal;
			dog.run();			// �ش� �޼ҵ带 �����ϸ鼭 setName, setColor
		}
		if(animal instanceof Frog) {
			frog = (Frog)animal;
			frog.jump();		// �ش� �޼ҵ带 �����ϸ鼭 setName, setColor
		}
		if(animal instanceof Crow) {
			crow = (Crow)animal;
			crow.fly();			// �ش� �޼ҵ带 �����ϸ鼭 setName, setColor
		}
		animal.print();		// animal�� ��¥ ��ü Ÿ�Կ� ���� name, color ���
	}		// animal() �޼ҵ� ��.
}


class Frog extends Animal{	// ������
	
	protected String mouth;	// ���� ��� ���� : default ������(���� ��Ű��) + �ٸ� ��Ű���� �ڽ�Ŭ����
	
	public Frog() {
		System.out.println("���ο� ���� ������ frog");
	}
	
	public void jump() {
		setName("������");
		setColor("�ʷϻ�");
		System.out.println("Ư¡ : ����");
	}
	
	// ������ ���� : �޼ҵ� �������̵�  *����! �޼ҵ� �����ε�(overloading)���� �ٸ�, �򰥸��� �ʰ� ����!*
	// �޼ҵ� �������̵�� "�θ�Ŭ������ �޼ҵ带 �������ϴ� ��!" �����ͼ� Ȱ���ϴ� �����̱�.
	// �̶� ���ڿ� ����Ÿ���� �����ϰ� �Ѵ�.
	@Override		// annotation (�ֳ����̼�) : �ڵ�(�Ǵ� ����)�� �� ���� �Ǵ� �ּ�.
	public void act() {
//		super.act();		// �θ�Ŭ������ act() ���� : ��������. ���ʿ�� �ּ�ó��.
		System.out.println("Animal �ൿ : ���÷� �����ϱ�");
	}
}

class Cat extends Animal{	// �����
	
	protected String eyes;
	
	public Cat() {
		System.out.println("���ο� ���� ������ cat");
	}
	
	public void sound() {
		setName("�����");
		setColor("�Ͼ��");
		System.out.println("Ư¡ : �߿˾߿�");
	}
	
	@Override
	public void act() {
		System.out.println("Animal �ൿ : ���÷� �߿˾߿� ���");
	}
}
