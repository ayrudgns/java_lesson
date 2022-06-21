package koreait.day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TryCatchPrc {

	public static void main(String[] args) {
		List<Integer> prcList = new ArrayList<>();
		
		try (Scanner sc = new Scanner(System.in);) {
			for(int i = 0; i < 10; i++) {
				System.out.print("나이를 입력하세요. >>> ");
				int age = sc.nextInt();
				prcList.add(age);
			}
		} catch (InputMismatchException e) {
			System.out.println("정수 타입으로 입력하세요.");
		}
		
		System.out.println("prcList 출력 : " + prcList);
	}
}
