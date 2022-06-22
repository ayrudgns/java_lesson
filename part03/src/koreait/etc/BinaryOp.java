package koreait.etc;

public class BinaryOp {
	public static void main(String[] args) {
	//  2진수의 비트 연산 : &, |, ^, ~, >>, << 등등... 간단한 test
	
		int data = 0b0101110100100110;
		
		System.out.println("1. ~(비트 반전) 연산 결과");		// 참고 : ! 연산은 true와 false를 반대로,
														// ~ 연산은 비트 연산, 비트 반전
		System.out.println(String.format("%32s", Integer.toBinaryString(data)));
		System.out.println(String.format("%32s", Integer.toBinaryString(~data)));
		System.out.println();
		
		System.out.println("2. 오른쪽 shift(>>) 연산");	// 오른쪽 정수값은 shift 동작 횟수
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data >> 1), data >> 1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data >> 2), data >> 2));
		// >> 1은 data를 / 2한 결과 + 2진수는 오른쪽으로 한 칸 밀림, >> 2는 / 2를 한번 더 한 결과 + 2진수는 오른쪽으로 한 칸 더 밀림
		// 맨 앞에 0이 추가되는 것 (양수인 경우)
		System.out.println();
		
		System.out.println("3. 왼쪽 shift(<<) 연산");	// 오른쪽 정수값은 shift 동작 횟수
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data << 1), data << 1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data << 2), data << 2));
		// << 1은 data를 * 2한 결과 + 2진수는 왼쪽으로 한 칸 밀림, << 2는 * 2를 한번 더 한 결과 + 2진수는 왼쪽으로 한 칸 밀림
		// 맨 뒤에 0이 추가되는 것 (양수인 경우)
		System.out.println();
		
		data = -2345;
		System.out.println("4. 음수값 오른쪽 shift(>>) 연산");	// 왼쪽에 추가되는 비트는? 1, 음수값이니까
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data >> 1), data >> 1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data >> 2), data >> 2));
		// 정수 32비트의 맨 왼쪽 비트는 부호를 표시한다. 오른쪽 shift 연산에서 왼쪽에 추가되는 비트는 부호 비트와 같다.
		// 참고 : 오른쪽 shift할 때 부호와 상관 없이 왼쪽에 추가되는 비트를 0으로 해야할 때는 >>> 연산으로 한다. (5번)
		System.out.println();
		
		System.out.println("5. 오른쪽 shift(>>>) 연산2");	// 오른쪽 정수값은 shift 동작 횟수
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data >>> 2), data >>> 2));
		// Line 37 참조. 10진수값은 의미없음.
		System.out.println();
		
		int n = 0xffffffff;		// 32비트가 모두 1
		data = 100;
		// 참고 : 논리 연산 and(&&)는 [참] and [참]일 때만 결과가 참
		//		 논리 연산 or(||)는 [거짓] or [거짓]일 때만 결과가 거짓
		// 비트 연산 and(&)는 1 & 1일 때만 결과가 1, 비트 연산 or(|)는  0 or 0일 때만 결과가 0
		// 비트 연산 활용 : x & 1은 결과가 x, x & 0은 결과가 0, x | 1은 결과가 1, x | 0은 결과가 x
		System.out.println("6. bit and(&) 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("=======================================");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data & n), data & n));
		System.out.println();	// 결과값 100 (data)
		
		System.out.println("7. bit or(|) 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("=======================================");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data | n), data | n));
		System.out.println();	// 결과값 -1 (2진수 비트 모두 1)
		
		n = 0;
		System.out.println("8. bit and(&) 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("=======================================");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data & n), data & n));
		System.out.println();	// 결과값 0
		
		System.out.println("9. bit or(|) 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("=======================================");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data | n), data | n));
		System.out.println();	// 결과값 100 (data)
		
	}
}
