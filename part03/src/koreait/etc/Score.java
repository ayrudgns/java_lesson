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
@Builder		// builder �޼ҵ�� �ʵ尪�� �ʱ�ȭ�ϸ鼭 ��ü�� ������.
				// Score Ŭ������ ���� Ŭ������ ScoreBuilder Ŭ������ ������.
public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int science;
	
	
}
