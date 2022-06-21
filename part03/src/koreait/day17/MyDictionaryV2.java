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

public class MyDictionaryV2 {
// �ۼ��� : juleeus	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();
		
		try {
			System.out.print("���Ͽ��� �о�ñ��? (y / n) >>> ");
			if(ssc.nextLine().equals("y")) {
				read(mywords, "D:\\Iclass\\���ǿ��ѻ���.txt");
			// ���Ͽ��� ���� ���� �о�ͼ� �� ������ mywords ����Ʈ�� ����
			} else {
				System.out.println("������ ���� ����ϴ�.");
			}
		} catch (FileNotFoundException e1) {
			System.out.println("������ �д� ���߿� ������ �߻��߽��ϴ�. - " + e1.getMessage());
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
			System.out.print("���Ͽ� �����ұ��? (y / n) >>> ");
			if(ssc.nextLine().equals("y")) {
				// mywords ����Ʈ�� ������ ���Ͽ� �����ϱ�
				save(mywords, "D:\\Iclass\\���ǿ��ѻ���.txt");
			} else {
				System.out.println("������ ������� �ʾҽ��ϴ�.");
			}
		} catch (FileNotFoundException e) {
			System.out.println("���� ���� �߿� ������ ������ϴ�. - " + e.getMessage());

		}
		System.out.println("�ܾ��� ����");
	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException{
		// ���Ͽ� ����ϱ�
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords) {
			pw.println(w);
		}
		pw.close();
		System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
	}

	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		
		while (sc.hasNext()) {
			String temp = sc.nextLine();		// ���Ͽ��� �� �� �о�� �� ����
			System.out.println(temp.substring(0, temp.indexOf("(")));	// ��ü�� ���� �� �ʿ��� ���� �������� �׽�Ʈ
			StringTokenizer stk = null;									// �޸��忡�� (������) �̷� �ͱ��� �� ������.
			
			// ���� ����� �����, StringTokenizer�� Word ��ü�� ����� mywords ����Ʈ�� �߰��ϱ�.
			stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));	// ** ���پ� �о�´�.. **
			mywords.add(new Word(stk.nextToken(), 		// english �ʵ尪
						stk.nextToken(), 					// korean �ʵ尪
						Integer.parseInt(stk.nextToken())));		// level �ʵ尪
			System.out.println("mywords�� ������ �Ϸ�Ǿ����ϴ�.");
			// �ڵ��� �ϼ��Ǹ� 3�� ��ü���� �����غ���.
		}
		sc.close();
		System.out.println("���� �о���� �Ϸ�Ǿ����ϴ�.");
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
