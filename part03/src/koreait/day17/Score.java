package koreait.day17;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;

	public Score() {
	
	}
	
	public Score(String name, int korean, int english, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.science = science;
	}
	
	@Override
	public String toString() {
		return "[name = " + name + ", korean = " + korean + ", english = " + english + ", science = " + science
				+ ", grade = " + getGrade() + "]";
	}
	
	// 인스턴스 메소드 : 객체의 값을 활용하는 메소드.
	public int sum() {		// 인스턴스 메소드는 필드값을 활용한다. 그렇지 않은 경우에는 그냥 static 써버리면 된다.
		int result = this.korean + this.english + this.science;
		return result;
	}
	
	public double average() {
		return (double)sum() / 3;
	}

	// setter를 변경하기 : 실행 내용, 필요에 따라 접근한정자를  private으로도 할 수 있다.
	private void setGrade() {
		if(average() >= 90) {
			this.grade = "A";
		} else if(average() >= 80) {
			this.grade = "B";
		} else if(average() >= 70) {
			this.grade = "C";
		} else if(average() >= 60) {
			this.grade = "D";
		} else {
			this.grade = "F";
		}
	}
			
	String getGrade() {
		setGrade();
		return grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
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

	
	void setScience(int science) {
		this.science = science;
	}
	
	int getScience() {
		return science;
	}

}
