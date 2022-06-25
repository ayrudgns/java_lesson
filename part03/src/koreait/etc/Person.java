package koreait.etc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data	// getter, setter, toString, ����Ʈ ������
@AllArgsConstructor	// data �Ŀ� import�ϸ� Ŀ���� ������ ���� ����.. ���ű�
@Builder	// �ʵ�� �Ȱ��� �̸����� �޼ҵ尡 �����ȴ�.

public class Person {
	private String name;
	private String mobile;
	private int age;
	private boolean gender;
	
}
