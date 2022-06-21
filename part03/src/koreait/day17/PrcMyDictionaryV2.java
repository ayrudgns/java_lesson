package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import koreait.day16.Word;

public class PrcMyDictionaryV2 {
// �ۼ��� : juleeus	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();
		
		try {
			read(mywords, "D:\\Iclass\\���ǿ��ѻ���2.txt");
		} catch (FileNotFoundException e1) {
			System.out.println("������ �д� ���� ���� �߻� :" + e1.getMessage());
		}
		
		String eng;
		String kor;
		int level;
		boolean go = true;
		
		while(go) {			// go�� false�� �� ������ �ݺ�.
			System.out.println("���� ��� : 1. �ܾ� ���� | 2. �ܾ� �˻� | 3. �ܾ��� ��ü ���� | 4. ������ �˻� | 5. ���α׷� ������");
			System.out.print("���� => ");
			String x = sc.nextLine();
 			switch (x) {		// �Է��� x�� ���� case �з�
				case "1":		
					System.out.print("English => ");	// ���� �ܾ� �Է�
					eng = sc.nextLine();
					System.out.print("Korean => ");		// �ѱ� �� �Է�
					kor = sc.nextLine();
					System.out.print("Level => ");		// ���̵� �Է�
					level = Integer.parseInt(sc.nextLine());	// ���̵� ����
					Word w = new Word(eng, kor, level);
					
					if(0 < w.getLevel() && 3 >= w.getLevel()) {
						mywords.add(w);				// mywords�� eng, kor, level ���� �Ϸ�
						System.out.println("����Ǿ����ϴ�.");
					} else {
						System.out.println("���̵��� ������ 1 ~ 3 �Դϴ�. ���� ����");	// ���̵� ���� �����ϱ�.
					}
					break;
					
				case "2":
					System.out.print("�˻� �ܾ� English => ");	// ���ܾ� �˻�
					eng = sc.nextLine();
					
					for(Word e : mywords) {
						if(e.getEnglish().equals(eng)) {
							System.out.println("�ܾ��� �˻��߽��ϴ�. ��� => " + e.getKorean());
						} else {
							
						}
					}
					break;
				
				case "3":		
					all(mywords);		// �����ϰ� ����ϴ� �޼ҵ� �����.
					break;
					
				case "4":		// �߰� => ������ �˻��ϱ�.
					System.out.print("�˻��� ���� �Է�(1 ~ 3) -> ");
					int no = Integer.parseInt(sc.nextLine());
					level(mywords, no);
					break;
				
				case "5":		// �մ�� ����
					go = false;			// go �� false�� �Ǵϱ� while�� ����
					break;
	
				default:		// �մ�� ����
					System.out.println("�߸� �Էµ� ���Դϴ�. �ٽ� �Է��ϼ���. (���� : 1 ~ 5)");
					break;
			}
		}	// while�� ����.
		
		try {
			save(mywords, "D:\\Iclass\\���ǿ��ѻ���2.txt");		// mywords�� ���Ͽ� ����س���. (�����Ѵ�.)
		} catch (FileNotFoundException e) {
			System.out.println("���� ���� �� ���� �߻� : " + e.getMessage());
		}
		System.out.println("�ܾ��� ����");
	}

	// ���Ͽ� ����ϱ�
	private static void save(List<Word> mywords, String filename) throws FileNotFoundException{
		File file = new File(filename);				// file ��ü ����
		PrintWriter pw = new PrintWriter(file);		// file�� pw�� ���Ͽ� ����س���
		for(Word w : mywords) {			
			pw.println(w);							// file�� w �����ϱ�
		}
		pw.close();
		System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
	}

	// ���Ͽ��� �о����
	private static void read(List<Word> mywords, String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner scsc = new Scanner(file);
		
		while(scsc.hasNext()) {
			String tmp = scsc.nextLine();
			System.out.println(tmp.substring(0, tmp.indexOf("(")));
			StringTokenizer stk = null;
			
			stk = new StringTokenizer(tmp.substring(0, tmp.indexOf("(")));
			Word w = new Word(stk.nextToken(), stk.nextToken(), Integer.parseInt(stk.nextToken()));
			mywords.add(w);
			System.out.println("mywords�� ������ �Ϸ�Ǿ����ϴ�.");
		}
		scsc.close();
		System.out.println("���� �о���� �Ϸ�");
		
	}
		
	private static void level(List<Word> mywords, int no) {
		
		for(Word w : mywords) {
			if(w.getLevel() == no) {
				System.out.println(w);
			}
		}

	}

	private static void all(List<Word> mywords) {			// mywords�� �����ϰ� ����ϴ� �޼ҵ�.
		
		mywords.sort(new Comparator<Word>() {
			
			@Override
			public int compare(Word o1, Word o2) {				// mywords ����!
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20s %-20s\t %-10s", "English", "Korean", "level"));	// ���ڰ� ���
		System.out.println("================================================================================");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %-10d", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
		
	}
}
