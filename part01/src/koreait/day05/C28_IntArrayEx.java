package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;
// 작성자 : 이경훈
public class C28_IntArrayEx {
	
	/*
	 *  1. int 배열 (크기 5)을 선언하고, 이름은 nums
	 *  2. 배열 요소의 값은 사용자 입력으로 저장한다.
	 *  3. 입력된 값의 합계, 평균을 구한다.	==> 합계는 2번에서 입력받은 for문 안에서 수식 작성하기.
	 *  4. 입력된 값의 최댓값, 최솟값을 각각 구하는 메소드를 만든다.
	 *  	ㄴ maxOfArray, minOfArray : 인자는 int 배열, 반환값은 int 형식
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg;
		int[] nums = new int[5];		// step 1
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("index [" + i + "] 요소의 값을 입력하세요. >> ");
			nums[i] = sc.nextInt();						// step 2
			sum += nums[i];
		}
		avg = (double)sum / nums.length;
		
		System.out.println();
		System.out.println("생성된 배열 : " + Arrays.toString(nums));
		System.out.println();
		System.out.println("입력한 요소의 합 : " + sum);		// step 3
		System.out.println("입력한 요소의 평균 : " + avg);		// step 3
		System.out.println();
		
		System.out.println("최종 max : " + maxOfArray(nums));
		System.out.println("최종 min : " + minOfArray(nums));
		
		sc.close();
	
	}

	// max, min 변수를 각각 배열의 0번 요소값으로 초기화한다.
	// 배열 요소 1번부터 마지막 요소까지 max, min과 순서대로 비교해서
	// max가 그 값보다 작으면 (또는 min이 그 값보다 크면) max(min)값을 배열 요소값으로 변경한다.
	// => 비교가 끝나면 최종 max, min이 결정된다.
	
	public static int maxOfArray (int[] array) {		// step 4
		int max = array[0];
		for(int i = 1; i < array.length; i++) {			// int i = 0; 보다 int i = 1;이 낫다.
			if(max < array[i]) {						// array[0]은 이미 초기화된 상태이므로 굳이 비교할 필요가 없음.
				max = array[i];							// 불필요한 실행은 줄이는 것이 좋다!
			}
		}
		return max;
		// 권장 : 출력은 main에서 실행시킬 때 원하는 형식으로 하도록 하는 것이 좋다.
	}
	
	public static int minOfArray (int[] array) {		// step 4
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	
	
}
