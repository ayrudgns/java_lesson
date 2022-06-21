package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class C49_LottoTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 0; i < 45; i++) {
			numbers.add(i + 1);
		}
		System.out.println("numbers :");
		System.out.println(numbers);
		
		Random r = new Random();
		
		ArrayList<Integer> lotto = new ArrayList<>();
		
		int k;	// 난수로 뽑힐 값의 인덱스
		
		for(int cnt = 0; cnt < 6; cnt++) {
			k = r.nextInt(45 - cnt);
			System.out.println("k = " + k + ", number = " + numbers.get(k));
			lotto.add(numbers.get(k));
			numbers.remove(k);		// 뽑힌 값을 해당 인덱스에서 삭제
			System.out.println("남은 공 :");
			System.out.println(numbers);
		}
		System.out.println();
		
		System.out.println("최종 선택 숫자 6개 :");
		System.out.println(lotto);
	}
// 배열은 저장된 값의 위치를 변경(삽입 또는 삭제)하는 메소드가 없고, 크기가 정적이기 때문에 배열보다는 ArrayList를 활용하는 것이 편리하다.
// 또한, 웹프로그래밍을 할 때 ArrayList가 필수이다.
}
