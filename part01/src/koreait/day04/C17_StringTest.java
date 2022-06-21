package koreait.day04;

public class C17_StringTest {
	public static void main(String[] args) {
		
		String name = "kim";				// 참조형 변수 (클래스 타입)
		String name2 = "kim";				// 변수는 다르지만 리터럴이 같기 때문에 name과 같은 리터럴을 가리킴. 즉, 주소가 같다.
		String name3 = "lee";
		String name4 = new String("kim");	// 무조건 새로은 String 객체를 생성함.
		
		System.out.println("name == name2 참조위치? " + (name == name2));		// true
		System.out.println("name == name4 참조위치? " + (name == name4));		// false
		System.out.println("name2 == name4 참조위치? " + (name2 == name4));	// false
		
		name2 = "son";
		System.out.println("name == name2 참조위치? " + (name == name2));		// false
		
		System.out.println();
		System.out.println("name = " + name);
		System.out.println("name2 = " + name2);
		System.out.printf("name3 = %s\n", name3);
		System.out.printf("name4 = %s\n", name4);
	
	}

}

/*
 * 		문자열 :	기호 " "를 사용하면 문자열이다.
 * 				자바에서는 String을 기본형 데이터가 아닌, 클래스 타입으로 사용한다.
 * 													ㄴ 필드, 메소드를 이용하여 문자열의 기능을 사용한다.
 */