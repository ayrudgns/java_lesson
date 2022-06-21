package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {
	// 시험??
// 작성자 : juleeus	
	public static void main(String[] args) {
//		HashMap<String, String> dic = new HashMap<>();
		TreeMap<String, String> dic = new TreeMap<String, String>();
		// 이진 검색이 가능한 구조로 Map을 생성 : 정렬이 되는 Map이다.
		Scanner sc = new Scanner(System.in);
		String eng;
		String kor;
		boolean go = true;
		
		while(go) {			// go가 false가 될 때까지 반복.
			System.out.println("선택 기능 : 1. 단어 저장 | 2. 단어 검색 | 3. 단어장 보기 | 4. 프로그램 끝내기");
			System.out.print("선택 => ");
			String x = sc.nextLine();			// 아니 이걸 nextInt로 계속 받고 있었네.. 그러니 안되지..
			switch (x) {		// 입력한 x에 따른 case 분류
				case "1":
					System.out.print("English => ");	// 영어 단어 입력
					eng = sc.nextLine();
					System.out.print("Korean => ");		// 한글 뜻 입력
					kor = sc.nextLine();
					dic.put(eng, kor);				// dic에 key값과 value값 대입 + 저장
					break;
				case "2":
					System.out.print("검색 단어 English => ");	// 영단어 검색
					eng = sc.nextLine();
					System.out.println("단어장 검색했습니다. 결과 => " + dic.get(eng));
					break;
				
				case "3":
					System.out.println("단어장 전체보기 : " + dic);	// dic 트리맵 전체보기
					break;
				
				case "4":
					go = false;			// go 가 false가 되니까 while문 종료
					break;
	
				default:
					System.out.println("잘못 입력된 값입니다. 다시 입력하세요. (범위 1 ~ 4)");
					break;
			}
		}	// 참고 : 정수 데이터 입력을 받아야 한다면, 문자열 nextLine()으로 받아서 정수로 변환시켜준다. !!
			// 방법 : Integer.parseInt(sc.nextLine()) 메소드를 이용한다.
			// ex) int x = Integer.parseInt(sc.nextLine());
			// nextInt()는 enter를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 된다.
			// 결론 : 한 소스파일에서 nextInt()만 사용 또는 nextLine()만 사용할 것.
	}
}
