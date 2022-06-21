package koreait.day13a;

public class C54_CompareTo {
	public static void main(String[] args) {
// 모든 객체(Object를 상속받은 객체)에는 compareTo라는 메소드가 있다. ==> 값의 비교
		
		String na = "kim";
		String you = "momo";
		String he = "Son";
		
		// String은 알파벳(사전식) 비교
		System.out.println("kim과 momo 비교 : " + na.compareTo(you));		// -2 (음수) : "kim" < "momo" 
																		// => "kim" - "momo" < 0
		System.out.println("kim과 Son 비교 : " + na.compareTo(he));		// 24 (양수) : "kim" > "Son"	 
																		// => "kim" - "Son" > 0 
		// 알파벳 대문자가 알파벳 소문자보다 값이 작다. (ASKII 코드)
		System.out.println();
		
		int a = 12;
		int b = 45;
		System.out.println("a - b = " + (a - b));		// 12 - 45 < 0 ==> 값을 그냥 출력
		
		Integer aa = 12;
		Integer bb = 45;
		System.out.println("12와  45 : " + aa.compareTo(bb));		// -1 : aa < bb	==> 대소관계만 출력
		aa = 90;
		System.out.println("90과 45 : " + aa.compareTo(bb));		// 1 : aa > bb
		aa = 45;
		System.out.println("45와 45 : " + aa.compareTo(bb));		// 0 : aa == bb
		
		// compareTo()와 같은 비교는 sort(정렬)에 사용된다.
		// 정렬은 오름차순 정렬과 내림차순 정렬이 있다.
	}

}
