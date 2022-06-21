package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;
// �ۼ��� : �̰���
public class C28_IntArrayEx {
	
	/*
	 *  1. int �迭 (ũ�� 5)�� �����ϰ�, �̸��� nums
	 *  2. �迭 ����� ���� ����� �Է����� �����Ѵ�.
	 *  3. �Էµ� ���� �հ�, ����� ���Ѵ�.	==> �հ�� 2������ �Է¹��� for�� �ȿ��� ���� �ۼ��ϱ�.
	 *  4. �Էµ� ���� �ִ�, �ּڰ��� ���� ���ϴ� �޼ҵ带 �����.
	 *  	�� maxOfArray, minOfArray : ���ڴ� int �迭, ��ȯ���� int ����
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg;
		int[] nums = new int[5];		// step 1
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("index [" + i + "] ����� ���� �Է��ϼ���. >> ");
			nums[i] = sc.nextInt();						// step 2
			sum += nums[i];
		}
		avg = (double)sum / nums.length;
		
		System.out.println();
		System.out.println("������ �迭 : " + Arrays.toString(nums));
		System.out.println();
		System.out.println("�Է��� ����� �� : " + sum);		// step 3
		System.out.println("�Է��� ����� ��� : " + avg);		// step 3
		System.out.println();
		
		System.out.println("���� max : " + maxOfArray(nums));
		System.out.println("���� min : " + minOfArray(nums));
		
		sc.close();
	
	}

	// max, min ������ ���� �迭�� 0�� ��Ұ����� �ʱ�ȭ�Ѵ�.
	// �迭 ��� 1������ ������ ��ұ��� max, min�� ������� ���ؼ�
	// max�� �� ������ ������ (�Ǵ� min�� �� ������ ũ��) max(min)���� �迭 ��Ұ����� �����Ѵ�.
	// => �񱳰� ������ ���� max, min�� �����ȴ�.
	
	public static int maxOfArray (int[] array) {		// step 4
		int max = array[0];
		for(int i = 1; i < array.length; i++) {			// int i = 0; ���� int i = 1;�� ����.
			if(max < array[i]) {						// array[0]�� �̹� �ʱ�ȭ�� �����̹Ƿ� ���� ���� �ʿ䰡 ����.
				max = array[i];							// ���ʿ��� ������ ���̴� ���� ����!
			}
		}
		return max;
		// ���� : ����� main���� �����ų �� ���ϴ� �������� �ϵ��� �ϴ� ���� ����.
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
