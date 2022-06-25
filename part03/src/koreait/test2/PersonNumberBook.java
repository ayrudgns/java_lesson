package koreait.test2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PersonNumberBook {
// 작성자 : 이경훈
	 public static void main(String[] args) {
		
		 List<Person> numlist = new ArrayList<>();
		 Scanner sc = new Scanner(System.in);
		 
		 String inputName, inputNumber, x;
		 int groupNumber;
		 boolean run = true;
		 
		 System.out.println("선택 기능 👉 [n] 새 연락처 저장     [s] 연락처 찾기     [g] 그룹 선택 보기     [a] 전체보기     [e] 프로그램 끝내기");
		 
		 while (run) {
			System.out.print("선택 ✏ -> ");
			x = sc.nextLine();
			
			switch (x) {
			case "n":
				System.out.print("이름 입력 -> ");
				inputName = sc.nextLine();
				System.out.print("휴대 번호 -> ");
				inputNumber = sc.nextLine();
				System.out.print("그룹 (1: 친구, 2: 가족, 3: 비지니스) -> ");
				groupNumber = Integer.parseInt(sc.nextLine());
				numlist.add(new Person(inputName, inputNumber, groupNumber));
				break;
				
			case "s":
				System.out.print("검색 이름 -> ");
				inputName = sc.nextLine();
				int cnt = 0;
				for(Person p : numlist) {
					if(p.getName().equals(inputName)) {
						System.out.println(p);
						cnt++;
					}
				}
				System.out.println(cnt + "건이 검색되었습니다.");
				break;
				
			case "g":
				System.out.print("그룹 선택 (1: 친구, 2: 가족, 3: 비지니스) -> ");
				int group = Integer.parseInt(sc.nextLine());
				group(numlist, group);
				break;
				
			case "a":
				System.out.println("연락처 전체 목록");
				all(numlist);
				break;
				
			case "e":
				System.out.println(":::: 너의 주소록 종료합니다. ::::");
				run = false;
				break;

			default:
				System.out.println("👁 잘못 입력된 선택입니다. 메뉴에 맞는 알파벳을 입력하세요..");
				break;
			}
		 }
				 
	}

	private static void all(List<Person> numlist) {
		
		numlist.sort(new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println(String.format("%-20s %-20s", "이름", "휴대 전화"));
		System.out.println();
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(Person p : numlist) {
			System.out.println(String.format("%-20s %-20s\n", p.getName(), p.getMobile()));
		}
	}

	private static void group(List<Person> numlist, int group) {
	
		for(Person p : numlist) {
			if(p.getGroup() == group) {
				System.out.println(p);
			}
		}
	}
}
