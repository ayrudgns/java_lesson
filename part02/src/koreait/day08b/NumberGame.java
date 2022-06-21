package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 7;		// 최대 시도횟수 
		int[] triallst = new int[max];			// 시도한 숫자 배열로 저장	
		
		System.out.println("숫자 맞추기 게임을 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
		System.out.println("너, 휴먼은 맞춰보세요. (101 ~ 299)");
		int numComputer = r.nextInt(199) + 101;				// 컴퓨터의 난수 설정
		int numHuman;										// 휴먼의 숫자 입력
		int i = 0;
		
		do {
			System.out.print("생각한 숫자 입력 ( 기회 : " + (max - i) + " ) -> ");
			numHuman = sc.nextInt();
			
			if (numComputer > numHuman) {		// 정답 > 입력값이면
				triallst[i] = numHuman;			// 시도한 숫자 배열에 추가하고
				i++;							// 시도횟수 카운트 -1
				System.out.println("아닙니다. 더 큰 값입니다.");
			} else if (numComputer < numHuman) {		// 정답 < 입력값이면
				triallst[i] = numHuman;					// 시도한 숫자 배열에 추가하고
				i++;									// 시도횟수 카운트 -1
				System.out.println("아닙니다. 더 작은 값입니다.");
			}
		
			if (i == max) {					// 시도횟수가 최대 시도횟수에 도달하면
				break;						// 빠져나오기
			}
		} while (numComputer != numHuman);	// 정답과 입력값이 같지 않은 동안 계속
		
		if (i == max) {				// 시도횟수가 최대 시도횟수에 도달하면
			System.out.println("너 휴먼 입력 내용 : " + Arrays.toString(triallst));
			System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요. 정답은 " + numComputer + "입니다.");
		} else {					// 시도횟수가 최대 시도횟수에 도달하기 전에 정답을 맞추면
			System.out.println("딩동댕~ 정답입니다. 성공까지 시도 횟수 : " + (i + 1));
		}
		
		sc.close();
	}

}
