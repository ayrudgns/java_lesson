package koreait.test;

public class Bike extends Product {
// �ۼ��� : �̰���	
	
	@Override
	public String sell(Object obj) {		// [4]
		return String.format("�߰� ���� ��� - %d%% ����", obj);
	}

	private int speed;					// [6]
	
	public int getSpeed() {			// [6]
		return speed;
	}
	
	public void setSpeed(int speed) {		// [6]
		this.speed = speed;
	}
	
	public Bike() {					// [7]
		
	}
	
	public Bike(int price, String prdName, int speed) {		// [7]
		this.price = price;
		this.prdName = prdName;
		this.speed = speed;
	}
/*	
	public String ride() {			// [10] ������
		return "����� �̰��� �ü� " + speed + "km�� Ż �� �ֽ��ϴ�.";
	}
*/	
	

	public String ride() {			// [10] ������
		return "����� �̰��� �ü� " + speed + "km�� Ż �� �ֽ��ϴ�.";
	}

	
	@Override
	public String toString() {		// [12]
		return "Bike [speed = " + speed + ", price = " + price + ", prdName = " + prdName + "]";
	}

	
	
}
