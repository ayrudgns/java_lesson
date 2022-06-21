package koreait.day09a;

public class Animal {
	private String name;
	private String color;
	
	public Animal() {		// 기본생성자!
		System.out.println("새로운 Animal 가족이 생겼습니다.");
	}
	
	public void act() {
		System.out.println("Animal 행동 : 아직 모름 (unknown)");
	}
	
	public void print() {
		System.out.println("name = " + name + ", color = " + color);
	}
	
	// Object 설명 이후에 작성한 메소드.
	public static boolean isDog(Object object) {	// 객체와 상관이 없으면 static, 객체와 상관이 있으면 non-static
		return object instanceof Dog;
	}
	
	public static boolean isCrow(Object object) {
		return object instanceof Crow;
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
