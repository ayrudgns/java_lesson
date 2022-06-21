package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;

public class C55_ListSortTest {
// sort와 관련된 인터페이스 사용하기.
	
	public static void main(String[] args) {
		// List는 인터페이스, ArrayList는 List의 구현체
		// 다형성 : List를 참조타입으로 하여 선언한다.
		// Why? 앞으로 배우게 될 라이브러리들이 List 타입으로 쓰게 되기 때문이다.
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		System.out.println("sort 이전 : " + ilist);
		// 정렬 : 오름차순
		ilist.sort(null);		// 인자로 필요한 것은 비교자(Comparator) 구현체
								// 기본형과 String은 null로 할 수 있다. (오름차순 기본)
		System.out.println("sort 이후 : " + ilist);
		ilist.sort(Comparator.reverseOrder());		// reverse: 역순, Comparator 인터페이스의 static 메소드이다.
		System.out.println("내림차순 sort : " + ilist);
		System.out.println();
		
		slist.add("트와이스");
		slist.add("오마이걸");
		slist.add("아이즈원");
		slist.add("비비지");
		slist.add("소녀시대");
		slist.add("브레이브걸스");
		
		System.out.println("sort 이전 : " + slist);
		slist.sort(null);
		System.out.println("sort 이후 (ASCEnding): " + slist);		// list의 순서가 바뀌고, 따라서 인덱스도 바뀐다.
		slist.sort(Comparator.reverseOrder());
		System.out.println("내림차순 sort (DESCending): " + slist);	// list의 순서가 바뀌고, 따라서 인덱스도 바뀐다.
		System.out.println();
		
//*************************************************************************
		System.out.println("1. Comparator 인터페이스를 사용하는 sort");
		
		List<Member> mlist = new ArrayList<>();
		
		mlist.add(new Member("momo", 23));
		mlist.add(new Member("nana", 27));
		mlist.add(new Member("nayeon", 25));
		mlist.add(new Member("dahyeon", 29));
		mlist.add(new Member("sooni", 26));
		mlist.add(new Member("jenny", 27));
		
		System.out.println("member 리스트 상태 : " + mlist);
//		mlist.sort(null);	// 오류 : Member 객체는 비교할 수 없는 객체이다. ==> 비교자 인터페이스를 인자로 해야함.
		// Member 객체의 sort : 비교가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체를 만들어야 한다.
		System.out.println("================= 정렬기준 : age =================");
		mlist.sort(new MemberAgeAscending());
		System.out.println("member sort 확인 (ASC) : " + mlist);
		mlist.sort(new MemberAgeDescending());
		System.out.println("member sort 확인 (DESC) : " + mlist);
		System.out.println("================= 정렬기준 : name =================");
		mlist.sort(new MemberNameAscending());
		System.out.println("member sort 확인 (ASC) : " + mlist);
		mlist.sort(new MemberNameDescending());
		System.out.println("member sort 확인 (DESC) : " + mlist);
		System.out.println();
//*************************************************************************
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println();
		System.out.println("2. Comparable 인터페이스를 사용하는 sort");
		
		List<User> ulist = new ArrayList<>();
		
		ulist.add(new User("모모", 23));
		ulist.add(new User("나나", 27));
		ulist.add(new User("나연", 25));
		ulist.add(new User("다현", 29));
		ulist.add(new User("수니", 26));
		ulist.add(new User("제니", 27));
		
		System.out.println("user 리스트 상태 : " + ulist);
		// User는 비교할 수 있는 타입이다. : Comparable 구현체
		System.out.println("================= 정렬기준 : age =================");
		ulist.sort(null);
		System.out.println("user sort 확인 (ASC) : " + ulist);		// 나이가 같을 때, 리스트에 추가된 순서대로 정렬한다.
		ulist.sort(Comparator.reverseOrder());
		System.out.println("user sort 확인 (DESC) : " + ulist);
		/////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("메소드 인자로 익명클래스를 정의해서 객체를 생성했다.");
		ulist.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});		// 메소드 인자(ulist.sort(~~)에서 ~~부분)로 익명클래스를 정의해서 객체를 생성(new 뭐시기~)했다. ===> 시봉.. 뭔말이여
				// 그럼 이건 일회용이란 말이겠지?
		System.out.println("================= 정렬기준 : name =================");
		System.out.println("user sort(name ASC) : " + ulist);

	}

}
