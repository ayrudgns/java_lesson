package koreait.day04;

public class C19_MethodTest {
	
	// main 메소드 : 실행의 시작점. 프로그램 실행을 위해서 꼭 필요한 메소드. static
	public static void main(String[] args) {
		
		System.out.println("메소드를 직접 정의해서 사용해보자.");
		System.out.println("프로그램은 main 메소드의 명령문을 순서대로 실행한다.");
		System.out.println("중간에 메소드 호출을 만나면 메소드가 정의된 실행을 위해 제어를 이동한다.");
		System.out.println("1.");
		methodA();		// 메소드 호출 (실행), 필요할 때 호출한다. (해당 메소드 만큼의 코드가 사이에 들어왔다고 생각하면 편함!)
		System.out.println("메소드의 실행이 종료되면 다시 main 메소드로 제어가 돌아온다.");
						// 즉, main문을 실행하다가 메소드를 만나면 해당 메소드를 실행하러 갔다가 다시 main문으로 돌아와서 마저 실행함.
		System.out.println();
		
		System.out.println("2.");
		methodB(11, 33);		// ** 11과 33은 메소드 실행에 필요한 인자. **
		methodB(929, 121);
//		methodB(929, 12.1);		// 오류 : 12.1을 12로 자동형변환 X (8byte를 4byte로 담을 수 없음!, double -> int X)
								// 매개변수 형식 오류
		System.out.println();
		
		System.out.println("3.");
		methodC(929, 12.1);
		methodC(929, 121);		// 오류 아님 : 121을 121.0으로 자동형변환 (4byte를 8byte로 담는 것 가능함!, int -> double O)
		System.out.println();
		
		System.out.println("4.");
		methodD();				// 반환값이 있는 메소드이지만, main 메소드에서 반환값을 저장하지 않음.
		System.out.println("return = " + methodD());		// 반환값을 받아서 출력하는 예시
		int temp = methodD();	// 반환값을 받아서 변수에 저장하는 예시 : 변수의 형식과 반환값의 형식은 반드시 같아야 한다.
		System.out.println("return = " + temp);
		System.out.println();
		
		System.out.println("5.");
		// 실행 예시문 만들기
		System.out.println("return = " + methodE(3, 12.1));
		double tmp = methodE(3, 12.1);
		System.out.println("return = " + tmp);
		System.out.println();
		
		System.out.println("6.");
		System.out.println(methodF('i', 4));	// methodF 정의해보기.
		char ch = 'a';
		int val = 3;
		ch = methodF(ch, val);		// 메소드 인자로 저장된 값을 변수에 전달하기
		System.out.println("return = " + ch);
	}	
	
		 /*	
		  * String 클래스의 메소드 이해하기 위해서 먼저 메소드의 구조를 연습하자.
		  *
		  * 메소드의 주요 요소 :
		  * 	반환값(형식 중요!), 인자(argument) 또는 매개변수(parameter), 메소드 이름, public 또는 static 등의 설정
		  * 		ㄴ 반환값 : 메소드의 실행이 완료되면 얻어지는 결과값
		  * 		ㄴ 인자(매개변수) : 메소드 실행을 위해서 필요한 데이터 (형식과 변수명 선언 필요), 인자의 개수와 형식은 다양하다.
		  *			ㄴ 메소드 이름 : 식별자
		  * 		ㄴ public : 접근제어자(접근한정자), static : 정적인 요소
		  */

	
		// static인 main에서 실행할 메소드는 동일하게 static이어야 한다. (유유상종)
		// 메소드 선언(정의)
		public static void methodA() {
			System.out.println("## 첫번째 메소드 정의 연습입니다. ##");
		}
		
		public static void methodB(int a, int b) {	// ** int a, int b는 인자의 값을 전달받는 매개변수(지역변수) **
			System.out.println("## 두번째 메소드 정의 연습입니다. ##");
			System.out.println("전달받은 값 : a = " + a + ", b = " + b);
		}
		
		public static void methodC(int a, double b) {		// void는 반환값(return값)이 없어도 됨!
			System.out.println("## 세번째 메소드 정의 연습입니다. ##");
			System.out.println("전달받은 값 : a = " + a + ", b = " + b);
		}
		
		public static int methodD() {		// 반환값이 있는 형식 : 반환값은 int 데이터, return이 반드시 필요함!
			System.out.println("## 네번째 메소드 정의 연습입니다. ##");
			return 999;
		}
		
		public static double methodE(int a, double b) {
			System.out.println("## 다섯번째 메소드 정의 연습입니다. ##");
			return a + b;		// 인자로 전달받은 값으로 실행하고 처리결과를 반환(return)한다.
		}
		
		public static char methodF(char a, int b) {
			System.out.println("## 여섯번째 메소드 정의 연습입니다. ##");
			return (char)(a + b);		// 내가 한거.
		}

	}
