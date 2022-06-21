package koreait.day15;

public class GoClass3 implements Interface1{
	
	String str = "바보";

	public GoClass3() {
			System.out.println("저는 Interface1을 구현한 구현체입니다.");
	}
	
	@Override
	public void run() {
		System.out.println("저는 GoClass3의 메소드입니다.");		
	}
}
