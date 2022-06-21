package koreait.day15;

public class GoClass1 implements Interface1{
	
	public GoClass1() {
		System.out.println("저는 Interface1을 구현한 구현체입니다.");
	}
	
	@Override
	public void run() {
		System.out.println("저는 GoClass1의 메소드입니다.");
	}
	
	public String talk1(int i) {
		return String.format("저는 %d분 동안 떠들 수 있어요.", i);
	}

}
