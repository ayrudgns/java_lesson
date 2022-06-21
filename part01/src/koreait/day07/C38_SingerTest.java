package koreait.day07;

public class C38_SingerTest {
	public static void main(String[] args) {
		
		Singer twice = new Singer();		// 트와이스 만들기
		
		twice.name_eng = "Twice";
		twice.name_kor = "트와이스";
		twice.debutYear = 2015;
		twice.genre = "Kpop-GirlGroup";
		
		twice.members = new String[9];		// ** 배열의 길이를 알려주지 않으면 오류 발생 **
		twice.members[0] = "모모";		
		twice.members[1] = "나연";
		twice.members[2] = "쯔위";
		
		System.out.println("twice members");
		twice.printMembers();
		System.out.println("활동기간 : " + twice.actYears(2022) + "년");
		System.out.println();
		
		Singer beo = new Singer();			// 비오 만들기
		
		beo.name_eng = "BE'O";
		beo.name_kor = "비오";
		beo.genre = "Hiphop";
		beo.printMembers();
		System.out.println();
		
		System.out.println(Singer.JOB + Singer.label);
		System.out.println(twice.toString());
		System.out.println(beo.toString());
		System.out.println();
		System.out.println(twice);		// 객체 참조 타입일 때, toString() 생략한 상태
		System.out.println(beo);
		System.out.println();
		
		Singer blackPink = new Singer();		// 블랙핑크 만들기
		
		blackPink.debutYear = 2016;
		blackPink.genre = "K-pop";
		blackPink.members = new String[4];
		blackPink.members[0] = "제니";
		blackPink.members[1] = "지수";
		blackPink.members[2] = "리사";
		blackPink.members[3] = "로제";
		blackPink.name_eng = "BLACKPINK";
		blackPink.name_kor = "블랙핑크";
		System.out.println("======= 블랙핑크 =======");
		System.out.println(blackPink.JOB + blackPink.label);
		blackPink.printMembers();
		System.out.println(blackPink);
		System.out.println("활동기간 : " + blackPink.actYears(2022) + "년");
		
	}

}
