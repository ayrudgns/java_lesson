package koreait.day06;

import java.util.Arrays;

public class C32_ArrayManipulationPractice {
	public static void main(String[] args) {
		// 배열요소의 삽입 / 삭제
		int[] test = {11, 22, 33, 44, 55, 66, 77};
		for(int i = 0; i <test.length; i++) {			// 원래 test 배열
			System.out.print(test[i] + "\t");
		}
		System.out.println();
		// 인덱스 4에 삽입할 때 - 오른쪽(인덱스 증가 방향)으로 이동
		for(int i = test.length - 2; i >= 4; i--) {		// 인덱스 5, 4를 골라서
			test[i + 1] = test[i];						// 인덱스 6, 5에 대입
		}
		test[4] = 111;									// 인덱스 4가 비었으니 111 대입
		
		for(int i = 0; i < test.length; i++) {
			System.out.print(test[i] + "\t"); 
		}
		System.out.println();
		System.out.println();
		
		int[] test2 = {11, 22, 33, 44, 55, 66, 77};
		for(int i = 0; i < test2.length; i++) {			// 원래 test2 배열
			System.out.print(test2[i] + "\t");
		}

		// 인덱스 3을 삭제할 때 - 왼쪽(인덱스 감소 방향)으로 이동
		for(int i = 4; i < test2.length; i++) {			// 인덱스 4, 5, 6을 골라서
			test2[i - 1] = test2[i];					// 인덱스 3, 4, 5에 대입
		}												// 끝. 인덱스 6은 그대로이다.
		System.out.println();
		for(int i = 0; i < test2.length; i++) {
			System.out.print(test2[i] + "\t");
		}
		System.out.println();
		System.out.println();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		for(int i = arr.length - 1; i > arr.length - 3; i--) {		// 골라서
			arr[i] = arr[i - 1];									// 밀어내고
		}
		System.out.println(Arrays.toString(arr));
		arr[2] = 0;													// 대체하기
		System.out.println(Arrays.toString(arr));
	}

}
