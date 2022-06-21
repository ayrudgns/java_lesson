package koreait.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class C60_CharSequence {
	// CharSequence 인터페이스 구현체 : String, StringBuffer, StringBuilder, ...
	public static void main(String[] args) {
		
		String result = new String();		// result = "test"; result = new String("test"); <<= 같은 표현
		System.out.println("초기 result : " + result);	// result 는 "" 인 상태.
		System.out.println("1. String 타입 테스트");
		for(int i = 2; i < 6; i++) {
			// 문자열 내용이 바뀌면 문자열 객체가 새로 생성되고 객체의 위치가 달라진다. (디버그의 id값으로 확인)
			result += i + "/";		// result = result + (i + "/");
			System.out.println("result : " + result);
		}
		System.out.println();
		
		StringBuffer sb = new StringBuffer();		// StringBuilder와 함께 많이 사용되는 클래스.
		System.out.println("초기 sb : " + sb);
		System.out.println("2. StringBuffer 타입 테스트");
		for(int i = 2; i < 6; i++) {
			// StringBuffer 객체의 문자열 내용이 바뀌어도 기존 객체에 추가되는 동작만 한다.
			// (객체 생성 X, 객체 위치 변경 X ==> 객체가 바뀌지 않는다. 디버그의 id값으로 확인)
			// 결론 : 반복되는 연결 연산이 많은 경우 String보다 StringBuffer가 더 효울적이다. Why? 객체의 위치가 바뀌지 않으니까.
			sb.append(i).append(":");		// 문자열 연결 연산 +와 같은 동작을 하는 .append()
			System.out.println("sb : " + sb);
		}
		System.out.println();
		
		// CharSequence 인터페이스 사용 : contains 메소드의 매개변수 타입
		// boolean java.lang.String.contains(CharSequence s)
		String sample = "abc2/3/4/5/xyz";
		
		System.out.println("3. contains 메소드 확인");
		System.out.println("sample.contains(result) : " + sample.contains(result));	// true
		System.out.println("sample.contains(sb) : " + sample.contains(sb));		// false
		
		// ** 메소드의 형식 또는 다른 여러 형식들을 확인할 때 **
		// 1) 클래스? or 인터페이스?
		// 2) 인터페이스일 때, 구현체는 무엇인가?
		
		// 참고 : ArrayList 선언할 때, 변수 선언은 List 인터페이스 타입으로 한다.
		//		  HashMap  선언할 때, 변수 선언은 Map 인터페이스 타입으로 한다.
		// 이유 : 참조할 때 바꿀 수 있기 때문. (아래 예시)
		List<String> names = new ArrayList<>();
		names = new Vector<>();
		
		Map<String, Integer> map = new HashMap<String, Integer>();
//		Map<String, Integer> map = new HashMap<>();		// 객체 생성할 때 제네릭 타입 생략 가능.
		map = new TreeMap<String, Integer>();
	}

}
