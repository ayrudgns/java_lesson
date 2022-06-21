package koreait.day10;

public class ClothTest {
	public static void main(String[] args) {
		
		Cloth c1 = new Cloth();
		
		c1.color = "black";
		c1.sleeve = "long";
		c1.brand = "LACOSTE";
		c1.price = 139000;
		c1.sale = 20;
		
		System.out.println(c1.toString());
		c1.movement();
		System.out.println();
		System.out.println("세일한 가격은 " + c1.salePrice() + "원 입니다.");
		c1.choice();
		System.out.println();
		
		Cloth c2 = new Cloth();
		
		c2.color = "navy";
		c2.sleeve = "short";
		c2.brand = "8seconds";
		c2.price = 41900;
		c2.sale = 50;
		
		System.out.println(c2.toString());
		c2.movement();
		System.out.println();
		System.out.println("세일한 가격은 " + c2.salePrice() + "원 입니다.");
		c2.choice();
		System.out.println();


	}
}
