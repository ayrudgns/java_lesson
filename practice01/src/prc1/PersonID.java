package prc1;

import java.util.Arrays;

public class PersonID {
	public static void main(String[] args) {
		
		int[] idArr = {9, 5, 0, 8, 0, 1, 1, 1, 7, 3, 8, 1, 8};
		int[] idArrCon = new int[idArr.length - 1];
		
		int sum = 0;
		int age;
		System.out.println(Arrays.toString(idArr));

		for(int i = 0; i < idArr.length - 1; i++) {
			if(i < 8) {
				idArrCon[i] = idArr[i] * (i + 2);
			} else {
				idArrCon[i] = idArr[i] * (i - 6);
			}
		}
		
		System.out.println(Arrays.toString(idArrCon));
		System.out.println();
		
		for(int i = 0; i < idArrCon.length; i++) {
			sum += idArrCon[i];
		}
		System.out.println("sum = " + sum);
		
		int result = sum % 11;
		System.out.println("result = " + result);

		if(result / 10 != 0) {			// ���ڸ��̸�
			result = result % 10;
		}
		result = 11 - result;
		System.out.println();
		
		if(result == idArr[12]) {
			System.out.println("��ȿ�� �ֹε�Ϲ�ȣ�Դϴ�.");
		} else {
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		
		if(idArr[6] == 1 || idArr[6] == 3) {
			System.out.println("������ �����Դϴ�.");
		} else if(idArr[7] == 2 || idArr[7] == 4) {
			System.out.println("������ �����Դϴ�.");
		} else {
			System.out.println("���� Ȯ���� �Ұ����մϴ�.");
		}
		
		if(idArr[6] == 1 || idArr[6] == 2) {
			age = 2022 - (1900 + idArr[0] * 10 + idArr[1]);
			System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		} else if (idArr[7] == 3 || idArr[7] == 4) {
			age = 2022 - (2000 + idArr[0] * 10 + idArr[1]);
			System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		}
		
		System.out.println();
		System.out.println("���α׷� ����.");

	}

}
