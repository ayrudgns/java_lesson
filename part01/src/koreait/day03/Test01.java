package koreait.day03;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		int age;
		x = sc.nextLine();
		age = sc.nextInt();
		
		boolean result = x.equals("M");
		
		if (result) {
			if (age >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else {
			if (age >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		}
	}
}
