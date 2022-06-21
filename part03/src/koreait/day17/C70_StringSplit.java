package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {
	public static void main(String[] args) {
		// String 클래스의 split(분열, 쪼개다) 메소드.
		
		String temp = "모모 90 88 79";
		String[] result = temp.split(" ");		// 공백을 기준으로 문자열을 여러개로 쪼갠다.
		
		System.out.println("1. 반복문 없이 출력");
		System.out.println("index 0 : " + result[0]);
		System.out.println("index 1 : " + result[1]);
		System.out.println("index 2 : " + result[2]);
		System.out.println("index 3 : " + result[3]);
		System.out.println();
		
		// for문 활용
		System.out.println("2. 일반적인 for문 출력");
		for(int i = 0; i < result.length; i++) {
			System.out.println(String.format("result[%d] : %s", i, result[i]));
		}
		System.out.println();
		
		// 향상된 for문 활용
		System.out.println("3. 향상된 for문 출력");
		for(String t : result) {
			System.out.println("result 요소 : " + t);
		}
		System.out.println();
		
		String temp2 = "모모,90,88,79";	// split 메소드는 공백을 인식하기 때문에.
		result = temp2.split(",");		// 공백을 넣으면 넣은대로, 없으면 없는대로 String과 배열에서 통일시켜 주어야 한다.
		System.out.println("4. split 구분 기호 ','");
		for(String t : result) {
			System.out.println("result 요소 : " + t);
		}
		System.out.println();
		
		temp2 = "모모,,90,,88,,79";		
		result = temp2.split(",");	
		System.out.println("5. split 구분 기호 ','");
		System.out.println("result.length : " + result.length);		// 길이 7, 콤마와 콤마 사이 요소로 인식함.
		for(String t : result) {
			System.out.println("result 요소 : " + t);
		}
		// result[1], result[3], result[5] 총 3개의 빈 문자열 (,와 , 사이의 빈 문자열을 인식함.)
		System.out.println();
		
		result = temp2.split(",,");		// 구분 기호 문자열을 변경함.
		System.out.println("6. split 구분 기호 ',,'");
		System.out.println("result.length : " + result.length);
		for(String t : result) {
			System.out.println("result 요소 : " + t);
		}
		System.out.println();
		
		// split의 인자인 문자열은 정규식 문자열이다. (정규식의 패턴은 복잡하고 어려움..)
		// 정규식의 예시 : [] 안에 표시하는 것은 문자 여러개가 또는(or, 즉 split)에 해당된다. Line 61 참고!
		// regex = 'reg'ular 'ex'pression = 정규식
		temp2 = "모모,90 88()79";
		result = temp2.split("[ ,()]");		// 정규식 문자열 : 구분 기호는 공백 또는 , 또는 ( 또는 )
		System.out.println("7. split 인자가 정규식");
		System.out.println("result.length : " + result.length);		// 길이 5
		for(String t : result) {
			System.out.println("result 요소 : " + t);
		}
		System.out.println();
		
		temp2 = "모모,90,88,79";
		result = temp2.split(",", 2);		// temp2.split(regex, limit); ==> 메소드 오버로딩
		System.out.println("8. split 두번째 인자인 limit 확인");
		// limit은 리턴되는 배열의 크기. 단, 쪼개지는 개수보다 커질 수는 없다.
		System.out.println("result.length : " + result.length);
		for(String t : result) {
			System.out.println("result 요소 : " + t);
		}
		System.out.println();
		
// ********************************************************************************** //
		
		// 배열과 유사하지만 더욱 자주 쓰이는 자료 구조 : List
		// 배열을 List로 변환하는 방법
		result = temp2.split(",");
		System.out.println("9. result 배열을 List 객체로 변경");
		List<String> rlist = Arrays.asList(result);
		System.out.println(rlist);
		System.out.println("rlist.size : " + rlist.size());
		for(String t : rlist) {
			System.out.println("rlist 요소 : " + t);
		}
		System.out.println();
		
		// 위의 rlist는 배열의 크기만큼 List의 크기를 정적으로 생성한다. (List 자체를 변경할 수 없다. 추가/변경/삭제 불가능)
//		rlist.add("test");	// 오류 : 고정된 크기의 rlist이므로 추가할 수 없다.
//		rlist.remove(2);	// 오류 : rlist 자체가 고정되어 있으므로 삭제도 불가능.
//		rlist.add(2, "100");	// Line 97과 마찬가지 이유로 오류 
		
		// 다시 동적인 List로 만들기. (추가/변경/삭제할 수 있는 List로 만들기)
		System.out.println("10. ArrayList의 인자가 있는 생성자 테스트, 추가/변경/삭제할 수 있는 List");
		List<String> rlist2 = new ArrayList<String>(rlist);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2, "100");
		System.out.println(rlist2);
		System.out.println();
		
		// Arrays.asList는 테스트용으로 사용할 List를 만들거나 간단한 고정 List를 만들 때 유용하다.
		List<Integer> ilist = Arrays.asList(1, 2, 6, 9, 100);
		System.out.println("11. Arrays.asList 활용");
		System.out.println(ilist);
	}
}
