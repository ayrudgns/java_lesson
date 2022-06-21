package koreait.day08;

public class MemberTest {
	public static void main(String[] args) {
		
		Member momo = new Member();		// 이 상태로 실행해도 출력문 나옴. 객체 만들면서 명령문 실행되기 때문.
		System.out.println();
		
		Member nana = new Member("나나", "nana@gmail.com");
		System.out.println("nana name = " + nana.getName());
		nana.setAge(26);
		System.out.println("nana age = " + nana.getAge());
		System.out.println("nana email = " + nana.getEmail());
		
	}

}
