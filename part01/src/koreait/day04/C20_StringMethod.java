package koreait.day04;

public class C20_StringMethod {
	public static void main(String[] args) {

		String message = "hello~";		// java.lang.String (기본패키지 클래스이다.)
										// 기본패키지가 아닌 클래스는 import가 필요하다. (ex: Scanner)

		// String 클래스의 메소드 알아보기
		
		int len = message.length();
		char temp = message.charAt(3);		// 0부터 시작해서 3번 문자가 무엇인지 return한다.
		boolean isState = message.equals("Hello~");		// 문자열이 같은지 비교해준다.
		
		System.out.println("length() = " + len);	// 6
		System.out.println("chatAt(3) = " + temp);	// l
		System.out.println("equals(\"Hello~\") = " + isState);	// false
		System.out.println();
		
		System.out.println("indexOf('e') = " + message.indexOf('e'));		// 1번 위치
		System.out.println("indexOf(\"lo\") = " + message.indexOf("lo"));	// 3번 위치
		System.out.println("indexOf(\"ol\") = " + message.indexOf("ol"));	// -1 : 찾는 문자열이 없음!
		System.out.println();
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = " + test.indexOf("lo"));				// 3번 위치 (일치하는 처음 위치)
		System.out.println("test.lastIndexOf(\"lo\") = " + test.lastIndexOf("lo"));		// 9번 위치 (일치하는 마지막 위치)
		System.out.println();
		
		System.out.println("substring(2) = " + message.substring(2));		// 부분추출 : llo~
		System.out.println("substring(2, 4) = " + message.substring(2, 4));	// ll, 2번부터 2개(4-2)
		System.out.println("substring(1, 4) = " + message.substring(1, 4));	// ll, 2번부터 2개(4-2)
		// substring에서 지정할 수 있는 숫자는 0부터 5까지, 그 외의 값을 쓰면 IndexOutOfBounds 오류가 발생함.
		System.out.println("replace(\"ll\", \"*@\") = " + message.replace("ll", "*@"));	// 치환 : he*@o~
		System.out.println("startWith(\"H\") = " + message.startsWith("H"));	// false
		System.out.println("endsWith(\"~\") = " + message.endsWith("~"));		// true
	}

}

//		message.length();				// public int length() : 길이
//		message.charAt(0);				// public char charAt(int index) : 추출
//		message.equals("Hello~");		// public boolean equals(Object anObject), Object는 모든 타입이 가능하다.
										// message가 String 타입이므로 이때의 Object는 String으로 해석한다.
//	리턴값 형식 맞추기!
//		message.indexOf('e');			// 1		==> int
//		message.indexOf("lo");			// 3, 4 (?)	==> int		!! 틀림, 일치하는 처음 위치의 인덱스가 출력됨.
//		message.substring(2);			// llo~		==> String
//		message.substring(2, 4);		// llo		==> String 	!! 틀림, 마지막 인덱스는 포함하지 않음.
//		message.replace("ll", "*@");	// he*@o~	==> String	@@ 특정 문자열을 다른 문자열로 대체함, 길이가 달라도 됨.
//	메소드 오버로딩(overloading) : 메소드 이름과 리턴형식은 같고, 인자값의 개수와 형식이 다르게 정의된 것.
