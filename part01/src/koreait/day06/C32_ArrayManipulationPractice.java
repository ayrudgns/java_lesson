package koreait.day06;

import java.util.Arrays;

public class C32_ArrayManipulationPractice {
	public static void main(String[] args) {
		// �迭����� ���� / ����
		int[] test = {11, 22, 33, 44, 55, 66, 77};
		for(int i = 0; i <test.length; i++) {			// ���� test �迭
			System.out.print(test[i] + "\t");
		}
		System.out.println();
		// �ε��� 4�� ������ �� - ������(�ε��� ���� ����)���� �̵�
		for(int i = test.length - 2; i >= 4; i--) {		// �ε��� 5, 4�� ���
			test[i + 1] = test[i];						// �ε��� 6, 5�� ����
		}
		test[4] = 111;									// �ε��� 4�� ������� 111 ����
		
		for(int i = 0; i < test.length; i++) {
			System.out.print(test[i] + "\t"); 
		}
		System.out.println();
		System.out.println();
		
		int[] test2 = {11, 22, 33, 44, 55, 66, 77};
		for(int i = 0; i < test2.length; i++) {			// ���� test2 �迭
			System.out.print(test2[i] + "\t");
		}

		// �ε��� 3�� ������ �� - ����(�ε��� ���� ����)���� �̵�
		for(int i = 4; i < test2.length; i++) {			// �ε��� 4, 5, 6�� ���
			test2[i - 1] = test2[i];					// �ε��� 3, 4, 5�� ����
		}												// ��. �ε��� 6�� �״���̴�.
		System.out.println();
		for(int i = 0; i < test2.length; i++) {
			System.out.print(test2[i] + "\t");
		}
		System.out.println();
		System.out.println();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		for(int i = arr.length - 1; i > arr.length - 3; i--) {		// ���
			arr[i] = arr[i - 1];									// �о��
		}
		System.out.println(Arrays.toString(arr));
		arr[2] = 0;													// ��ü�ϱ�
		System.out.println(Arrays.toString(arr));
	}

}
