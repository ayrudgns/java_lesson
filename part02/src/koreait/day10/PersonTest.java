package koreait.day10;

public class PersonTest {
	public static void main(String[] args) {
		Person sinb = new Person();
		sinb.setName("신비");
		sinb.setAge(27);
		System.out.println(sinb);
		System.out.println(sinb.toString());	// toString() 메소드를 재정의하지 않으면
												// hashCode 값 출력 : 객체 고유의 값
												// toString() 메소드를 재정의했으니까
												// 메소드 출력.
		
		Person momo = new Person();
		System.out.println(momo);
	
	
	}

}
