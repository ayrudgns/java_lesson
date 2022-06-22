package koreait.etc;

import java.util.UUID;

public class UUIDTest {
	public static void main(String[] args) {
		String uuid;
		
		System.out.println("1. UUID 10�� �����");
		for(int i = 0; i < 10; i++) {
		// 16���� 32�ڸ� + ������ ��ȣ 4���� ��������� ���� ���ڿ�
			uuid = UUID.randomUUID().toString();
			System.out.println((i + 1) + "��° uuid = " + uuid);
		}
		System.out.println();
		
		System.out.println("2. UUID ������ ���� 10�� �����");
		for(int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println((i + 1) + "��° uuid = " + uuid.replace("-", ""));
		}
		System.out.println();
		
		System.out.println("3. UUID 12�ڸ������� 10�� �����");
		for(int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println((i + 1) + "���� uuid = " + uuid.replace("-", "").substring(0, 12));
		}
		System.out.println();

		/*
		 *  ������?
		 *  ������ �ܺ� Library ���
		 *  
		 *  git ��ū�� : ��ū ����
		 *  ������Ʈ���� ȸ������ �� ��й�ȣ�� �����Ѵ�. (password ����)
		 *  ������ ��й�ȣ�� �������� ��� �����ɱ�?
		 *  ==> �ؽ� �Լ�(Hash function, ��ȣȭ�� �ȵǴ� �Լ�)�� �̿��ؼ� ���ڿ��� ���� �ĺ����� ����� �����Ѵ�.
		 *  ==> ��й�ȣ 1234�� ���� �ؽ��Լ� �� ����. �α��� 1234
		 *  ==> ��ǥ���� �ؽ� �Լ� : sha256 �˰���
		 *  (�������� ���� ���� : MessageDigest Ŭ���� ���)
		 *  
		 *  ��ȣȭ : �� ~> ��ȣ��, ��ȣȭ : ��ȣ�� ~> �� (���� key�� ���� key�� �̿�)
		 * 
		 */
		
	}
}
