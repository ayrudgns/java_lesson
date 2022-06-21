package koreait.day10;

public class ConstructorTest {
	public static void main(String[] args) {
		
	}

}

class Product {
	int price;
	
	// (커스텀 생성자만 만들면) 디폴트 생성자는 동작하지 않는다.
	
	public Product(int price) {		// 커스텀 생성자
		this.price = price;
	}
}

class Food extends Product {	// Product() 디폴트 생성자 먼저 실행 후 Food() 디폴트 생성자 실행
								// "자식클래스는 무조건 부모클래스의 디폴트 생성자를 실행한다." => 생성자가 없으면 오류 발생
	public Food(int price) {		// 커스텀 생성자 호출 (첫번째 방법)
		super(price);
	}
}

class Electronics extends Product {	// Product() 디폴트 생성자 실행하면 오류 발생. 디폴트 생성자가 없으니까.
	
	public Electronics(int price) {
		super(price);			// super() 디폴트 생성자 대신에 자식클래스에서 커스텀 생성자 호출
	}
	
}