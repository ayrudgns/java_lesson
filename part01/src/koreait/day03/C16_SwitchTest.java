package koreait.day03;

import java.util.Scanner;

public class C16_SwitchTest {
	public static void main(String[] args) {
		// switch 문은 if ~ else if를 대신하는 명령문이다.
		Scanner sc = new Scanner(System.in);
		int item_no, pay;
		pay = 0;
		System.out.println("상품목록 : 1. 2200원🍔🍔\t2. 1900원🍪🍪\t 3. 3600원🍇🍇\t 4. 2870원🍺🍺");
		System.out.print("상품번호를 선택해서 장바구니에 넣으세요. >>> ");
		item_no = sc.nextInt();
		
		switch (item_no) {		// 조건식을 작성했을 때와 같이 비교할 변수를 입력
		case 1:
			pay = 2200;
			break;				// 아래의 명령문들은 샐항하지 않고 switch문을 끝내기 (switch문에서 빠져나옴)
		case 2:
			pay = 1900;
			break;
		case 3:
			pay = 3600;
			break;
		case 4:
			pay = 2870;
			break;
		default:		// case 문에 해당되지 않는 값.
			System.out.println("상품 선택이 잘못되었습니다.");
			pay = 999999999;
			break;
		}
		
		System.out.println("결제 금액은 " + pay + "원 입니다.");
		
		// 위의 switch문을 if ~ else if로 바꿔보자.
		if(item_no == 1) {
			pay = 2200;
		}else if(item_no == 2) {
			pay = 1900;
		}else if(item_no == 3) {
			pay = 3600;
		}else if(item_no == 4) {
			pay = 2870;
		}else {
			System.out.println("상품 선택이 잘못되었습니다.");
			pay = 999999999;
		}
		
		System.out.println("결제 금액2는 " + pay + "원 입니다.");
		
		sc.close();
	}
}
