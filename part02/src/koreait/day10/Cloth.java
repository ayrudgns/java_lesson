package koreait.day10;

import java.util.Scanner;

public class Cloth {
	
	public Cloth() {
		System.out.println("�������~");
	}
	
	String color;
	String sleeve;
	String brand;
	int price;
	int sale;
	
	public void movement() {
		System.out.println("������~");
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
		System.out.print("�����Ͻðڽ��ϱ�? (yes / no) >>> ");
		String c;
		c = sc.next();
		if(c.equals("yes")) {
			System.out.println("�����ϼ̽��ϴ�!");
		} else if (c.equals("no")) {
			System.out.println("�� �� �ѷ����� ������.");
		} else {
			while (!c.equals("yes") && !c.equals("no")) {
				System.out.println("����غ�����.");
				System.out.print("�����Ͻðڽ��ϱ�? (yes / no) >>> ");
				c = sc.next();
				if(c.equals("yes")) {
					System.out.println("�����ϼ̽��ϴ�!");
				} else if (c.equals("no")) {
					System.out.println("�� �� �ѷ����� ������.");
				}
			}
		}
		System.out.println("===================================================");
	}
	
	public Cloth atOnce(String color, String sleeve, String brand, int price, int sale) {
		return this.atOnce(color, sleeve, brand, price, sale);
	}

}
