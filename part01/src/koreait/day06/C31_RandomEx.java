package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {
	public static void main(String[] args) {
		/*
		 *  �л� ����(����) ���� ������ �����.
		 *  �л� �ο��� 100�� - ������ ���������� �׽�Ʈ ( ���� : 0 <= ���� <= 100 )
		 *  
		 *  90 ~ 100 : x�� (y.y %)	// �ۼ�Ʈ�� �Ҽ��� ���ڸ�, count ���� 5���� �ʿ���.
		 *  												�� counts[5] �迭 ���� �� counts[0]�� x�� ����
		 *  80 ~ 89 : x�� (y.y %)	// �ۼ�Ʈ�� �Ҽ��� ���ڸ�, counts[1]�� x�� ����	
		 *  70 ~ 79 : x�� (y.y %)	// �ۼ�Ʈ�� �Ҽ��� ���ڸ�, counts[2]�� x�� ����
		 *  60 ~ 69 : x�� (y.y %)	// �ۼ�Ʈ�� �Ҽ��� ���ڸ�, counts[3]�� x�� ����
		 *  60 �̸� : x�� (y.y %)		// �ۼ�Ʈ�� �Ҽ��� ���ڸ�, counts[4]�� x�� ����
		 */
		int[] koreans = new int[100];
		int[] counts = new int[5];
//		double[] per = new double[5];
		
		Random r = new Random();
		
		for (int i = 0; i < 100; i++) {		// ���� �Է¹ޱ�
			koreans[i] = r.nextInt(101);
		}
		
		for (int i = 0; i < koreans.length; i++) {	// ** ���� ���� ī��Ʈ�ϱ� **
			if (koreans[i] >= 90) {				// ������ (90 <= koreans[i] && 100 > koreans[i])
				counts[0]++;					// �� �� �ʿ䰡 ����.
			} else if (koreans[i] >= 80) {		// else if�� �̹� ���� ������ �ֱ� ������!
				counts[1]++;					// 90 <= koreans[i]�� ���ִ� ���� ����.
			} else if (koreans[i] >= 70) {		
				counts[2]++;					// counts[0] += 1; ���� counts[0]++�� �� ���� ����.
			} else if (koreans[i] >= 60) {		
				counts[3]++;
			} else {
				counts[4]++;
			}
		}
		// ���� ���� ��� ����ϱ�: �̰� ���� �Ѱ�
//		System.out.println(Arrays.toString(koreans));
		// counts �迭�� ���
//		System.out.println(Arrays.toString(counts));
//		System.out.println();
//		System.out.println("90~100\t\t80~89\t\t70~79\t\t60~69\t\t60 �̸�");
//		System.out.println("===========================================================================");
//		for(int i = 0; i < counts.length; i++) {
//			// counts �迭������ ����� ���ϰ� ����ϱ�
//			per[i] = ((double)(counts[i]) / 100) * 100;		// ������ 100 ���� ������ koreans.length�� �� ����.
//			System.out.printf("%d%s(%.1f%%)\t", counts[i], "��", per[i]);
//		}	// ���� per�� ������ ���� �Ƚᵵ �ȴ�. ������� ���� �Ѱ�!
		
		// ���� ���� ��� ����ϱ�: ������� �ϽŰ�
		System.out.println(Arrays.toString(koreans));
		System.out.println(Arrays.toString(counts));
		System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60�̸�");
		System.out.printf("%8s %8s %8s %8s %8s\n", "90~100", "80~89", "70~79", "60~69", "60�̸�");
		System.out.println("---------------------------------------------");
		for(int i = 0; i < counts.length; i++) {
			// counts �迭�� ���
			System.out.printf("%8d ", counts[i]);
		}
		System.out.println();
		for (int i = 0; i < counts.length; i++) {
			// counts �迭������ ����� ���ϰ� ����ϱ�
			System.out.printf("%8.1f%%", (double)counts[i]/koreans.length * 100);
		}	// ������� ������� �ϽŰ�!
		
		// �迭���� ����� ���(������ ���� �� ����, ũ�� ����)�� ���� �ڹ� ArrayList
		// �迭������ ���� �����͸� ���� �� �����ؾ��Ѵ�. => �޼ҵ带 ������.
	}
}
