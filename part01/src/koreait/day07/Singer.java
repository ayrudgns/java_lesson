package koreait.day07;

// C37 번호 생략
public class Singer {
/*
 *  클래스를 정의하는 것은 현실세계의 데이터를 처리하기 위한 형식을 지정
 */
	// Singer 객체가 만들어질 때마다 다른 값을 가진다. ==> 인스턴스 필드
	String genre;		// 장르
	String name_eng;		
	String name_kor;	// 이름
	int debutYear;		// 데뷔년도
	String[] members;	// 그룹일 경우 멤버 이름들 저장
	
	static final String JOB = "연예인";	// 변경되지 않는 상수
	static String label = " 😎"; //Singer에게는 모두 동일한 라벨 표시. 변경 가능한 변수

	void printMembers() {
		if(members == null) {
			System.out.println("그룹이 아닌 솔로가수입니다.");
		} else {
			for(int i = 0; i < members.length; i++) {
				if(members[i] != null) {
					System.out.println((i + 1) + " : " + members[i]);
				}
			}
		}
	}
	
	int actYears(int year) {	// 인자로 전달받은 year를 기준으로 활동기간 계산하기
		
		return (year - debutYear + 1);
	}

	@Override
	public String toString() {	// 값이 바뀌지 않는 것은 자동으로 만들지 않음.
		return "Singer [genre = " + genre + ", name_eng = " + name_eng + ", name_kor = " + name_kor + ", debutYear = "
				+ debutYear + "]";
	}
	
}