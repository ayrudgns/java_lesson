package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

// Member 객체의 sort : 비교가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체를 만들어야 한다.
public class MemberAgeDescending implements Comparator<Member> {
	
	@Override
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		
		// age 필드(1차 기준)값이 같을 때, name 필드(2차 기준) 내림차순으로 정렬하기.
		if(age1 == age2) {
			return o2.getName().compareTo(o1.getName());
		} else {
		return age2.compareTo(age1);	// 내림차순 : age2 < age1 일 때 -1을 리턴함.
		}
	}
}
