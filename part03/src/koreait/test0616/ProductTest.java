package koreait.test0616;

public class ProductTest {
// 작성자 : 이경훈
	public static void main(String[] args) {
		
//		Bike bike = new Bike();
//		System.out.println(bike.sell(20));		// [4]번 실행결과 확인.
//		Electronics tv = new Electronics();
//		System.out.println(tv.sell("사운드바"));	// [5]번 실행결과 확인.

		// [13] 시작
		Product[] cart = new Product[10];
		
		cart[0] = new Bike(123000, "MTB", 25);
		cart[1] = new Electronics(35000, "USB");
		cart[3] = new Bike(99000, "삼천리", 15);
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg 냉장고");
		// [13] 끝
/*		
		// [14] 시작			// 제출답안
		Electronics tmp = (Electronics)cart[7];		// 다운캐스팅
		System.out.println("[14]번 power() 메소드 실행결과 : " + tmp.power(0.9));
		// [14] 끝
*/
		// 모범답안 : 야 모범답안을 알려줬는데 이걸 왜 안쓰냐..
		Electronics tmp = (Electronics)cart[7];
		tmp.setKwh(0.9);
		System.out.println(tmp.power());
		
		System.out.println();
		
		// [15] 시작	
		for(Product pd : cart) {
			if(pd != null && pd.price >= 100000) {
				System.out.println(pd);		// .toString() 생략.
			}
		}
		// [15] 끝
		System.out.println();
		
		// [16] 시작			// 제출답안
//		for(int i = 0; i < cart.length; i++) {
//			if(cart[i] instanceof Bike && cart[i] != null) {
//				Bike bike = (Bike)cart[i];			// 다운캐스팅
//				System.out.println(i + "번 인덱스는 자전거입니다.");
//				System.out.println( i + "번 인덱스의 ride() 메소드 실행 결과 : " + bike.ride(bike.getSpeed()));
//			}
//		}
		// [16] 끝
		
		for(Product bk : cart) {		// [16] 모범답안
			if(bk != null && bk instanceof Bike) {
				Bike bk2 = (Bike)bk;
				System.out.println(bk2.ride());
			}
		}
	}		// main문 종료.

}

class Electronics extends Product {
	
	@Override
	public String sell(Object obj) {
		return String.format("묶음 상품 - %s (1set)", obj);		// [5]
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
	public double power(double kwh) {				// [11] 제출답안
		return kwh * 24;
	}
*/
	
	public double power() {				// [11] 모범답안
		return kwh * 24;
	}

	@Override
	public String toString() {			// [12]
		return "Electronics [kwh = " + kwh + ", price = " + price + ", prdName = " + prdName + "]";
	}
/*	
	10번 필드값 활용 안하여 -2감점
	11번 필드값 활용 안하여 -2감점
	14번 10번과 연관된 오류 -3감점
	16번 11번과 연관된 오류 -3감점
*/	

}
