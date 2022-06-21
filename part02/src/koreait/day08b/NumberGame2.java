package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 7;		// 최대 시도횟수 
		int[] trialList = new int[max];			// 시도한 숫자 배열로 저장
		GameValue[] history = new GameValue[10];		// 최대 10개 기록을 저장하기
		int k = 0;								// history 배열의 인덱스 변수
		
		System.out.println("숫자 맞추기 게임을 시작합니다.");
		System.out.print("게임을 시작하려면 너, 휴먼의 이름을 쓰시오. >>> ");
		String gamer = sc.nextLine();
		int rmin = 11, rmax = 29;
		
		do {	// 여기서부터
			GameValue temp = new GameValue(gamer);
			System.out.println("이제 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
			System.out.println(String.format("너, 휴먼은 맞춰보세요. (범위 : %d ~ %d)", rmin, rmax));
			int numComputer = GameValue.makeNumber(rmin, rmax);				// 컴퓨터의 난수 설정
			int numHuman;										// 휴먼의 숫자 입력
			int i = 0;
			
			do {
				System.out.print("생각한 숫자 입력 ( 기회 : " + (max - i) + " ) -> ");
				numHuman = sc.nextInt();
				
				if (numComputer > numHuman) {		// 정답 > 입력값이면
					trialList[i] = numHuman;			// 시도한 숫자 배열에 추가하고
					i++;							// 시도횟수 카운트 -1
					System.out.println("아닙니다. 더 큰 값입니다.");
				} else if (numComputer < numHuman) {		// 정답 < 입력값이면
					trialList[i] = numHuman;					// 시도한 숫자 배열에 추가하고
					i++;									// 시도횟수 카운트 -1
					System.out.println("아닙니다. 더 작은 값입니다.");
				}
			
				if (i == max) {					// 시도횟수가 최대 시도횟수에 도달하면
					break;						// 빠져나오기
				}
				
			} while (numComputer != numHuman);	// 정답과 입력값이 같지 않은 동안 계속
			
			if (i == max) {				// 시도횟수가 최대 시도횟수에 도달하면
					System.out.println("너 휴먼 입력 내용 : " + Arrays.toString(trialList));
					System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요. 정답은 " + numComputer + "입니다.");
					temp.setCount(i);
			} else {					// 시도횟수가 최대 시도횟수에 도달하기 전에 정답을 맞추면
					System.out.println("딩동댕~ 정답입니다. 성공까지 시도 횟수 : " + (i + 1));
					temp.setCount(i + 1);
					temp.setSuccess(true);
			}
			// 여기까지 계속 반복.
			
			// 위의 게임 결과(GameValue 객체에 저장)를 history 배열에 저장
			history[k] = temp;			// temp는 GameValue 객체의 참조값이다.
			k++;			// 다음 인덱스값, 카운트 역할(게임한 횟수)
			
			System.out.print("게임을 계속하시겠습니까? 계속하려면 0 입력 >>> ");
		} while (sc.nextInt() == 0);
		
		System.out.println("::::::::::: 게임 스코어 :::::::::::");
		// for문으로 history 배열에 저장된 값 출력하기
		for(int j = 0; j < k; j++) {
			history[j].print();			// history[j]의 타입은 GameValue
		}
		System.out.println("::::::::::: The End :::::::::::");
		sc.close();
	}

}
