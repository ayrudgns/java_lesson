package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;


public class C67_ResourceClose {
// ��ó : https://blog.naver.com/zzang9ha/222064282210
// ���� : https://codechacha.com/ko/java-try-with-resources/
// ���� : https://codevang.tistory.com/142
	
	public static void main(String[] args) {
		// ���� ����
//		String filename = "D:\\Iclass\\�׽�Ʈ��Ʈ.txt";		// �б�: �����ϴ� ����
//		String filename1 = "D:\\Iclass\\�׽�Ʈ��Ʈ3.txt";		// ���� : �������� �ʴ� ����
		
		// ���� ��ȭ���� ����ϱ�
		String filename = fileDialogOpen();			// ������ ������ �����ϱ�
		String filename1 = fileDialogSave();		// ������ ������ ������ ã�ư��� ���ϸ��� ���� ���� + Ȯ���ڸ�
		// �ڹٿ��� ���� ������ ���� �� ���� ����! �ٵ� �ڹٿ��� ������ ���� ���� �ȵȴ�.
		// ��, �о�� �� �ִ� �ؽ�Ʈ ������ ���ڵ��� ��ġ�ؾ� �Ѵ�.
		// workspace�� UTF-8�̸� �ؽ�Ʈ ���� UTF-8 ���ĸ� ����
		// 			  MS949�̸� �ؽ�Ʈ ���� ANSI ���ĸ� ���� (�޸��� ������ �Ʒ��� ǥ�õǾ� ����.)
		File ifile = new File(filename);
		File ofile = new File(filename1);
		
		try (Scanner sc = new Scanner(ifile);
				PrintWriter pw = new PrintWriter(ofile)) {
			while(sc.hasNext()) {
				String temp = sc.nextLine();		// ���Ͽ��� �о�� �� ��
				System.out.println(temp);			// ǥ�� ��� (�ܼ�)
				pw.println(temp);					// ���� ���
			}
			System.out.println("���� ���� �Ϸ�");
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("����� ���� �߻�: " + e.getMessage());
			System.out.println("������ ������ �����ϴ�.");
		} catch (Exception e) {		// FileNotFoundException �̿��� ��� Exception ó��
			System.out.println("�� �� ���� ���� : " + e.getMessage());
		}
		
	}
	
/*
 * AutoCloseable �������̽�.
 * ���� Ŭ������ try-with-resources���� �ڿ��� �����Ǳ� ���Ѵٸ�
 * AutoCloseable�� implements�ؾ� �Ѵ�.
 * Scanner Ŭ������ PrintWriter Ŭ������ AutoCloseable�� ������ Ŭ����.
 * main������ �ش� ��ü�� try-with-resources�� ����ϰ� �ִ�.
 * ���� try���� ����� �� close() ������ ȣ�����ش�.
 */	
	
	// ������ ���� ã��
	public static String fileDialogOpen() {
	
	// �ܼ� ��������� �����ϴ� ���α׷� : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
	// �ڹٿ����� GUI�� ����� �ִ� Ŭ�������� �ִµ�, �� �� �ϳ��� ���� ��ȭ���ڸ� ����Ѵ�. ���̺귯���� awt,swing,javaFX ���� �ִ�.
	// Windows OS�� ���α׷����� Windows��� Ʋ �ȿ��� ��������µ�, �ڹٿ����� �� Ʋ�� �������̶� �Ѵ�.
				
		JFrame f = new JFrame();  // ���� ��ȭ���ڸ� ������ ������ ��ü ����
		
		FileDialog fdr = new FileDialog(f, "���� ����", FileDialog.LOAD);	// ���� ��ȭ���� ��ü ����
		fdr.setVisible(true);		// ���� ��ȭ���� ���̱�
		
		String filename = fdr.getDirectory() + fdr.getFile(); 	// ������ ������ ��ο� ���ϸ� ����
		System.out.println("������ ��ο� ���� : " + filename);
//		System.out.println("������ ��� : " + fdr.getDirectory() + ", ������ ���� : " + fdr.getFile());
		
		File file = new File(filename);
		System.out.println("������ ���� ũ�� : " + file.length() + "����Ʈ");
		
		return filename;
	}
	
	// ������ ���� �����ϱ�
	public static String fileDialogSave() {
		
		JFrame f = new JFrame();  // ���� ��ȭ���ڸ� ������ ������ ��ü ����
		
		FileDialog fdw = new FileDialog(f, "���� ����", FileDialog.SAVE);
		fdw.setVisible(true);
		
		String filename = fdw.getDirectory() + fdw.getFile(); 	// ������ ������ ��ο� ���ϸ� ����
		System.out.println("������ ��ο� ���� : " + filename);
		
		return filename;
	}

}
