package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Exception 처리 명령이 별도의 메소드에서 정의될 때, 다른 방법 이용하기 (방법 1, 방법 2)
public class C68_ReadWrite {
	
	public static void main(String[] args) {
		// main 메소드가 throws Exception을 한다면 JVM에 전달된다.
		// 처리 내용은 printStackTrace() 결과와 동일하다.
		String filename = "D:\\Iclass\\테스트르트.txt";
		
		try {
			fileWrite2(filename);
//			filename = "D:\\Iclass\\테스트르트13.txt";	// 없는 파일 테스트용
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("사용자 실행 오류 : " + e.getMessage());
			System.out.println("파일이 존재하는지 확인하세요.");
		}
	}
	
// Exception 처리 명령이 별도의 메소드에서 정의될 때, 다른 방법 이용하기 (방법 1, 방법 2)	
	
	// 방법 1 : Exception을 try~catch문으로 직접 처리하는 메소드. 
	public static void fileWrite(String filename) {		// C65의 Line 13 ~ 31까지를 메소드로 만들어버림.
													
		File file = new File(filename);
		// 생성자 메소드 : java.io.PrintWriter.PrintWriter(File file) throws FileNotFoundException
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);		// file로 지정된 위치에 출력하기 위한 객체
			pw.println("모모 90 89 82");
			pw.println("다현 89 90 82");
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다.");		// System.out : 표준 출력 (콘솔에 출력)
			// 출력 기능에는 파일이 없으면 자동으로 파일이 만들어지는 기능도 있다.
		} catch (FileNotFoundException e) {	
			System.out.println("오류 발생 : " + e.getMessage());
		} finally {
			pw.close();
		}
	}
	
	// 방법 2 : throws 키워드로 해당 Exception(이 메소드에서는 FileNot~)을 호출한 곳(여기서는 main 메소드)으로 넘긴다. 떠넘기는 느낌?
	//			ㄴ throws 뒤에 콤마(,)를 찍어 여러 예외를 지정할 수 있다.
	// Exception을 처리해야 할 메소드가 많의 정의되었고 사용되고 있을 때, 한 곳에서 모두 처리할 수 있다는 장점이 있다.
	
	public static void fileWrite2(String filename) throws FileNotFoundException {		// throws 이용.
		
		File file = new File(filename);
		
		PrintWriter pw = null;
			pw = new PrintWriter(file);		// file로 지정된 위치에 출력하기 위한 객체
			pw.println("모모 90 89 82");
			pw.println("다현 89 90 82");
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다.");		// System.out : 표준 출력 (콘솔에 출력)
			// 출력 기능에는 파일이 없으면 자동으로 파일이 만들어지는 기능도 있다.
			pw.close();
	}
	
	public static void fileRead(String filename) throws FileNotFoundException {
		
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		}
		sc.close();
	}
}
	
