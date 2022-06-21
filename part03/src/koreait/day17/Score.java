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
	
	// �ν��Ͻ� �޼ҵ� : ��ü�� ���� Ȱ���ϴ� �޼ҵ�.
	public int sum() {		// �ν��Ͻ� �޼ҵ�� �ʵ尪�� Ȱ���Ѵ�. �׷��� ���� ��쿡�� �׳� static ������� �ȴ�.
		int result = this.korean + this.english + this.science;
		return result;
	}
	
	public double average() {
		return (double)sum() / 3;
	}

	// setter�� �����ϱ� : ���� ����, �ʿ信 ���� ���������ڸ�  private���ε� �� �� �ִ�.
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
		this.korean = korean;		// �̶� this�� setKorean �޼ҵ带 �����Ű�� ��ü�� �ǹ��Ѵ�.
	}	// �޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� korean�� ����(����)��Ų��.
	
	int getKorean() {
		return korean;
	}
	
	void setEnglish(int english) {
		this.english = english;		// �̶� this�� setEnglish �޼ҵ带 �����Ű�� ��ü�� �ǹ��Ѵ�.
	}	// �޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� english�� ����(����)��Ų��.
	
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
