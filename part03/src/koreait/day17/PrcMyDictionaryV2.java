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
// 작성자 : juleeus	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();
		
		try {
			read(mywords, "D:\\Iclass\\나의영한사전2.txt");
		} catch (FileNotFoundException e1) {
			System.out.println("파일을 읽는 도중 오류 발생 :" + e1.getMessage());
		}
		
		String eng;
		String kor;
		int level;
		boolean go = true;
		
		while(go) {			// go가 false가 될 때까지 반복.
			System.out.println("선택 기능 : 1. 단어 저장 | 2. 단어 검색 | 3. 단어장 전체 보기 | 4. 레벨로 검색 | 5. 프로그램 끝내기");
			System.out.print("선택 => ");
			String x = sc.nextLine();
 			switch (x) {		// 입력한 x에 따른 case 분류
				case "1":		
					System.out.print("English => ");	// 영어 단어 입력
					eng = sc.nextLine();
					System.out.print("Korean => ");		// 한글 뜻 입력
					kor = sc.nextLine();
					System.out.print("Level => ");		// 난이도 입력
					level = Integer.parseInt(sc.nextLine());	// 난이도 저장
					Word w = new Word(eng, kor, level);
					
					if(0 < w.getLevel() && 3 >= w.getLevel()) {
						mywords.add(w);				// mywords에 eng, kor, level 저장 완료
						System.out.println("저장되었습니다.");
					} else {
						System.out.println("난이도의 범위는 1 ~ 3 입니다. 저장 실패");	// 난이도 범위 제한하기.
					}
					break;
					
				case "2":
					System.out.print("검색 단어 English => ");	// 영단어 검색
					eng = sc.nextLine();
					
					for(Word e : mywords) {
						if(e.getEnglish().equals(eng)) {
							System.out.println("단어장 검색했습니다. 결과 => " + e.getKorean());
						} else {
							
						}
					}
					break;
				
				case "3":		
					all(mywords);		// 정렬하고 출력하는 메소드 만들기.
					break;
					
				case "4":		// 추가 => 레벨로 검색하기.
					System.out.print("검색할 레벨 입력(1 ~ 3) -> ");
					int no = Integer.parseInt(sc.nextLine());
					level(mywords, no);
					break;
				
				case "5":		// 손댈거 없음
					go = false;			// go 가 false가 되니까 while문 종료
					break;
	
				default:		// 손댈거 없음
					System.out.println("잘못 입력된 값입니다. 다시 입력하세요. (범위 : 1 ~ 5)");
					break;
			}
		}	// while문 종료.
		
		try {
			save(mywords, "D:\\Iclass\\나의영한사전2.txt");		// mywords를 파일에 출력해낸다. (저장한다.)
		} catch (FileNotFoundException e) {
			System.out.println("파일 저장 중 오류 발생 : " + e.getMessage());
		}
		System.out.println("단어장 종료");
	}

	// 파일에 출력하기
	private static void save(List<Word> mywords, String filename) throws FileNotFoundException{
		File file = new File(filename);				// file 객체 생성
		PrintWriter pw = new PrintWriter(file);		// file을 pw로 파일에 출력해내기
		for(Word w : mywords) {			
			pw.println(w);							// file에 w 저장하기
		}
		pw.close();
		System.out.println("파일 저장이 완료되었습니다.");
	}

	// 파일에서 읽어오기
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
			System.out.println("mywords에 저장이 완료되었습니다.");
		}
		scsc.close();
		System.out.println("파일 읽어오기 완료");
		
	}
		
	private static void level(List<Word> mywords, int no) {
		
		for(Word w : mywords) {
			if(w.getLevel() == no) {
				System.out.println(w);
			}
		}

	}

	private static void all(List<Word> mywords) {			// mywords를 정렬하고 출력하는 메소드.
		
		mywords.sort(new Comparator<Word>() {
			
			@Override
			public int compare(Word o1, Word o2) {				// mywords 정렬!
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20s %-20s\t %-10s", "English", "Korean", "level"));	// 예쁘게 출력
		System.out.println("================================================================================");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %-10d", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
		
	}
}
