package koreait.day10;

import java.util.Scanner;

public class Cloth {
	
	public Cloth() {
		System.out.println("어서오세요~");
	}
	
	String color;
	String sleeve;
	String brand;
	int price;
	int sale;
	
	public void movement() {
		System.out.println("살랑살랑~");
	}

	@Override
	public String toString() {
		return "Cloth [color = " + color + ", sleeve = " + sleeve + ", brand = " + brand + ", price = " + price + ", sale = "
				+ sale + "%]";
	}
	
	public int salePrice() {
		return (price / 100 * (100 - sale));
	}
	
	public void choice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하시겠습니까? (yes / no) >>> ");
		String c;
		c = sc.next();
		if(c.equals("yes")) {
			System.out.println("구매하셨습니다!");
		} else if (c.equals("no")) {
			System.out.println("좀 더 둘러보고 오세요.");
		} else {
			while (!c.equals("yes") && !c.equals("no")) {
				System.out.println("고민해보세요.");
				System.out.print("구매하시겠습니까? (yes / no) >>> ");
				c = sc.next();
				if(c.equals("yes")) {
					System.out.println("구매하셨습니다!");
				} else if (c.equals("no")) {
					System.out.println("좀 더 둘러보고 오세요.");
				}
			}
		}
		System.out.println("===================================================");
	}
	
	public Cloth atOnce(String color, String sleeve, String brand, int price, int sale) {
		return this.atOnce(color, sleeve, brand, price, sale);
	}

}
