package prc1;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("������ �Է��ϼ���. >>> ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();
		
		
		for(int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		int result = 1;
		System.out.print("������ �Է��ϼ���. >>> ");
		int fac = sc.nextInt();
		for(int i = 1; i <= fac; i++) {
			result *= i;
		}
		System.out.println("n! = " + result);
		System.out.println();
		
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1���� 100���� ������ �� = " + sum);
		System.out.println();
		
		Random r = new Random();
		
		int num = r.nextInt(45) + 1;
		
		System.out.println("1�� 45 ������ ���� ���� : " + num);
		
	}

}
