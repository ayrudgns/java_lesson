package koreait.day10;

public class ConstructorTest {
	public static void main(String[] args) {
		
	}

}

class Product {
	int price;
	
	// (Ŀ���� �����ڸ� �����) ����Ʈ �����ڴ� �������� �ʴ´�.
	
	public Product(int price) {		// Ŀ���� ������
		this.price = price;
	}
}

class Food extends Product {	// Product() ����Ʈ ������ ���� ���� �� Food() ����Ʈ ������ ����
								// "�ڽ�Ŭ������ ������ �θ�Ŭ������ ����Ʈ �����ڸ� �����Ѵ�." => �����ڰ� ������ ���� �߻�
	public Food(int price) {		// Ŀ���� ������ ȣ�� (ù��° ���)
		super(price);
	}
}

class Electronics extends Product {	// Product() ����Ʈ ������ �����ϸ� ���� �߻�. ����Ʈ �����ڰ� �����ϱ�.
	
	public Electronics(int price) {
		super(price);			// super() ����Ʈ ������ ��ſ� �ڽ�Ŭ�������� Ŀ���� ������ ȣ��
	}
	
}