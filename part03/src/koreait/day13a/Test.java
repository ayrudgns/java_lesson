package koreait.day13a;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<TestSource> tsList = new ArrayList<TestSource>();
		
		tsList.add(new TestSource("거짓말", 21));
		tsList.add(new TestSource("진실", 3));
		tsList.add(new TestSource("행복", 18));
		tsList.add(new TestSource("목소리", 99));
		tsList.add(new TestSource("아저씨", 50));
		
//		tsList.sort(null);
		System.out.println("tsList : " + tsList);			// Comparator 이용
		System.out.println("==========================================================================================");
		tsList.sort(new tsListKorAscending());
		System.out.println("tsList 한글 오름차순 정렬 : " + tsList);
		System.out.println("==========================================================================================");
		tsList.sort(new tsListKorDescending());
		System.out.println("tsList 페이지 내림차순 정렬 : " + tsList);
		System.out.println();
		System.out.println("Comparable 해보기");
		System.out.println();
		
		List<TestSource> tssList = new ArrayList<TestSource>();
		
		tssList.add(new TestSource("거짓말", 21));
		tssList.add(new TestSource("진실", 3));
		tssList.add(new TestSource("행복", 18));
		tssList.add(new TestSource("목소리", 99));
		tssList.add(new TestSource("아저씨", 50));
		System.out.println("tssList 상태 : " + tssList);		// // Comparable 인터페이스 이용
		System.out.println("TestSource 클래스의 compareTo() 메소드에서 정의한 필드를 기준으로 오름차순 정렬");
		tssList.sort(null);
		System.out.println("오름차순 tsList : " + tssList);
		
	}

}

