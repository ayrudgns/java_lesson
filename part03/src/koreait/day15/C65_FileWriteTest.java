package koreait.day15;

import java.io.File;			// io : input, output ����� ���õ� ��ɵ��� �ִ� Ŭ���� 
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {
	
	public static void main(String[] args) {
		
		String filename = "D:\\Iclass\\�׽�Ʈ��Ʈ.txt";
		
		File file = new File(filename);
		
		// PrintWriter : ��Ŭ�������� �ܺη� ����ϴ� ����� ���� Ŭ����
		// Unhandled exception type FileNotFoundException
		// : ������ ���ɼ��� �����Ƿ� try ~ catch ���� ���.
		// ctrl + 1 ������ �ڵ����� try ~ catch �� ������.
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);		// file�� ������ ��ġ�� ��Ŭ�������� �Է��ϴ� ���� ���Ͽ� ����ϱ� ���� ��ü�� ������.
//			System.out.println();���� System.out ��ſ� ���� ��� ��ü�� pw ���
			pw.println("��� 90 89 82");
			pw.println("���� 89 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");		// System.out : ǥ�� ��� (�ֿܼ� ���)
			// ��� ��ɿ��� ������ ������ �ڵ����� ������ ��������� ��ɵ� �ִ�.
		} catch (FileNotFoundException e) {	
			System.out.println("���� �߻� : " + e.getMessage());		// e.getMessage() : ���� �޼����� �����´�.
		} finally {
			pw.close();
		}
	
	}
}
