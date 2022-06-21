package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//	작성자 : 이경훈
	public static void main(String[] args) {
		int[] numbers = new int[45];
		Random r = new Random();
		
		for(int i = 0; i < 45; i++) {			// 인덱스의 범위: 0 ~ 44	==> 난수로 뽑히는 값
			numbers[i] = i + 1;					// 값의 범위 : 1 ~ 45		==> lotto 배열에 저장되는 값
		}
		
		System.out.println("numbers 배열 초기값 ---------------------");
		System.out.println(Arrays.toString(numbers));		// lotto 번호가 될 수 있는 번호 나열
		System.out.println("--------------------------------------");
		
		int[] lotto = new int[6];					// 로또 번호(값)를 담을 배열 생성
		int k;					// 뽑힐 값의 인덱스를 난수로 정한다.
		for (int cnt = 0; cnt < 6; cnt++) {			// cnt가 0일 때, k(인덱스)는 44까지 가능하다.
			k = r.nextInt(45 - cnt);				// cnt가 1일 때, k(인덱스)는 43까지 가능하다.
													// (반복하다가 마지막) cnt가 5일 때, k(인덱스)는 39까지 가능하다.
			
			System.out.println("k = " + k + ", number = " + numbers[k]);	// k(인덱스)와 그 값(로또 번호)를 출력한다.
			
			lotto[cnt] = numbers[k];				// 출력한 값(로또 번호)을 lotto 배열에 담는다.
													// numbers 배열에서 난수로 뽑힌 인덱스 k의 값이 저장된다.
			
			// k 위치의 값을 제거(삭제) : 인덱스 k+1부터 마지막 요소까지 왼쪽으로 이동
			for(int i = k; i < numbers.length - 1; i++) {	// numbers의 length는 45이므로
				numbers[i] = numbers[i + 1];				// 출력한 k(인덱스)의 다음 인덱스인 (k+1)인덱스부터 마지막 인덱스까지 뽑아서
			}												// k(인덱스)부터 마지막 바로 앞 인덱스까지 값에 각각 대입한다.
															// ex: cnt = 0, k = 12인 경우, 인덱스 13부터 마지막 인덱스(44)까지 뽑아내서
															//     인덱스 12부터 마지막 바로 앞 인덱스(43)까지의 값에 덮어씌운다.
															// * Line 23에서 인덱스의 범위가 하나씩 줄어들기 때문에, 인덱스 44는 신경쓰지 않아도 된다.
					
			System.out.println(Arrays.toString(numbers));	// 남은 번호를 출력한다.
		} // ==> 6번 반복한다. (cnt = 0, 1, 2, 3, 4, 5)
		
		System.out.println("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));			// 최종 선택 숫자 출력
		
		Arrays.sort(lotto);									// 오름차순 정리(정렬, sort)
		System.out.println(Arrays.toString(lotto));
	}
	

}
