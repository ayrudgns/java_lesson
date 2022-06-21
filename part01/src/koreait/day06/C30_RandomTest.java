package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
	// 난수를 발생시키는 Random 클래스의 메소드를 테스트
	public static void main(String[] args) {
		Random r = new Random();		// Random 클래스의 객체 생성 ( new 연산을 이용 ), r은 참조변수
		
		System.out.println("1. 정수형 랜덤값 10개 출력");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt();		// int 범위 내에서 랜덤값(난수)을 만든다.
			System.out.println(inum);
		}
		
		System.out.println();
		System.out.println("2. 정수형 랜덤값 10개 출력 - bound(경계값) 있음.");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(100);		// 0 <= 난수 < 100 범위의 랜덤값을 만든다.
			System.out.println(inum);		// r.nextInt(A) ==> 0부터 (A-1)까지가 범위이다.
		}
		// 경계값은 양수만 사용한다.
		System.out.println();
		
		// 1 <= 난수 < 101 범위의 랜덤값을 만들어야 한다면?
		System.out.println("3. 특정 범위의 랜덤값 10개 출력 - bound를 이용한 수식");
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(100) + 1;		// 1 <= 난수 < 101 범위의 랜덤값을 만든다.
			System.out.println(inum);
		}
		System.out.println();
		
		// n보다 크거나 같고 m보다 작은 범위 난수 : r.nextInt(m - n) + n
		System.out.println("4. 2 ~ 45 범위의 값으로 난수 10개 출력");	// n = 2, m = 46
		for(int i = 0; i < 10; i++) {
			int inum = r.nextInt(44) + 2;		// 2 <= 난수 < 46
			System.out.println(inum);
		}
	}

}
