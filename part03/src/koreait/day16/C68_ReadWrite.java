package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Exception ó�� ����� ������ �޼ҵ忡�� ���ǵ� ��, �ٸ� ��� �̿��ϱ� (��� 1, ��� 2)
public class C68_ReadWrite {
	
	public static void main(String[] args) {
		// main �޼ҵ尡 throws Exception�� �Ѵٸ� JVM�� ���޵ȴ�.
		// ó�� ������ printStackTrace() ����� �����ϴ�.
		String filename = "D:\\Iclass\\�׽�Ʈ��Ʈ.txt";
		
		try {
			fileWrite2(filename);
//			filename = "D:\\Iclass\\�׽�Ʈ��Ʈ13.txt";	// ���� ���� �׽�Ʈ��
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("����� ���� ���� : " + e.getMessage());
			System.out.println("������ �����ϴ��� Ȯ���ϼ���.");
		}
	}
	
// Exception ó�� ����� ������ �޼ҵ忡�� ���ǵ� ��, �ٸ� ��� �̿��ϱ� (��� 1, ��� 2)	
	
	// ��� 1 : Exception�� try~catch������ ���� ó���ϴ� �޼ҵ�. 
	public static void fileWrite(String filename) {		// C65�� Line 13 ~ 31������ �޼ҵ�� ��������.
													
		File file = new File(filename);
		// ������ �޼ҵ� : java.io.PrintWriter.PrintWriter(File file) throws FileNotFoundException
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);		// file�� ������ ��ġ�� ����ϱ� ���� ��ü
			pw.println("��� 90 89 82");
			pw.println("���� 89 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");		// System.out : ǥ�� ��� (�ֿܼ� ���)
			// ��� ��ɿ��� ������ ������ �ڵ����� ������ ��������� ��ɵ� �ִ�.
		} catch (FileNotFoundException e) {	
			System.out.println("���� �߻� : " + e.getMessage());
		} finally {
			pw.close();
		}
	}
	
	// ��� 2 : throws Ű����� �ش� Exception(�� �޼ҵ忡���� FileNot~)�� ȣ���� ��(���⼭�� main �޼ҵ�)���� �ѱ��. ���ѱ�� ����?
	//			�� throws �ڿ� �޸�(,)�� ��� ���� ���ܸ� ������ �� �ִ�.
	// Exception�� ó���ؾ� �� �޼ҵ尡 ���� ���ǵǾ��� ���ǰ� ���� ��, �� ������ ��� ó���� �� �ִٴ� ������ �ִ�.
	
	public static void fileWrite2(String filename) throws FileNotFoundException {		// throws �̿�.
		
		File file = new File(filename);
		
		PrintWriter pw = null;
			pw = new PrintWriter(file);		// file�� ������ ��ġ�� ����ϱ� ���� ��ü
			pw.println("��� 90 89 82");
			pw.println("���� 89 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");		// System.out : ǥ�� ��� (�ֿܼ� ���)
			// ��� ��ɿ��� ������ ������ �ڵ����� ������ ��������� ��ɵ� �ִ�.
			pw.close();
	}
	
	public static void fileRead(String filename) throws FileNotFoundException {
		
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		sc.close();
	}
}
	
