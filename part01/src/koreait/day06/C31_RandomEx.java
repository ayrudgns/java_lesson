package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {
	public static void main(String[] args) {
		/*
		 *  학생 성적(국어) 분포 보고서를 만든다.
		 *  학생 인원은 100명 - 점수는 랜덤값으로 테스트 ( 범위 : 0 <= 난수 <= 100 )
		 *  
		 *  90 ~ 100 : x명 (y.y %)	// 퍼센트는 소수점 한자리, count 변수 5개가 필요함.
		 *  												ㄴ counts[5] 배열 생성 후 counts[0]에 x명 저장
		 *  80 ~ 89 : x명 (y.y %)	// 퍼센트는 소수점 한자리, counts[1]에 x명 저장	
		 *  70 ~ 79 : x명 (y.y %)	// 퍼센트는 소수점 한자리, counts[2]에 x명 저장
		 *  60 ~ 69 : x명 (y.y %)	// 퍼센트는 소수점 한자리, counts[3]에 x명 저장
		 *  60 미만 : x명 (y.y %)		// 퍼센트는 소수점 한자리, counts[4]에 x명 저장
		 */
		int[] koreans = new int[100];
		int[] counts = new int[5];
//		double[] per = new double[5];
		
		Random r = new Random();
		
		for (int i = 0; i < 100; i++) {		// 점수 입력받기
			koreans[i] = r.nextInt(101);
		}
		
		for (int i = 0; i < koreans.length; i++) {	// ** 점수 분포 카운트하기 **
			if (koreans[i] >= 90) {				// 조건을 (90 <= koreans[i] && 100 > koreans[i])
				counts[0]++;					// 로 할 필요가 없다.
			} else if (koreans[i] >= 80) {		// else if에 이미 범위 제한이 있기 때문에!
				counts[1]++;					// 90 <= koreans[i]만 써주는 것이 좋다.
			} else if (koreans[i] >= 70) {		
				counts[2]++;					// counts[0] += 1; 보다 counts[0]++이 더 보기 좋다.
			} else if (koreans[i] >= 60) {		
				counts[3]++;
			} else {
				counts[4]++;
			}
		}
		// 점수 분포 결과 출력하기: 이건 내가 한거
//		System.out.println(Arrays.toString(koreans));
		// counts 배열값 출력
//		System.out.println(Arrays.toString(counts));
//		System.out.println();
//		System.out.println("90~100\t\t80~89\t\t70~79\t\t60~69\t\t60 미만");
//		System.out.println("===========================================================================");
//		for(int i = 0; i < counts.length; i++) {
//			// counts 배열값으로 백분율 구하고 출력하기
//			per[i] = ((double)(counts[i]) / 100) * 100;		// 나누기 100 말고 나누기 koreans.length가 더 낫다.
//			System.out.printf("%d%s(%.1f%%)\t", counts[i], "명", per[i]);
//		}	// 나는 per를 썼지만 굳이 안써도 된다. 여기까지 내가 한거!
		
		// 점수 분포 결과 출력하기: 강사님이 하신거
		System.out.println(Arrays.toString(koreans));
		System.out.println(Arrays.toString(counts));
		System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60미만");
		System.out.printf("%8s %8s %8s %8s %8s\n", "90~100", "80~89", "70~79", "60~69", "60미만");
		System.out.println("---------------------------------------------");
		for(int i = 0; i < counts.length; i++) {
			// counts 배열값 출력
			System.out.printf("%8d ", counts[i]);
		}
		System.out.println();
		for (int i = 0; i < counts.length; i++) {
			// counts 배열값으로 백분율 구하고 출력하기
			System.out.printf("%8.1f%%", (double)counts[i]/koreans.length * 100);
		}	// 여기까지 강사님이 하신거!
		
		// 배열에서 기능이 향상(데이터 삭제 및 삽입, 크기 변경)된 것이 자바 ArrayList
		// 배열에서는 직접 데이터를 삭제 및 삽입해야한다. => 메소드를 정의함.
	}
}
