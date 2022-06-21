package koreait.day11;

import koreait.day09a.Animal;

public class AShapeTest2 {
	// �͸� Ŭ���� : anonymous ==> �̸��� ���� Ŭ����
	public static void main(String[] args) {
		
		// Line(��)
		// �͸��� ����(Inner)Ŭ���� ���� ==> 1ȸ�� Ŭ���� ����(�߻�޼ҵ� ������ �ʼ�)
		AShape sha = new AShape() {
			// �߻�޼ҵ� ������
			@Override
			public double getArea() { return width + height; }
		};
		
		AShape sha2 = new AShape(20, 13) {
			@Override
			public double getArea() { return width + height; }
		};
		
		System.out.println("sha�� ���� = " + sha.getArea());
		System.out.println("sha2�� ���� = " + sha2.getArea());
		
//		����: �߻�Ŭ���� �ƴ� ���� �޼ҵ� �������ؼ� ���� �͸�Ŭ���� ó�� �� �� ����?
//		Ȯ���ϱ�: �����ϴ�. Line 28 ~ 45; �׷��� ������ �߻�޼ҵ带 �����ϸ� �͸�Ŭ������ ���� ����.
		
		Animal snake = new Animal() {
			int length;
			
			@Override
			public void act() {
				setName("�̱��Ƴ�");
				setColor("�����");
				length = 3;
				System.out.println("action : ���ٴϱ�");
			}
			
			@Override
			public String toString() {
				return "length = " + length;
			}
		};
		snake.act();
		System.out.println(snake);
	}

}
