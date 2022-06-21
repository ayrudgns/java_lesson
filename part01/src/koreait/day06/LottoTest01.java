package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class LottoTest01 {
	public static void main(String[] args) {
		int[] nums = new int[45];
		int[] lotto = new int[6];
		
		for(int i = 0; i < 45; i++) {
			nums[i] = i + 1;
		}
		System.out.println("ÃÊ±â nums");
		System.out.println(Arrays.toString(nums));
		
		Random r = new Random();
		for(int k = 0; k < 6; k++) {
			int lo = r.nextInt(45 - k);
			
			lotto[k] = nums[lo];
			
			System.out.println("lotto [" + k + "] = " + lo + " // num = " + nums[k]);
			System.out.println(Arrays.toString(nums));
			
			for(int i = lo; i < nums.length - 1; i++) {
				nums[i] = nums[i + 1];
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}
