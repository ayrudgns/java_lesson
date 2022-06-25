package koreait.etc;

import java.util.ArrayList;
import java.util.List;

public class ScoreTest {
	public static void main(String[] args) {
		
// Builder Pattern (빌더 패턴) : 필드 초기값을 다양하게 주고 싶은 경우에 사용하는 패턴
// ==> 필드가 많으면 커스텀 생성자가 많아지는 문제점이 있는데, 이를 해결하기 위한 것이 빌더 패턴
// 패턴 : 일종의 코딩 방식. 개발자들이 자주 사용하는 기능을 구현한 형식을 정의함.
		
		Score momo = Score.builder().eng(99).build();
		Score nana = Score.builder().kor(88).build();
		Score sinbi = Score.builder().eng(77).science(100).build();
		// 괄호 안의 값이 초기값이다.
		
		Person p1 = Person.builder()
				.age(34)
				.name("모모")
				.build();	// .(dot)을 기준으로 위에서 아래로 써주는 것이 가독성이 좋다.
		
		System.out.println(p1);
		System.out.println();
		
		Score s = new Score("모모", 99, 80, 70);
		Score momo2 = new Score(null, 99, 0, 0);	// Line 12와 같은 의미
		Score sinbi2 = new Score(null, 77, 0, 100);	// Line 14와 같은 의미
		
		
		// 연습
		List<Score> list = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			Score k = Score.builder().eng(90 + i).kor(i * 9).build();
			list.add(k);
		}
		System.out.println(list);
		// 여기까지
	}
}
