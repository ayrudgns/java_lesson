package koreait.day11.test.test;

public abstract class Animal {		// 0610 day11에 Animal 클래스를 추상클래스로 바꿔보기
	
	// 미리 약속된 상수값으로 type을 정한다.
	static final int CAT = 1;
	static final int DOG = 2;
	static final int CROW = 3;
	static final int FROG = 4;
	static final int SNAKE = 5;
	
	private String name;
	private String color;
	protected int type;
	
	public Animal() {		// 기본생성자!
		System.out.println("새로운 Animal 가족이 생겼습니다.");
	}
	
	public abstract void act(); // 추상메소드로 바꾸기.
	
	// 추상메소드 추가
	public abstract String eat(Object object);
	
	public void print() {
		System.out.println("name = " + name + ", color = " + color);
	}
	
	@Override
	public String toString() {
		return "Animal [name = " + name + ", color = " + color + "]";
	}

	// getter, setter
	public String getName() {		// 굳이 private하고 getter, setter 만드는 이유는 한번 더 확인하라고!
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
