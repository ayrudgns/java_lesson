package koreait.day15;

public class GoClass2 implements Interface2{
	
	public GoClass2() {
		System.out.println("저는 Interface2를 구현한 구현체입니다.");
	}
	
	@Override
	public void ride() {
		System.out.println("저는 GoClass2의 메소드입니다.");
	}
	
	public String talk2(int i) {
		return String.format("저는 %d분 동안 떠들 수 있어요.", i);
	}

}
