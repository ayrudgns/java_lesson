package koreait.day10;

public class ConstructorTest2 {
	public static void main(String[] args) {
		
	}

}

class Product2 {
	int price;

	// �θ�Ŭ������ ����Ʈ �����ڸ� �����ؼ� �ڽ�Ŭ������ ����� �� �ֵ��� �Ѵ�. (�ι�° ���)
	public Product2() {
	}
	
	public Product2(int price) {		// Ŀ���� ������
		this.price = price;
	}
}

class Food2 extends Product2 {
	// Food2 ����Ʈ �����ڴ� �ڵ����� �����Ѵ�.
	// �θ�Ŭ������ Product2() ����Ʈ ������ super() ȣ��
	// super() ���� �� Food2() ����Ʈ ������ ����
}

class Electronics2 extends Product2 {

	public Electronics2(int price) {
		super(price);		// �θ�Ŭ���� Ŀ���� ������ ����.
	}
}