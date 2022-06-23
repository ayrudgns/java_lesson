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
		System.out.println("단어장을 시작합니다.");
		while (run) {
			System.out.println("선택 기능 : 1. 단어 저장 | 2. 단어 검색 | 3. 단어장 전체 보기 | 4. 레벨로 검색 | 5. 프로그램 끝내기");
			System.out.print("선택 => ");
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
				System.out.println("저장되었습니다.");
				break;

			case "2":
				System.out.print("English 검색 => ");
				eng = sc.nextLine();
				for(Word w : mywords) {
					if(w.getEnglish().equals(eng)) {
						System.out.println("검색 결과 출력 Korean => " + w.getKorean());
					} 
				}
				break;
				
			case "3":		// 정렬하고 출력하는 메소드 만들기.
				all(mywords);
				break;
				
			case "4":
				System.out.print("난이도를 입력하세요. => ");
				lev = Integer.parseInt(sc.nextLine());
				level(mywords, lev);
				break;
				
			case "5":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default:
				System.out.println("잘못 입력된 값입니다. 다시 입력하세요. (범위 : 1 ~ 5)");
				break;
			}
			// switch문 종료.
		}
		// while문 종료.
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
