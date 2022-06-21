package koreait.day09a;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("--------------------------------");
		
		Dog dog = new Dog();		// dog ��ü(�ڽ�Ŭ����)�� �������� ��, �θ�Ŭ������ �⺻�����ڵ� ����.
		dog.run();					// �� dog ��ü(�ڽ�Ŭ����)�� �⺻�����ڸ� �����ϸ� ���������� �����.
		dog.print();	// ��ӹ��� �޼ҵ�
		System.out.println("--------------------------------");
		
		Crow crow = new Crow();		// crow ��ü�� �������� ��, �θ�Ŭ������ �⺻�����ڵ� ����.
		crow.fly();					// �� crow ��ü�� �⺻�����ڸ� �����ϸ� ���������� �����.
		crow.print();	// ���������� ��ӹ��� �޼ҵ�
		System.out.println("--------------------------------");
		
		System.out.println("::::::::::::::::::::::::::::::::");
		Animal temp = dog;		// �ڽ� ��ü�� �θ�Ŭ���� Ÿ������ ������ �� �ִ�. (�ڽ�Ŭ������ �θ�Ŭ���� Ÿ������ �ڵ� Casting)
		temp.print();
//		temp.run();			// ��, �θ�Ÿ�� �����δ� �ڽ� �޼ҵ带 ������ �� ����. (���� �߻�)
		temp = crow;			// �ڽ� ��ü�� �θ�Ŭ���� Ÿ������ ������ �� �ִ�.
		temp.print();
//		temp.fly();			// ��, �θ�Ÿ�� �����δ� �ڽ� �޼ҵ带 ������ �� ����. (���� �߻�)
		
		System.out.println("--------------------------------");
		Animal puppy = new Dog();		// �θ�� �ڽ��� �����Ѵ�. (Line 21�� ��������)
		puppy.print();
//		puppy.run();		// ���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ带 ������ �� ����!
		
		Dog poodle = (Dog)puppy;		// Animal Ÿ��(puppy)�� Dog Ÿ������ ���� Casting. (�ڽ�Ŭ���� Dog ��ü�̹Ƿ� �����ϴ�.)
		poodle.run();					//  �� puppy ������ �����ϴ� ��ü�� Dog Ÿ���� ���� �����ϴ�.
		poodle.print();
	}
}
