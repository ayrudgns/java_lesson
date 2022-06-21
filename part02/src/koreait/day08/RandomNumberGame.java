package koreait.day08;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
// https://blog.naver.com/jaeminkim90/222540932926 ==> 개어렵네;
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== 랜덤 숫자 맞추기 게임 ========");
		System.out.println("1. 플레이 | 2. 최고 기록 보기 | 3. 종료");
		System.out.print("번호를 입력하세요. >>> ");
		int button = sc.nextInt();
		int num;				// 입력값
		int score;				// 점수
		
		if(button == 1) {
			int answer = r.nextInt(100) + 1;
			score = 1;
			do {
				System.out.print("숫자를 맞춰보세요. >>> ");
				num = sc.nextInt();
				
				if(num > answer) {
					System.out.println("DOWN");
					score++;
				} else if (num < answer) {
					System.out.println("UP");
					score++;
				} if(num == answer) {
					System.out.println("정답입니다!" + " 정답: " + answer + ", 시도 횟수 : " + (score - 1));
					System.out.println("점수는 " + score + "점 입니다.");
					break;
				}
			} while (num != answer);
			
		} else if (button == 2) {
			
		} else if (button == 3) {
			
		} 
		sc.close();
	}

}
