package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {
	
	public static void main(String[] args) {
		
		String filename = "D:\\Iclass\\테스트르트.txt";
//		String filename = "D:\\Iclass\\테스트르트2.txt";		// 없는 파일 테스트.
															// 파일이 없을 때는 오류 발생.
		File file = new File(filename);
		
		// Scanner : 외부에서 이클립스로 입력해주는 기능을 갖는 클래스
		// Unhandled exception type FileNotFoundException
		// : 오류의 가능성이 있으므로 try ~ catch 문을 써라.
		// ctrl + 1 누르면 자동으로 try ~ catch 문 씌워줌.
		Scanner sc = null;
		try {
			sc = new Scanner(file);		// System.in : 표준 입력 (콘솔에 입력) ==> 파일의 내용을 읽어온다.
/*			
			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
*/
			while(sc.hasNext()) {		// 구분자 엔터를 기준으로 다음 데이터가 있으면 true 반환.
				System.out.println(sc.nextLine());
			}
			System.out.println("파일 읽기가 완료되었습니다.");
			
		} catch (FileNotFoundException e) {	
			// 입력 기능에는 파일이 없으면 Exception이 발생한다.
			System.out.println("사용자 오류 발생 : " + e.getMessage());
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	
	}
}


// try ~ catch 자원 해제 방법을 finally로 하고 있지만, 이는 구버전이다.
// java 7 버전부터는 달라졌는데, 그게 뭐게~ finally를 쓰지 않는 구문 형식임~
//								ㄴ try with resources
// 관련 인터페이스가 무엇인지도 찾아보기	==> AutoCloseable 인터페이스
// 다 하고 파일 올렸으면 손들기!! 입출력 각각 테스트하기 파일 1개에.
