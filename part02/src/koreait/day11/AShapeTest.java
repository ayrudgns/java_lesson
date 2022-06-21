package koreait.day11;

public class AShapeTest {
// main 메소드는 클래스로 만들어진 애플리케이션. 추상클래스로 완성된 애플리케이션에서 새로운 추상메소드를 추가하면?
//																		ㄴ Line 59 참고.
	public static void main(String[] args) {
		Triangle tri = new Triangle(100, 84);		// width, height 받는 커스텀 생성자 동작.
		tri.shapeName = "직각삼각형";
		System.out.println(tri);					// .toString() 생략.
		System.out.println("넓이 = " + tri.getArea());
		System.out.println("========================================");
		
		Circle cir = new Circle();					// 디폴트 생성자 동작.
		cir.setRadius(89);							// 반지름 입력.
		cir.shapeName = "원";
		System.out.println(cir);					// .toString() 생략.
		System.out.println("넓이 = " + cir.getArea());
		System.out.println("========================================");
		
		Rectangle rec = new Rectangle(20, 30);		// 커스텀 생성자 동작.
		rec.shapeName = "사각형";	
		System.out.println(rec);					// .toString() 생략.
		System.out.println("넓이 = " + rec.getArea());
		System.out.println("========================================");
		
		Trapezoid tra = new Trapezoid(15, 25, 40);	// 디폴트 생성자 동작.
		tra.shapeName = "사다리꼴";
		System.out.println(tra);					// .toString() 생략.
		System.out.println("넓이 = " + tra.getArea()); 
		System.out.println("========================================");
	}

}

/*
 * 메소드를 재정의할 때, 접근한정자는 어떻게 될까?
 * 	부모 public		자식 default	( X )
 * 	부모 default		자식 public	( O )
 */

abstract class AShape {		// 도형 (추상클래스)
	protected String shapeName;
	protected int width;
	protected int height;
	
	// 추상클래스는 커스텀생성자를 만들 수 있나?	O
	public AShape(int width, int height) {		// 커스텀생성자
		System.out.println("AShape 커스텀 생성자 동작");
		this.height = height;
		this.width = width;
	}
	
	public AShape() {				// 기본생성자는 객체를 직접 만들 수 없지만 자식 객체가 만들어질 때 실행한다.
		System.out.println("AShape 디폴트 생성자 동작");
	}

	public abstract double getArea();		// 도형의 넓이, 추상메소드
	
	// 추상클래스 내에서 인스턴스 메소드를 정의하고, 자식클래스가 재정의할 수 있다.
	public Object explain() {			// 애플리케이션 완성 후, 추상메소드 추가하면 오류 발생.
		return null;					// 따라서 인스턴스 메소드를 추가해야 함.
	}
	
	@Override
	public String toString() {
		return "AShape [shapeName = " + shapeName + ", width = " + width + ", height = " + height + "]";
	}

	
}

class Triangle extends AShape {			//  width * height / 2
	public Triangle(int width, int height) {
		super(width, height);
//		this.width = width;
//		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height / 2;
	}
}

class Circle extends AShape {			// radius * radius * 3.14
	private int radius;		// 반지름, getter & setter 필요함.
	
	@Override
	public double getArea() {
		return radius * radius * 3.14;
	}
	
	
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public String toString() {
		return "Circle [radius = " + radius + ", shapeName = " + shapeName + ", width = " + width + ", height = " + height
				+ "]";
	}
	
}

class Rectangle extends AShape {		// width * height
	
	public Rectangle(int width, int height) {
		super(width, height);
//		this.width = width;
//		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
}

class Trapezoid extends AShape {		// (widthUp + widthDown) * height / 2
	int widthUp;
	int widthDown;
	
	public Trapezoid(int widthUp, int widthDown, int height) {
		this.widthUp = widthUp;
		this.widthDown = widthDown;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return (widthUp + widthDown) * height / 2;
	}
}

