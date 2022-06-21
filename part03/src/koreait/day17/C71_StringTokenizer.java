package koreait.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class C71_StringTokenizer{
// token : 표식(최소 단위로 분류)
	public static void main(String[] args) {
		
		String temp = "모모 90 88 79";
		
		// 토큰화 : StringTokenizer 클래스의 기능 사용하기
		// 구분 기호는 기본 문자 : 공백, 탭, 줄바꿈
		StringTokenizer stk = new StringTokenizer(temp);
		System.out.println("1. nextToken() 메소드");	// "모모 90 88 79"
		System.out.println(stk.nextToken());		//   ↑(토크나이저의 포인터, nextToken() 메소드 후 위치 이동)
		System.out.println(stk.nextToken());		//      ↑(토크나이저의 포인터, nextToken() 메소드 후 위치 이동)
		System.out.println(stk.nextToken());		//         ↑(토크나이저의 포인터, nextToken() 메소드 후 위치 이동)
		System.out.println(stk.nextToken());		//            ↑(토크나이저의 포인터, nextToken() 메소드 후 위치 이동)
		System.out.println("stk.hasMoreTokens? : " + stk.hasMoreTokens());	// false
		System.out.println();

		System.out.println("2. 반복문에서 hasMoreTokens 메소드");
		// 토큰으로 데이터를 다 읽고 나서 다시 쓰려면 다시 객체를 생성해야함.
		stk = new StringTokenizer(temp);	// 토크나이저 객체 재생성
		while (stk.hasMoreTokens()) {		// 다음에 읽어올 토큰이 있으면
			System.out.println(stk.nextToken());
		}
		System.out.println();
		
		System.out.println("3. 여러가지 구분 기호 사용하기");
		temp = "모모,90 88()79";				// empty는 만들지 않는다. (split과의 차이점)
		stk = new StringTokenizer(temp, " ,()");	// 두번째 인자는 delim : 구분 기호 문자를 나열하기. (정규식 X)
		while (stk.hasMoreTokens()) {				//				ㄴ Delimiter(s)
			System.out.println(stk.nextToken());	// 실행결과
		}											//	모모
		System.out.println();						//	90
													//	88
													//	79	==> (와 ) 사이의 empty는 만들지 않는다.
		
		System.out.println("4. 토큰화 데이터로 객체 만들기");
		temp = "모모 90 88 79";
		stk = new StringTokenizer(temp);
		Score score = null;
		while(stk.hasMoreTokens()) {
			score = new Score(stk.nextToken(), 
					Integer.parseInt(stk.nextToken()), 	
					Integer.parseInt(stk.nextToken()), 		// split()은 배열로만 변환하므로, 한번 더 변환해주어야 함.
					Integer.parseInt(stk.nextToken()));		// Tokenizer는 바로바로 객체에 넣어줄 수 있음.
		}
		System.out.println("생성된 Score 객체 : " + score);		// 오 개신기해.. ***
		System.out.println("총점 : " + score.sum());	
		System.out.println("평균 : " + score.average());	
		System.out.println("학점 : " + score.getGrade());
		System.out.println();
		
		// List로 만들기 ==> 스스로 다시 해보기.
		System.out.println("5. ArrayList 만들어서 StringTokenizer로 객체 저장하기");
		temp = "모모 90 88 79\n나나 78 83 79\n신비 92 73 66";
		stk = new StringTokenizer(temp);				// StringTokenizer로 끊었다.
		List<Score> scores = new ArrayList<>();			// List 생성. 타입은 Score 타입.

		while(stk.hasMoreTokens()) {
			score = new Score(stk.nextToken(), 				// 객체 만들고 + 넣고 (이름)
					Integer.parseInt(stk.nextToken()), 		// 넣고 (국어점수)
					Integer.parseInt(stk.nextToken()), 		// 넣고 (영어점수)
					Integer.parseInt(stk.nextToken()));		// 넣고 (과학점수)
			scores.add(score);								// 리스트에 추가	(이 과정을 반복)
		}
		System.out.println("토크나이저 결과 : " + scores);	
		System.out.println();

		scores.clear();		// 리스트의 모든 요소를 삭제하기
		
		// split() 메소드 실행 결과를 어떻게 객체로 만들 수 있을까? ==> 스스로 다시 해보기.
		System.out.println("6. split() 메소드를 이용하여 ArrayList에 객체 저장하기");
		String[] result = temp.split("[ \n]");			// temp를 split() 메소드로 끊는다. 끊는 단위 지정.
		for(int i = 0; i < result.length; i += 4) {		// i += 4는 4개씩 돌아가니까.
			Score s = new Score(result[i + 0], 			// 객체 만들고 + 넣고 (이름)
					Integer.parseInt(result[i + 1]), 	// 넣고 (국어점수)
					Integer.parseInt(result[i + 2]),	// 넣고 (수학점수)
					Integer.parseInt(result[i + 3]));	// 넣고 (과학점수)
			scores.add(s);								// 리스트에 추가	(이 과정을 반복, result의 length 만큼)
		}
		System.out.println("split() 메소드 결과 : " + scores);
	
	}

}
