package koreait.day05;

public class C22_AssignTest {
	public static void main(String[] args) {
		// 참고 : 증가연산자, 축약연산자 ( +=, -=, *=, /=, %= )
		int i = 10;
		int sum = 0;

		i = i + 1; // i = 11
		i += 1; // i = 12
		i++; // i = 13 (후치 : Postfix)
		++i; // i = 14 (전치 : Prefix)
		// 전치, 후치는 다른 명령어(또는 연산자)들과 같이 쓰일 때는 차이가 있다.
		System.out.println("i++ ? " + i++);		// 출력은 14, i값은 15
		System.out.println("++i ? " + (++i));		// 출력은 16, i값은 16
		// 전치는 증가하고 출력, 후치는 출력하고 증가
		
		sum = sum + i;		// sum = 16
		sum += i;			// sum = 32
		System.out.println("sum ? " + sum);		// 32
		
		/*
		 *  i--;
		 *  --i;
		 *  sum = sum - 10;
		 *  sum -= 10;
		 */
	}

}
