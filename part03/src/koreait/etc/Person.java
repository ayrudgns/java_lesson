package koreait.etc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data	// getter, setter, toString, 디폴트 생성자
@AllArgsConstructor	// data 후에 import하면 커스텀 생성자 생성 가능.. 개신기
@Builder	// 필드랑 똑같은 이름으로 메소드가 생성된다.

public class Person {
	private String name;
	private String mobile;
	private int age;
	private boolean gender;
	
}
