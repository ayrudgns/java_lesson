package koreait.day09b;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a == b) {
			System.out.println("1");
			System.out.println("0");
		} else if (a != b) {
			System.out.println("0");
			System.out.println("1");
		}
		
		
	}

}
