package koreait.etc;

import java.util.ArrayList;
import java.util.List;

public class ScoreTest {
	public static void main(String[] args) {
		
// Builder Pattern (���� ����) : �ʵ� �ʱⰪ�� �پ��ϰ� �ְ� ���� ��쿡 ����ϴ� ����
// ==> �ʵ尡 ������ Ŀ���� �����ڰ� �������� �������� �ִµ�, �̸� �ذ��ϱ� ���� ���� ���� ����
// ���� : ������ �ڵ� ���. �����ڵ��� ���� ����ϴ� ����� ������ ������ ������.
		
		Score momo = Score.builder().eng(99).build();
		Score nana = Score.builder().kor(88).build();
		Score sinbi = Score.builder().eng(77).science(100).build();
		// ��ȣ ���� ���� �ʱⰪ�̴�.
		
		Person p1 = Person.builder()
				.age(34)
				.name("���")
				.build();	// .(dot)�� �������� ������ �Ʒ��� ���ִ� ���� �������� ����.
		
		System.out.println(p1);
		System.out.println();
		
		Score s = new Score("���", 99, 80, 70);
		Score momo2 = new Score(null, 99, 0, 0);	// Line 12�� ���� �ǹ�
		Score sinbi2 = new Score(null, 77, 0, 100);	// Line 14�� ���� �ǹ�
		
		
		// ����
		List<Score> list = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			Score k = Score.builder().eng(90 + i).kor(i * 9).build();
			list.add(k);
		}
		System.out.println(list);
		// �������
	}
}
