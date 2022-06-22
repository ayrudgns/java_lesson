package koreait.etc;

public class BinaryTest {
	public static void main(String[] args) {
		
		System.out.println(String.format("%s\t %8s\t %8s", "10진수", "2진수", "16진수"));
		for(int i = 0; i < 100; i++) {
			System.out.println(String.format("%8d\t %8s\t %8s", i, 
					Integer.toBinaryString(i), Integer.toHexString(i)));
		}
	}
	
	/*
	 *  10진수 정수값을 다른 진법(진수)으로 문자열 변환
	 *  Integer.toBinaryString(i) => 2진수로 변환
	 *  Integer.toOctalString(i) => 8진수로 변환
	 *  Integer.toHexString(i) => 16진수로 변환
	 *  
	 *  int 형식은 4byte, 32bit
	 *  2진수는 32자리, 16진수로는 8자리
	 *  xxxx xxxx xxxx xxxx xxxx xxxx xxxx xxxx
	 *  10진수로는 값 범위가 -2147483648 ~ 2147483648
	 *  16진수로는 00000000 ~ ffffffff (32bit가 모두 1, -1)
	 *  
	 *  0xxx xxxx xxxx xxxx xxxx xxxx xxxx xxxx = 양수
	 *  1xxx xxxx xxxx xxxx xxxx xxxx xxxx xxxx = 음수
	 *  
	 *  1000 0000 0000 0000 0000 0000 0000 0000 = -2147483648
	 *  1111 1111 1111 1111 1111 1111 1111 1111 = -1
	 */
}
