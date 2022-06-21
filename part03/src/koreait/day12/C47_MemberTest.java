package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {
	public static void main(String[] args) {
		// Member[] members = new Member[10];과 같다.
		ArrayList<Member> list = new ArrayList<>();	// list에 저장되는 것은 '객체의 참조값'이다.
		
		list.add(new Member("모모", 27));		// 새로운 객체가 생성되고, 참조값을 list에 추가한다.
		Member member = new Member("다현", 26);		// 새로운 객체가 생성되고
		list.add(member);							// 참조값을 list에 추가한다.
		list.add(new Member("나나", 20));
		list.add(new Member("신비", 22));
		System.out.println("현재 list의 요소 개수는 ? : " + list.size());
		System.out.println("1. list 전체 출력");
		System.out.println(list);
		// list.get(i) ==> Member 객체의 참조값을 꺼내온다.
		System.out.println();
		
		System.out.println("2. list의 요소 중 참조 객체 age 필드의 값이 25 이하인 것만 출력해보기.");	// for문 활용
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getAge() <= 25) {
				System.out.println("i = " + i + ", " + list.get(i));
			}
		}
		System.out.println();
		
		System.out.println("3. '나나'는 몇번 인덱스에서 참조하고 있는 객체인가?");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals("나나")) {
				System.out.println("i = " + i + ", " + list.get(i));
			}
		}
		System.out.println();
		
		// list의 요소가 여러개의 필드를 갖는 객체일 때, 필드값을 비교하는 equals 예제
		System.out.println("4. 참고");
		// indexOf는 String 클래스나 기본형 래퍼클래스만 쓸 수 있다. 
		System.out.println("Member 객체로 indexOf 실행 : " + list.indexOf(new Member("나나", 20)));
		// 결과값 : -1 (찾을 수 없음), 이유 : 참조값이 같은 것을 찾는데, 이를 필드값 비교를 통해 찾도록 바꾸는  기능 구현이 필요하다.
		// 이름이 나나, 나이가 20인 요소를 찾고 싶을 때 틀린 예제이다.
		
		System.out.println("Member 객체로 indexOf 실행 : " + list.indexOf(member));
		// 결과값 : 1, 참조값이 같은 것을 찾았다. (Line 11 참고)
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals("나나") && list.get(i).getAge() == 20) {
				System.out.println("i = " + i + ", " + list.get(i));
			}
		}
		// 이름이 나나, 나이가 20인 요소를 찾고 싶을 때 올바른 예제이다.
		System.out.println();
	
	}
}
