package koreait.day15;

import java.io.File;			// io : input, output 입출력 관련된 기능들이 있는 클래스 
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {
	
	public static void main(String[] args) {
		
		String filename = "D:\\Iclass\\테스트르트.txt";
		
		File file = new File(filename);
		
		// PrintWriter : 이클립스에서 외부로 출력하는 기능을 갖는 클래스
		// Unhandled exception type FileNotFoundException
		// : 오류의 가능성이 있으므로 try ~ catch 문을 써라.
		// ctrl + 1 누르면 자동으로 try ~ catch 문 씌워줌.
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);		// file로 지정된 위치에 이클립스에서 입력하는 값을 파일에 출력하기 위한 객체를 생성함.
//			System.out.println();에서 System.out 대신에 파일 출력 객체인 pw 사용
			pw.println("모모 90 89 82");
			pw.println("다현 89 90 82");
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다.");		// System.out : 표준 출력 (콘솔에 출력)
			// 출력 기능에는 파일이 없으면 자동으로 파일이 만들어지는 기능도 있다.
		} catch (FileNotFoundException e) {	
			System.out.println("오류 발생 : " + e.getMessage());		// e.getMessage() : 오류 메세지를 가져온다.
		} finally {
			pw.close();
		}
	
	}
}
