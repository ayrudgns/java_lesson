package koreait.day11;

public class AShapeTest {
// main �޼ҵ�� Ŭ������ ������� ���ø����̼�. �߻�Ŭ������ �ϼ��� ���ø����̼ǿ��� ���ο� �߻�޼ҵ带 �߰��ϸ�?
//																		�� Line 59 ����.
	public static void main(String[] args) {
		Triangle tri = new Triangle(100, 84);		// width, height �޴� Ŀ���� ������ ����.
		tri.shapeName = "�����ﰢ��";
		System.out.println(tri);					// .toString() ����.
		System.out.println("���� = " + tri.getArea());
		System.out.println("========================================");
		
		Circle cir = new Circle();					// ����Ʈ ������ ����.
		cir.setRadius(89);							// ������ �Է�.
		cir.shapeName = "��";
		System.out.println(cir);					// .toString() ����.
		System.out.println("���� = " + cir.getArea());
		System.out.println("========================================");
		
		Rectangle rec = new Rectangle(20, 30);		// Ŀ���� ������ ����.
		rec.shapeName = "�簢��";	
		System.out.println(rec);					// .toString() ����.
		System.out.println("���� = " + rec.getArea());
		System.out.println("========================================");
		
		Trapezoid tra = new Trapezoid(15, 25, 40);	// ����Ʈ ������ ����.
		tra.shapeName = "��ٸ���";
		System.out.println(tra);					// .toString() ����.
		System.out.println("���� = " + tra.getArea()); 
		System.out.println("========================================");
	}

}

/*
 * �޼ҵ带 �������� ��, ���������ڴ� ��� �ɱ�?
 * 	�θ� public		�ڽ� default	( X )
 * 	�θ� default		�ڽ� public	( O )
 */

abstract class AShape {		// ���� (�߻�Ŭ����)
	protected String shapeName;
	protected int width;
	protected int height;
	
	// �߻�Ŭ������ Ŀ���һ����ڸ� ���� �� �ֳ�?	O
	public AShape(int width, int height) {		// Ŀ���һ�����
		System.out.println("AShape Ŀ���� ������ ����");
		this.height = height;
		this.width = width;
	}
	
	public AShape() {				// �⺻�����ڴ� ��ü�� ���� ���� �� ������ �ڽ� ��ü�� ������� �� �����Ѵ�.
		System.out.println("AShape ����Ʈ ������ ����");
	}

	public abstract double getArea();		// ������ ����, �߻�޼ҵ�
	
	// �߻�Ŭ���� ������ �ν��Ͻ� �޼ҵ带 �����ϰ�, �ڽ�Ŭ������ �������� �� �ִ�.
	public Object explain() {			// ���ø����̼� �ϼ� ��, �߻�޼ҵ� �߰��ϸ� ���� �߻�.
		return null;					// ���� �ν��Ͻ� �޼ҵ带 �߰��ؾ� ��.
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
	private int radius;		// ������, getter & setter �ʿ���.
	
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

