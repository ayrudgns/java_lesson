package koreait.day01;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int weight, height;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Կ� Ű�� �Է����ּ���. >> ");

		weight = sc.nextInt();
		height = sc.nextInt();
		
		System.out.println("�񸸼�ġ : " + (weight + 100 - height));
		
		int Obesity = 0;
		Obesity = (weight + 100 - height);
		
		if ( Obesity > 0 ) { 
			System.out.println("��");
		}
	}

}
