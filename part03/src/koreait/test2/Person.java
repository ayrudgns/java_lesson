package koreait.test2;

public class Person {
// �ۼ��� : �̰���
	static final int FRIENDS = 1;
	static final int FAMILY = 2;
	static final int BUSINESS = 3;

	private String name;
	private String mobile;
	private int group;
	
	@Override
	public String toString() {
		return "[name = " + name + "] mobile = " + mobile + ", �׷� = " + 
				(group == 1? "ģ��" : group == 2? "����" : "�����Ͻ�");
	}
	
	// Ŀ���� ������
	
	public Person(String name, String mobile, int group) {
		this.name = name;
		this.mobile = mobile;
		this.group = group;
	}

	// getter, setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}
	
	

}

