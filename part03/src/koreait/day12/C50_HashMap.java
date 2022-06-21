package koreait.day12;

import java.util.HashMap;

public class C50_HashMap {
/* 
 * ArrayList와 HashMap 비교하기!
 * 
 * ArrayList : 	순차적(인덱스로 접근)으로 데이터를 관리하는 자료구조이다. 배열과 유사하다.
 * 
 * HashMap :	순차적인 구조가 아닙니다. 인덱스를 사용하지 않고 Key값을 이용하여 데이터에 접근하여 저장/읽기 한다.
 * 				*검색*이 많은 알고리즘에 유용하다.
 * 				제너릭 타입은 K:Key, V:Value가 한쌍이다.
 * 				Key와 Value는 모든 타입이 가능하다.
 * 				HashMap에서는 key와 value가 한 쌍으로 요소를 이룬다.
 * 				value를 검색하기 위해서 key를 사용한다.
 * 				HashMap도 ArrayList와 마찬가지로 int, long, double 기본형 타입 대신에 래퍼(wrapper)클래스로 표기한다.
 */

	public static void main(String[] args) {
		// 식당의 메뉴판(메뉴 이름, 가격)데이터를 저장하기
		String[] title = {"스파게티", "스테이크", "샐러드"};
		int[] price = {12000, 22000, 7000};
		
		// HashMap으로 만든다면?
		// key는 메뉴 이름, value는 가격으로 하는 HashMap 선언하기
		// key는 중복된 값으로 사용할 수 없다. (유일한 값)
		HashMap<String, Integer> menus = new HashMap<>();
		
		// 데이터 저장 : put() 메소드
		menus.put("스파게티", 12000);
		menus.put("스테이크", 22000);
		menus.put("샐러드", 7000);
		
		System.out.println("1. 저장된 데이터 출력");
		System.out.println(menus);
		System.out.println();
		
		// 데이터 접근(읽기) : get() 메소드
		System.out.println("2. 특정한 key 값의 value 출력");
		System.out.println("'스파게티' 가격? " + menus.get("스파게티"));
		System.out.println("'스테이크' 가격? " + menus.get("스테이크"));
		System.out.println("'샐러드' 가격? " + menus.get("샐러드"));
		System.out.println();
		
		//key 값이 중복되면?
		menus.put("샐러드", 8200);		// 실행 결과? ==> 덮어쓰기 (value가 변경된다.)
		System.out.println("덮어쓰기 : " + menus);
		System.out.println();
		
		// 데이터 삭제 : remove() 메소드
		System.out.println("3. 특정 요소 삭제");
		menus.remove("스테이크");		// 인자가 key일 때 : key, value 둘 다 바로 삭제됨.
		System.out.println("삭제 결과 확인 : " + menus);
//		menus.remove("샐러드", 6000);		// 인자가 (key, value)일 떄 : key와 value의 값이 모두 일치해야 삭제된다.
		menus.remove("샐러드", 8200);		// 인자가 (key, value)일 떄 : key와 value의 값이 모두 일치해야 삭제된다.
		System.out.println("삭제 결과 확인 : " + menus);
	}

}
