package koreait.day11.test;

public class Crow extends Animal{	// 까마귀
	
	protected int wings;	// 접근 허용 범위 : default 한정자(같은 패키지) + 다른 패키지의 자식클래스
	
	public Crow() {
		System.out.println("새로운 동물 가족은 Crow");
		type = Animal.CROW;
	}
	
	public void fly() {
		setName("까마귀");
		setColor("검정색");
		System.out.println("특징 : 날기");
	}
	
	// 추상메소드 재정의 (구현)
	@Override
		public void act() {
			System.out.println("Crow 행동 : 하루 종일 날아다니기");
		}
	
	@Override
			public String eat(Object object) {
				return "먹이는 개구리 " + object + "마리 입니다.";
			}

}
