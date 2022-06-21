package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String best;			// 특기과목명을 참조할 변수
		int korean, english, science, max;
		
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.println("성적을 입력하세요.");
		System.out.print("국어 -> ");
		korean = sc.nextInt();
		System.out.print("영어 -> ");
		english = sc.nextInt();
		System.out.print("과학 -> ");
		science = sc.nextInt();
		System.out.println();
		
		int sum = korean + english + science;
		double avg = (double)(korean + english + science) / 3;
		
		System.out.println(">> 처리되었습니다.");
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %d (%.2f) , 과목수 : 3\n", (int)avg, avg);
		
//		if (korean > english) {
//			if (korean > science) {
//				best = "국어";
//			} else { 
//				best = "과학";
//			}
//		} else {
//			if (english > science) {
//				best = "영어";
//			} else { 
//				best = "과학";
//			}
//		}							// 내가 한거 ==> max 변수를 안썼음. 점수를 신경을 안써서..
		
		if (korean > english) {
			max = korean;
			best = "국어";
		} else {
			best = "영어";
			max = english;
		}
		
		if (max < science) {
			best = "과학";
			max = science;
		}							// 이게 더 간단하다.
		
		System.out.printf("이 학생의 특기과목은 . %s (%d점) . 입니다.", best, max);
		
		sc.close();
	}

}
