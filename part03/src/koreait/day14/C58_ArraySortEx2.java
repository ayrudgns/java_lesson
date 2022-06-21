package koreait.day14;

import java.util.Arrays;

public class C58_ArraySortEx2 {
	// 배열에 저장된 값을 정렬하는 것을 구현하기.
	public static void main(String[] args) {
		String[] names = {"제니", "다현", "나연", "신비", "은하", "모모"};
		String tmp;
		
		for(int i = 0; i < names.length - 1; i++) {
			for(int k = i + 1; k < names.length; k++) {
				if(names[i].compareTo(names[k]) > 0) {
					tmp = names[k];
					names[k] = names[i];
					names[i] = tmp;
				}
			}
		}
		System.out.println("String 배열 오름차순 정렬 : " + Arrays.toString(names));
		
		for(int i = 0; i < names.length - 1; i++) {
			for(int k = i + 1; k < names.length; k++) {
				if(names[i].compareTo(names[k]) < 0) {
					tmp = names[i];
					names[i] = names[k];
					names[k] = tmp;
				}
			}
		}
		System.out.println("String 배열 내림차순 정렬 : " + Arrays.toString(names));
	}

}
