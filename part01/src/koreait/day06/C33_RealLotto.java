package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//	�ۼ��� : �̰���
	public static void main(String[] args) {
		int[] numbers = new int[45];
		Random r = new Random();
		
		for(int i = 0; i < 45; i++) {			// �ε����� ����: 0 ~ 44	==> ������ ������ ��
			numbers[i] = i + 1;					// ���� ���� : 1 ~ 45		==> lotto �迭�� ����Ǵ� ��
		}
		
		System.out.println("numbers �迭 �ʱⰪ ---------------------");
		System.out.println(Arrays.toString(numbers));		// lotto ��ȣ�� �� �� �ִ� ��ȣ ����
		System.out.println("--------------------------------------");
		
		int[] lotto = new int[6];					// �ζ� ��ȣ(��)�� ���� �迭 ����
		int k;					// ���� ���� �ε����� ������ ���Ѵ�.
		for (int cnt = 0; cnt < 6; cnt++) {			// cnt�� 0�� ��, k(�ε���)�� 44���� �����ϴ�.
			k = r.nextInt(45 - cnt);				// cnt�� 1�� ��, k(�ε���)�� 43���� �����ϴ�.
													// (�ݺ��ϴٰ� ������) cnt�� 5�� ��, k(�ε���)�� 39���� �����ϴ�.
			
			System.out.println("k = " + k + ", number = " + numbers[k]);	// k(�ε���)�� �� ��(�ζ� ��ȣ)�� ����Ѵ�.
			
			lotto[cnt] = numbers[k];				// ����� ��(�ζ� ��ȣ)�� lotto �迭�� ��´�.
													// numbers �迭���� ������ ���� �ε��� k�� ���� ����ȴ�.
			
			// k ��ġ�� ���� ����(����) : �ε��� k+1���� ������ ��ұ��� �������� �̵�
			for(int i = k; i < numbers.length - 1; i++) {	// numbers�� length�� 45�̹Ƿ�
				numbers[i] = numbers[i + 1];				// ����� k(�ε���)�� ���� �ε����� (k+1)�ε������� ������ �ε������� �̾Ƽ�
			}												// k(�ε���)���� ������ �ٷ� �� �ε������� ���� ���� �����Ѵ�.
															// ex: cnt = 0, k = 12�� ���, �ε��� 13���� ������ �ε���(44)���� �̾Ƴ���
															//     �ε��� 12���� ������ �ٷ� �� �ε���(43)������ ���� ������.
															// * Line 23���� �ε����� ������ �ϳ��� �پ��� ������, �ε��� 44�� �Ű澲�� �ʾƵ� �ȴ�.
					
			System.out.println(Arrays.toString(numbers));	// ���� ��ȣ�� ����Ѵ�.
		} // ==> 6�� �ݺ��Ѵ�. (cnt = 0, 1, 2, 3, 4, 5)
		
		System.out.println("���� ���� ���� : ");
		System.out.println(Arrays.toString(lotto));			// ���� ���� ���� ���
		
		Arrays.sort(lotto);									// �������� ����(����, sort)
		System.out.println(Arrays.toString(lotto));
	}
	

}
