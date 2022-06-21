package koreait.day08;

public class MyClass2Test {
// 하고 싶은 연습 해보기 ==> MyClass2의 객체 생성
	public static void main(String[] args) {
		
		// 기본생성자로 객체 생성하기
		MyClass2 my2 = new MyClass2();	// 오류 : 커스텀생성자를 정의하면 기본으로 쓸 수 있는 기본생성자를 사용할 수 없게 된다.
//											==> 이를 해결하기 위해서는 기본생성자를 직접 정의하면 된다.
		// 커스텀생성자로 객체 생성하기
		MyClass2 my22 = new MyClass2("모모");
		
		System.out.println("my2.name = " + my2.getName());	
		System.out.println("my22.name = " + my22.getName());
		System.out.println();
		
		System.out.println("my2.getAge = " + my2.getAge());
		System.out.println("my22.getAge = " + my22.getAge());
		my2.setAge(23);
		System.out.println("my2.getAge = " + my2.getAge());
		my22.setAge(28);
		System.out.println("my22.getAge = " + my22.getAge());
		
		// my2 객체에 기본생성자를 허용하면 name 필드값 초기화를 할 수 없다. (예시 적용의 경우)
		
		// 기본생성자를 허용하지 않는 대표적인 예시
//		Scanner sc = new Scanner();
	}
}
