package koreait.day14;

import java.util.Arrays;
import java.util.Random;

import koreait.day12.Member;

public class C59_ArraySortEx3{

	public static void main(String[] args) {
		// Member 객체를 age 필드값 오름차순으로 정렬합니다.
		Member[] members = new Member[5];
		
		members[0] = new Member("사나", 23);
		members[1] = new Member("가나", 15);
		members[2] = new Member("나나", 29);
		members[3] = new Member("미나", 23);
		members[4] = new Member("쯔위", 12);

		System.out.println("sort 전 : " + Arrays.toString(members));
		System.out.println("=================================================================================");
		for(int i = 0; i < members.length - 1; i++) {
			for(int k = i + 1; k < members.length; k++) {
				if(members[i].getAge()>members[k].getAge()) {  // i가 기준 인덱스 , k는 비교 인덱스
					Member temp = members[k];		// Member 객체의 참조값(주소) 교환
					members[k] = members[i];
					members[i] = temp;
				}
			}
			System.out.println("i = " + i + ", 중간결과 :");
			System.out.println(Arrays.toString(members));
		}
		System.out.println("=================================================================================");
		System.out.println("sort 후 : " + Arrays.toString(members));
	}

}