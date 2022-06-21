package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;	// getter, setter �۾��غ���
							// �� ���� : A+, A, B+, B, ...
	
	// �⺻�����ڰ� �����ִ�. � �ڵ�? ==> ���������ڴ� public
	public Score() {
		
	}	// �ش� �⺻�����ڰ� �ڵ����� �����Ǿ� �ִ�. �̰� ������ �ٸ� ��Ű������ ���� ��ü�� ������ �߻���.
	
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
