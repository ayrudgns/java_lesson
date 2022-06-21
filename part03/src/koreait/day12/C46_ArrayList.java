	package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {
	public static void main(String[] args) {
		int[] datas = {45, 23, 7, 21 ,19, 11, 44};		// 배열은 선언할 때 배열의 크기를 정한다.
														// 크기는 바꿀 수없다. 즉, 크기가 정적이다.
														// 배열은 기본형 데이터 타입인 int, double, long, ... 또는 참조형 타입
						
		ArrayList<Integer> list = new ArrayList<>();
						// ArrayList는 크기를 바꿀 수 있다. 즉, 크기가 동적이다.
						// 데이터 타입은 참조형 타입만 가능하다. 기본형 타입은 래퍼클래스를 사용한다.
						// <E>는 제네릭(제너릭) 타입이라고 부른다. 데이터 요소의 타입을 정한다. Generic(s)
						// generic : 포괄적인 // 모든 타입을 리스트에 담을 수 있다는 의미.
						// 리스트에 저장하는 데이터를 요소(Element)라고 한다.
						// 주요 메소드 : add, get, size, remove
		
		String[] names = {"쯔위", "모모", "신비", "은하", "나나"};
		ArrayList<String> name_list = new ArrayList<>();
		
		// ArrayList에 데이터를 추가할 떄는 add() 메소드를 사용한다.
		list.add(45);
		list.add(7);
		list.add(21);
		list.add(19);
		list.add(11);
		list.add(44);
		
		System.out.println("첫번째 ArrayList<Integer> 출력");
		System.out.println(list);
		System.out.println("참고 (배열) " + Arrays.toString(datas) + ", 배열의 크기 : " + datas.length);
		System.out.println("list의 크기 : " + list.size());
		System.out.println();

		System.out.println("두번째 ArrayList<String> 출력");
		name_list.add("쯔위");
		name_list.add("모모");
		name_list.add("은하");
		name_list.add("나나");
		System.out.println(name_list);									// 데이터 없을 때, []로 나온다.
		System.out.println("name_list의 크기 : " + name_list.size());		// 데이터 없을 때, 0으로 나온다.
		System.out.println();
		
		System.out.println("3. 특정 위치에 데이터 추가");
		list.add(1, 23);		// (인덱스 위치, 추가할 값)
		System.out.println("add(1, 23) 결과 : "  + list);
		name_list.add(2, "신비");
		System.out.println("add(2, \"신비\") 결과 : " + name_list);
		System.out.println();
		
		System.out.println("4. 배열처럼 index 값으로 데이터 가져오기");
		System.out.println("get(3) : " + list.get(3));
		System.out.println("get(3) : " + name_list.get(3));
		System.out.println();
		
		System.out.println("5. 특정 위치의 데이터(요소) 제거하기");
		list.remove(4);
		System.out.println("remove(4) 결과 : " + list);
		name_list.remove(4);
		System.out.println("remove(4) 결과 : " + name_list);
		System.out.println();
		
		System.out.println("6. 특정 값의 위치를 알아내기 (신비는 몇번 인덱스?)");
		System.out.println("배열 : " + Arrays.binarySearch(names, "신비"));
		System.out.println("ArrayList : " + name_list.indexOf("신비"));
		System.out.println();
		
		System.out.println("7. 6번의 실행 내용을 for문으로 한다면?");	
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals("신비")) {
				System.out.println("배열 : " + i);
				break;
			}
		}
		for(int i = 0; i < name_list.size(); i++) {
			if(name_list.get(i).equals("신비")) {
				System.out.println("ArrayList : " + i);
				break;
			}
		}
		System.out.println();
		// "신비" 요소가 여러개일 때, ArrayList는 lastIndexOf 메소드로 마지막 일치 요소를 찾을 수 있다.

		System.out.println("8. contains 메소드");
		System.out.println("'모모'가 name_list에 있는가? " + name_list.contains("모모"));
		System.out.println("'다현'이 name_list에 있는가? " + name_list.contains("다현"));
	}
}
/*
 *  배열 : 많은 양의 데이터를 저장하는 방법.
 *  컬렉션(Collections) : 자료구조. 많은 양의 데이터를 저장하는 것이고, 데이터의 특징에 따라 관리하는 것에 차이가 있다.
 *  																		ㄴ데이터 저장, 읽기 / 쓰기
 *  					 데이터 삽입 / 삭제 등의 알고리즘이 메소드로 구현되어 있다.
 *  	ㄴ ArrayList 클래스
 *  	ㄴ HashMap 클래스
 */