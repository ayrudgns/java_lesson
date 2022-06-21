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
				System.out.print("���̸� �Է��ϼ���. >>> ");
				int age = sc.nextInt();
				prcList.add(age);
			}
		} catch (InputMismatchException e) {
			System.out.println("���� Ÿ������ �Է��ϼ���.");
		}
		
		System.out.println("prcList ��� : " + prcList);
	}
}
