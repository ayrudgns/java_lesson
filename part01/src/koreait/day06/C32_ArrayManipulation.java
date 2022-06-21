package koreait.day06;

public class C32_ArrayManipulation {
	public static void main(String[] args) {
		// 배열요소의 삽입 / 삭제
		int[] test = {11, 22, 33, 44, 55, 66, 77};
		for(int i = 0; i <test.length; i++) {			// 원래 test 배열
			System.out.print(test[i] + "\t");
		}
		System.out.println();
		// 인덱스 k에 삽입할 때 - 오른쪽(인덱스 증가 방향)으로 이동
		int k = 2;
		for(int i = test.length - 2; i >= k; i--) {		// index 5, 4, 3, 2를 골라서
//		for(int i = 2; i < test.length - 1; i++) {		// 오작동
			test[i + 1] = test [i];						// index 6, 5, 4, 3에 대입
		}
		test[k] = 23;									// index 2가 비었으니 23 대입하기 (대입하지 않으면 그대로이다.)
		for(int i = 0; i < test.length; i++) {
			System.out.print(test[i] + "\t"); 
		}
		System.out.println();
		System.out.println();
		System.out.println("=============================");
		int[] test2 = {11, 22, 33, 44, 55, 66, 77};
		for(int i = 0; i < test2.length; i++) {			// 원래 test2 배열
			System.out.print(test2[i] + "\t");
		}

		// 인덱스 k를 삭제할 때 - 왼쪽(인덱스 감소 방향)으로 이동
		for(int i = k + 1; i < test2.length; i++) {		// index 3, 4, 5, 6을 골라서
			test2[i - 1] = test2[i];					// index 2, 3, 4, 5에 대입
		}												// index 6은 그대로이다.
		System.out.println();
		for(int i = 0; i < test2.length; i++) {
			System.out.print(test2[i] + "\t");
		}
		
	}

}
