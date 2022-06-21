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
// 작성자 : juleeus	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();
		
		try {
			System.out.print("파일에서 읽어올까요? (y / n) >>> ");
			if(ssc.nextLine().equals("y")) {
				read(mywords, "D:\\Iclass\\나의영한사전.txt");
			// 파일에서 기존 내용 읽어와서 그 내용을 mywords 리스트에 저장
			} else {
				System.out.println("파일을 새로 만듭니다.");
			}
		} catch (FileNotFoundException e1) {
			System.out.println("파일을 읽는 도중에 오류가 발생했습니다. - " + e1.getMessage());
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
			System.out.print("파일에 저장할까요? (y / n) >>> ");
			if(ssc.nextLine().equals("y")) {
				// mywords 리스트의 내용을 파일에 저장하기
				save(mywords, "D:\\Iclass\\나의영한사전.txt");
			} else {
				System.out.println("파일이 저장되지 않았습니다.");
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 저장 중에 오류가 생겼습니다. - " + e.getMessage());

		}
		System.out.println("단어장 종료");
	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException{
		// 파일에 출력하기
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords) {
			pw.println(w);
		}
		pw.close();
		System.out.println("파일 저장이 완료되었습니다.");
	}

	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		
		while (sc.hasNext()) {
			String temp = sc.nextLine();		// 파일에서 한 줄 읽어온 것 저장
			System.out.println(temp.substring(0, temp.indexOf("(")));	// 객체를 만들 때 필요한 값만 가져오기 테스트
			StringTokenizer stk = null;									// 메모장에는 (전문가) 이런 것까지 다 써있음.
			
			// 위의 결과를 참고로, StringTokenizer로 Word 객체를 만들고 mywords 리스트에 추가하기.
			stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));	// ** 한줄씩 읽어온다.. **
			mywords.add(new Word(stk.nextToken(), 		// english 필드값
						stk.nextToken(), 					// korean 필드값
						Integer.parseInt(stk.nextToken())));		// level 필드값
			System.out.println("mywords에 저장이 완료되었습니다.");
			// 코딩이 완성되면 3번 전체보기 실행해보기.
		}
		sc.close();
		System.out.println("파일 읽어오기 완료되었습니다.");
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
