package koreait.day09a;

public class Animal {
	private String name;
	private String color;
	
	public Animal() {		// �⺻������!
		System.out.println("���ο� Animal ������ ������ϴ�.");
	}
	
	public void act() {
		System.out.println("Animal �ൿ : ���� �� (unknown)");
	}
	
	public void print() {
		System.out.println("name = " + name + ", color = " + color);
	}
	
	// Object ���� ���Ŀ� �ۼ��� �޼ҵ�.
	public static boolean isDog(Object object) {	// ��ü�� ����� ������ static, ��ü�� ����� ������ non-static
		return object instanceof Dog;
	}
	
	public static boolean isCrow(Object object) {
		return object instanceof Crow;
	}
	
	// getter, setter
	public String getName() {		// ���� private�ϰ� getter, setter ����� ������ �ѹ� �� Ȯ���϶��!
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
