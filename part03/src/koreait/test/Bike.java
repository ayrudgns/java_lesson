package koreait.test;

public class Bike extends Product {
// 작성자 : 이경훈	
	
	@Override
	public String sell(Object obj) {		// [4]
		return String.format("추가 할인 행사 - %d%% 인하", obj);
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
	public String ride() {			// [10] 제출답안
		return "당신은 이것을 시속 " + speed + "km로 탈 수 있습니다.";
	}
*/	
	

	public String ride() {			// [10] 모범답안
		return "당신은 이것을 시속 " + speed + "km로 탈 수 있습니다.";
	}

	
	@Override
	public String toString() {		// [12]
		return "Bike [speed = " + speed + ", price = " + price + ", prdName = " + prdName + "]";
	}

	
	
}
