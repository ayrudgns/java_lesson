package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {
	
	public static void main(String[] args) {
		
		String filename = "D:\\Iclass\\�׽�Ʈ��Ʈ.txt";
//		String filename = "D:\\Iclass\\�׽�Ʈ��Ʈ2.txt";		// ���� ���� �׽�Ʈ.
															// ������ ���� ���� ���� �߻�.
		File file = new File(filename);
		
		// Scanner : �ܺο��� ��Ŭ������ �Է����ִ� ����� ���� Ŭ����
		// Unhandled exception type FileNotFoundException
		// : ������ ���ɼ��� �����Ƿ� try ~ catch ���� ���.
		// ctrl + 1 ������ �ڵ����� try ~ catch �� ������.
		Scanner sc = null;
		try {
			sc = new Scanner(file);		// System.in : ǥ�� �Է� (�ֿܼ� �Է�) ==> ������ ������ �о�´�.
/*			
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
*/
			while(sc.hasNext()) {		// ������ ���͸� �������� ���� �����Ͱ� ������ true ��ȯ.
				System.out.println(sc.nextLine());
			}
			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�.");
			
		} catch (FileNotFoundException e) {	
			// �Է� ��ɿ��� ������ ������ Exception�� �߻��Ѵ�.
			System.out.println("����� ���� �߻� : " + e.getMessage());
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	
	}
}


// try ~ catch �ڿ� ���� ����� finally�� �ϰ� ������, �̴� �������̴�.
// java 7 �������ʹ� �޶����µ�, �װ� ����~ finally�� ���� �ʴ� ���� ������~
//								�� try with resources
// ���� �������̽��� ���������� ã�ƺ���	==> AutoCloseable �������̽�
// �� �ϰ� ���� �÷����� �յ��!! ����� ���� �׽�Ʈ�ϱ� ���� 1����.
