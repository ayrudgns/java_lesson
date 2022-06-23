package koreait.prc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyDictionary {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		List<Word> mywords = new ArrayList<>();
		
		String kor, eng, x;
		int lev;
		boolean run = true;
		System.out.println("�ܾ����� �����մϴ�.");
		while (run) {
			System.out.println("���� ��� : 1. �ܾ� ���� | 2. �ܾ� �˻� | 3. �ܾ��� ��ü ���� | 4. ������ �˻� | 5. ���α׷� ������");
			System.out.print("���� => ");
			x = sc.nextLine();
			
			switch (x) {
			case "1":
				System.out.print("English => ");
				eng = sc.nextLine();
				System.out.print("korean => ");
				kor = sc.nextLine();
				System.out.print("level => ");
				lev = Integer.parseInt(sc.nextLine());
				mywords.add(new Word(eng, kor, lev));
				System.out.println("����Ǿ����ϴ�.");
				break;

			case "2":
				System.out.print("English �˻� => ");
				eng = sc.nextLine();
				for(Word w : mywords) {
					if(w.getEnglish().equals(eng)) {
						System.out.println("�˻� ��� ��� Korean => " + w.getKorean());
					} 
				}
				break;
				
			case "3":		// �����ϰ� ����ϴ� �޼ҵ� �����.
				all(mywords);
				break;
				
			case "4":
				System.out.print("���̵��� �Է��ϼ���. => ");
				lev = Integer.parseInt(sc.nextLine());
				level(mywords, lev);
				break;
				
			case "5":
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
				
			default:
				System.out.println("�߸� �Էµ� ���Դϴ�. �ٽ� �Է��ϼ���. (���� : 1 ~ 5)");
				break;
			}
			// switch�� ����.
		}
		// while�� ����.
	}

	private static void level(List<Word> mywords, int lev) {
		
		for(Word w : mywords) {
			if(w.getLevel() == lev) {
				System.out.println(w);
			}
		}
	}

	private static void all(List<Word> mywords) {
		
		mywords.sort(new Comparator<Word>() {
			
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20s %-20s\t %-10s", "English", "Korean", "Level"));
		System.out.println("======================================================================");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %-10d", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
	}
	
	
}
