package koreait.day13a;

import java.util.Comparator;
import koreait.day12.Member;

// Member ��ü�� sort : �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü�� ������ �Ѵ�.
public class MemberNameAscending implements Comparator<Member> {
	
	@Override
	public int compare(Member o1, Member o2) {
		return o1.getName().compareTo(o2.getName());
	}

}