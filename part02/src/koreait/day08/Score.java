package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;	// getter, setter 작업해보기
							// 값 예시 : A+, A, B+, B, ...
	
	// 기본생성자가 숨어있다. 어떤 코드? ==> 접근한정자는 public
	public Score() {
		
	}	// 해당 기본생성자가 자동으로 생성되어 있다. 이게 없으면 다른 패키지에서 쓰는 객체에 오류가 발생함.
	
	void setKorean(int korean) {
		this.korean = korean;		// 이때 this는 setKorean 메소드를 실행시키는 객체를 의미한다.
	}	// 메소드 인자로 전달받은 값을 클래스 전역변수 korean에 대입(저장)시킨다.
	
	int getKorean() {
		return korean;
	}
	
	void setEnglish(int english) {
		this.english = english;		// 이때 this는 setEnglish 메소드를 실행시키는 객체를 의미한다.
	}	// 메소드 인자로 전달받은 값을 클래스 전역변수 english에 대입(저장)시킨다.
	
	int getEnglish() {
		return english;
	}
	
	void setGrade(String grade) {
		this.grade = grade;
	}
	
	String getGrade() {
		return grade;
	}
	
	void setScience(int science) {
		this.science = science;
	}
	
	int getScience() {
		return science;
	}
}
