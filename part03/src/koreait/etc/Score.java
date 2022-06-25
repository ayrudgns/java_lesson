package koreait.etc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder		// builder 메소드로 필드값을 초기화하면서 객체를 생성함.
				// Score 클래스의 내부 클래스로 ScoreBuilder 클래스가 생성됨.
public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int science;
	
	
}
