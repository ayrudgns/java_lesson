package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;


public class C67_ResourceClose {
// 출처 : https://blog.naver.com/zzang9ha/222064282210
// 참고 : https://codechacha.com/ko/java-try-with-resources/
// 참고 : https://codevang.tistory.com/142
	
	public static void main(String[] args) {
		// 파일 복사
//		String filename = "D:\\Iclass\\테스트르트.txt";		// 읽기: 존재하는 파일
//		String filename1 = "D:\\Iclass\\테스트르트3.txt";		// 쓰기 : 존재하지 않는 파일
		
		// 파일 대화상자 사용하기
		String filename = fileDialogOpen();			// 복사할 파일을 지정하기
		String filename1 = fileDialogSave();		// 저장할 파일은 폴더를 찾아가서 파일명을 직접 쓰기 + 확장자명
		// 자바에서 만든 파일을 복사 및 저장 가능! 근데 자바에서 만들지 않은 것은 안된다.
		// 즉, 읽어올 수 있는 텍스트 파일은 인코딩이 일치해야 한다.
		// workspace가 UTF-8이면 텍스트 파일 UTF-8 형식만 가능
		// 			  MS949이면 텍스트 파일 ANSI 형식만 가능 (메모장 오른쪽 아래에 표시되어 있음.)
		File ifile = new File(filename);
		File ofile = new File(filename1);
		
		try (Scanner sc = new Scanner(ifile);
				PrintWriter pw = new PrintWriter(ofile)) {
			while(sc.hasNext()) {
				String temp = sc.nextLine();		// 파일에서 읽어온 한 줄
				System.out.println(temp);			// 표준 출력 (콘솔)
				pw.println(temp);					// 파일 출력
			}
			System.out.println("파일 복사 완료");
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("사용자 오류 발생: " + e.getMessage());
			System.out.println("지정된 파일이 없습니다.");
		} catch (Exception e) {		// FileNotFoundException 이외의 모든 Exception 처리
			System.out.println("알 수 없는 오류 : " + e.getMessage());
		}
		
	}
	
/*
 * AutoCloseable 인터페이스.
 * 만든 클래스가 try-with-resources으로 자원이 해제되길 원한다면
 * AutoCloseable을 implements해야 한다.
 * Scanner 클래스와 PrintWriter 클래스는 AutoCloseable을 구현한 클래스.
 * main에서는 해당 객체를 try-with-resources로 사용하고 있다.
 * 따라서 try문이 종료될 때 close() 구문을 호출해준다.
 */	
	
	// 복사할 파일 찾기
	public static String fileDialogOpen() {
	
	// 콘솔 입출력으로 실행하는 프로그램 : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
	// 자바에서도 GUI를 만들수 있는 클래스들이 있는데, 그 중 하나인 파일 대화상자를 사용한다. 라이브러리는 awt,swing,javaFX 등이 있다.
	// Windows OS는 프로그램들이 Windows라는 틀 안에서 만들어지는데, 자바에서는 이 틀을 프레임이라 한다.
				
		JFrame f = new JFrame();  // 파일 대화상자를 시작할 프레임 객체 생성
		
		FileDialog fdr = new FileDialog(f, "파일 열기", FileDialog.LOAD);	// 파일 대화상자 객체 생성
		fdr.setVisible(true);		// 파일 대화상자 보이기
		
		String filename = fdr.getDirectory() + fdr.getFile(); 	// 선택한 파일의 경로와 파일명 연결
		System.out.println("선택한 경로와 파일 : " + filename);
//		System.out.println("선택한 경로 : " + fdr.getDirectory() + ", 선택한 파일 : " + fdr.getFile());
		
		File file = new File(filename);
		System.out.println("선택한 파일 크기 : " + file.length() + "바이트");
		
		return filename;
	}
	
	// 복사한 파일 저장하기
	public static String fileDialogSave() {
		
		JFrame f = new JFrame();  // 파일 대화상자를 시작할 프레임 객체 생성
		
		FileDialog fdw = new FileDialog(f, "파일 저장", FileDialog.SAVE);
		fdw.setVisible(true);
		
		String filename = fdw.getDirectory() + fdw.getFile(); 	// 선택한 파일의 경로와 파일명 연결
		System.out.println("저장한 경로와 파일 : " + filename);
		
		return filename;
	}

}
