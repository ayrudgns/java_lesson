package koreait.day05;


public class C23_ForTest {		// 반복되는 명령들을 실행하는 for문의 연습

	public static void main(String[] args) {

		// 명령문의 반복1 : 같은 출력문을 5번 반복
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println();
		
		// 명령문의 반복2 : 같은 출력문이지만 값의 변경이 있으면서 5번 반복
		System.out.println("hello!(1)");
		System.out.println("hello!(2)");
		System.out.println("hello!(3)");
		System.out.println("hello!(4)");
		System.out.println("hello!(5)");
		System.out.println();
		
//		for(변수초기값; 실행조건식; 증감식)		// 변수는 loop counter (반복문의 횟수를 제어하는 역할)		
		for(int i = 0; i < 5; i++)	{		// i를 for() 안에서 선언하면 for에서만 사용할수 있다.(for { }의 지역변수)
			//i는 0부터 4까지 변경되면서 실행한다.
			System.out.println("헬로우 !");		// i = 0 , 0 < 5 참 ==> 출력 실행 ==> i++
			System.out.println(i);
			System.out.println("////////");		// i = 1 , 1 < 5 참 ==> 출력 실행  ==> i++
		}						// i = 2, 2 < 5 참 ==> 출력 실행  ==> i++
								//	:
								// i = 5, 5 < 5 거짓  ==> 출력 실행  ==> for종료
			System.out.println();
			
		// 다른 예시
		for(int i = 0; i < 10; i += 2)			//결과는?
			System.out.println("hello!!!!!");  
		
		for(int i = 0; i < 0; i++) 			//결과는?
			System.out.println("헬로우!!!!!");
		
//		System.out.println();
//		for(int i = 0; i > 0; i++) {		// 조건식과 증감식에 for문을 종료하는 값이 없는 경우 ==> 무한루프, 강제종료해야 함.
//			System.out.println("헬로우~");
//			System.out.println(i);
//			System.out.println("////////");
		
		// 위 명령문의 반복2를 for로 출력해보세요.
		
		for(int i = 0; i < 5; i++) {
			System.out.println("hello!" + "(" + (i + 1) + ")");
		}

	}							
}
