package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_TodayMenu {
	public static void main(String[] args) {
		System.out.println("오늘의 저녁 메뉴 투표합니다!!");
		String foods = "치맥, 떡볶이, 곱창, 불고기, 햄버거, 오징어물회";
		
		// key는 메뉴 이름, value는 투표 수
		
		// 초기화
		HashMap<String, Integer> map = new HashMap<>();
		map.put("치맥", 0);
		map.put("떡볶이", 0);
		map.put("곱창", 0);
		map.put("불고기", 0);
		map.put("햄버거", 0);
		map.put("오징어물회", 0);
		
		Scanner sc = new Scanner(System.in);
		// 메뉴 선택(반복)
		while (true) {
			System.out.println(foods);
			System.out.print("선택 메뉴의 음식명을 입력하세요. (종료는 end 입력) -> ");
			String menu = sc.nextLine();
			if(menu.equals("end")) {
				break;
			}
			if(!map.containsKey(menu)) {	// map의 key값에 menu 입력문자열이 있는지?
//				System.out.println("없는 메뉴입니다. 다른 메뉴에 투표해주세요.");
				System.out.println("없는 메뉴입니다. 메뉴에 추가합니다.");
				map.put(menu, 1);
				foods += (", " + menu);
				continue;
			}
			// 입력받은 menu의 value값을 가져와서 -> +1 하고 -> 결과를 저장하기
			int temp = map.get(menu);
//			++temp;
//			map.put(menu, temp);
			map.put(menu, ++temp);	// 증가하고 put
//			map.put(menu, temp++);	// put하고 증가
			System.out.println(map);
		}
		
		System.out.println("투표 종료");
		System.out.println("투표 결과 : " + map);
		System.out.println("최대 득표수 : " + Collections.max(map.values()));	// 가장 큰 value
//		System.out.println("최대 득표수 메뉴 : " + Collections.max(map.keySet()));	// 가장 큰 key => 햄버거 초성 ㅎ이 제일 마지막임.
		// Entry<Key, Value>
		
	}

}
