package koreait.day14;

import java.util.Arrays;

public class C57_ArraySortEx {
	// 배열에 저장된 값을 정렬하는 것을 구현하기.
	public static void main(String[] args) {
		int[] nums = {34, 77, 19, 56, 45, 9};
		int tmp = 0;
		
		for(int i = 0; i < nums.length - 1; i++) {
			for(int k = i + 1; k < nums.length; k++) {
				if(nums[i] > nums[k]) {
					tmp = nums[k];
					nums[k] = nums[i];
					nums[i] = tmp;
				}
			}
		}
		System.out.println("int 배열 오름차순 정렬 : " + Arrays.toString(nums));
		
		for(int i = 0; i < nums.length - 1; i++) {
			for(int k = i + 1; k < nums.length; k++) {
				if(nums[i] < nums[k]) {
					tmp = nums[i];
					nums[i] = nums[k];
					nums[k] = tmp;
				}
			}
		}
		System.out.println("int 배열 내림차순 정렬 : " + Arrays.toString(nums));
	}

}
