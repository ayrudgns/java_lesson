package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class C49_LottoTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 0; i < 45; i++) {
			numbers.add(i + 1);
		}
		System.out.println("numbers :");
		System.out.println(numbers);
		
		Random r = new Random();
		
		ArrayList<Integer> lotto = new ArrayList<>();
		
		int k;	// ������ ���� ���� �ε���
		
		for(int cnt = 0; cnt < 6; cnt++) {
			k = r.nextInt(45 - cnt);
			System.out.println("k = " + k + ", number = " + numbers.get(k));
			lotto.add(numbers.get(k));
			numbers.remove(k);		// ���� ���� �ش� �ε������� ����
			System.out.println("���� �� :");
			System.out.println(numbers);
		}
		System.out.println();
		
		System.out.println("���� ���� ���� 6�� :");
		System.out.println(lotto);
	}
// �迭�� ����� ���� ��ġ�� ����(���� �Ǵ� ����)�ϴ� �޼ҵ尡 ����, ũ�Ⱑ �����̱� ������ �迭���ٴ� ArrayList�� Ȱ���ϴ� ���� �����ϴ�.
// ����, �����α׷����� �� �� ArrayList�� �ʼ��̴�.
}