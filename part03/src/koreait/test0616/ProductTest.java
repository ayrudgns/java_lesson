package koreait.test0616;

public class ProductTest {
// �ۼ��� : �̰���
	public static void main(String[] args) {
		
//		Bike bike = new Bike();
//		System.out.println(bike.sell(20));		// [4]�� ������ Ȯ��.
//		Electronics tv = new Electronics();
//		System.out.println(tv.sell("�����"));	// [5]�� ������ Ȯ��.

		// [13] ����
		Product[] cart = new Product[10];
		
		cart[0] = new Bike(123000, "MTB", 25);
		cart[1] = new Electronics(35000, "USB");
		cart[3] = new Bike(99000, "��õ��", 15);
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg �����");
		// [13] ��
/*		
		// [14] ����			// ������
		Electronics tmp = (Electronics)cart[7];		// �ٿ�ĳ����
		System.out.println("[14]�� power() �޼ҵ� ������ : " + tmp.power(0.9));
		// [14] ��
*/
		// ������ : �� �������� �˷���µ� �̰� �� �Ⱦ���..
		Electronics tmp = (Electronics)cart[7];
		tmp.setKwh(0.9);
		System.out.println(tmp.power());
		
		System.out.println();
		
		// [15] ����	
		for(Product pd : cart) {
			if(pd != null && pd.price >= 100000) {
				System.out.println(pd);		// .toString() ����.
			}
		}
		// [15] ��
		System.out.println();
		
		// [16] ����			// ������
//		for(int i = 0; i < cart.length; i++) {
//			if(cart[i] instanceof Bike && cart[i] != null) {
//				Bike bike = (Bike)cart[i];			// �ٿ�ĳ����
//				System.out.println(i + "�� �ε����� �������Դϴ�.");
//				System.out.println( i + "�� �ε����� ride() �޼ҵ� ���� ��� : " + bike.ride(bike.getSpeed()));
//			}
//		}
		// [16] ��
		
		for(Product bk : cart) {		// [16] ������
			if(bk != null && bk instanceof Bike) {
				Bike bk2 = (Bike)bk;
				System.out.println(bk2.ride());
			}
		}
	}		// main�� ����.

}

class Electronics extends Product {
	
	@Override
	public String sell(Object obj) {
		return String.format("���� ��ǰ - %s (1set)", obj);		// [5]
	}
	
	private double kwh;		// [8]
	
	public double getKwh() {		// [8]
		return kwh;
	}
	
	public void setKwh(double kwh) {		// [8]
		this.kwh = kwh;
	}
	
	public Electronics() {		// [9]
		
	}
	
	public Electronics(int price, String prdName) {		// [9]
		this.price = price;
		this.prdName = prdName;
	}
/*
	public double power(double kwh) {				// [11] ������
		return kwh * 24;
	}
*/
	
	public double power() {				// [11] ������
		return kwh * 24;
	}

	@Override
	public String toString() {			// [12]
		return "Electronics [kwh = " + kwh + ", price = " + price + ", prdName = " + prdName + "]";
	}
/*	
	10�� �ʵ尪 Ȱ�� ���Ͽ� -2����
	11�� �ʵ尪 Ȱ�� ���Ͽ� -2����
	14�� 10���� ������ ���� -3����
	16�� 11���� ������ ���� -3����
*/	

}
