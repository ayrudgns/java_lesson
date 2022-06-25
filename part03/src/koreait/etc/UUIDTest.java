package koreait.etc;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.UUID;

import com.google.common.hash.Hashing;

public class UUIDTest {
// ���� : https://ko.wikipedia.org/wiki/%EB%B2%94%EC%9A%A9_%EA%B3%A0%EC%9C%A0_%EC%8B%9D%EB%B3%84%EC%9E%90
// ���� : http://daplus.net/java-java%EC%97%90%EC%84%9C-uuid-%EB%AC%B8%EC%9E%90%EC%97%B4%EC%9D%84-%EC%83%9D%EC%84%B1%ED%95%98%EB%8A%94-%ED%9A%A8%EC%9C%A8%EC%A0%81%EC%9D%B8-%EB%B0%A9%EB%B2%95-%EB%8C%80%EC%8B%9C%EC%97%86/
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
		 *  ==> ��ǥ���� �ؽ� �Լ� : sha256 �˰��� (�������� ���� ���� : MessageDigest Ŭ���� ���)
		 *  
		 *  ��ȣȭ : �� ~> ��ȣ��, ��ȣȭ : ��ȣ�� ~> �� (���� key�� ���� key�� �̿�)
		 * 
		 */
		
		// google guava ���̺귯������ �����ϴ� sha256 �ؽ� �Լ� ����غ���
		
		String password;	// raw (��)
		String sha256 = Hashing.sha256()
				.hashString("test#12", StandardCharsets.UTF_8)
				.toString();	// sha256���� ������� �ؽ̰�, ������ ����� ���̶�� ����
		System.out.println("sha256�� �� : " + sha256);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ�� �Է��ϼ���. >>> ");
		String you = sc.nextLine();			// raw
		password = Hashing.sha256().hashString(you, StandardCharsets.UTF_8)
				.toString();
		System.out.println("�Է��� ���� sha256 �� : " + password);
		
		if(sha256.equals(password)) {			// �ؽ̰� ��
			System.out.println("��ȣ�� ��ġ�մϴ�.");
		} else {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		}

	}
}
