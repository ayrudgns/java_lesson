package koreait.day09;

public class C44_ForEachTest {
	public static void main(String[] args) {
		
		int[] itest = {1, 2, 3, 4, 5, 6};
		String[] stest = {"break", "public", "each", "package", "while"};
		
		// 배열을 for문에서 접근할 때, 인덱스 변수를 사용한다.
		for (int i = 0; i < itest.length; i++) {	// 이때 itest[i]는 int 타입이다.
			System.out.println("i = " + i + ", itest[i] = " + itest[i]);
		}
		System.out.println();
		
		// temp 변수 사용
		for (int i = 0; i < itest.length; i++) {
			int temp = itest[i];
			System.out.println("i = " + i + ", itest[i] = " + temp);
		}
		System.out.println();
		
		for (int i = 0; i < stest.length; i++) {	// 이때 stest[i]는 String 타입이다.
			System.out.println("i = " + i + ", stest[i] = " + stest[i]);
		}
		System.out.println();
		
		// temp 변수 사용
		for (int i = 0; i < stest.length; i++) {	// 이때 stest[i]는 String 타입이다.
			String temp = stest[i];
			System.out.println("i = " + i + ", stest[i] = " + temp);
		}
		System.out.println();
		
		// 코딩할 때 효율성을 높이기 위해 '향상된 for문'을 사용한다. (for each문)
		// 단, itest[i]나 stest[i]만 사용하고 인덱스 변수 i를 사용하지 않을 때
		// 배열의 값만 꺼내서 쓸때는 향상된 for문이 편하다.
		System.out.println("itest 배열값");
		for(int temp : itest) {				// 배열에 저장된 값만 순서대로 꺼내서 temp 변수에 저장
			System.out.println(temp);		// Line 15 ~ 19를 간단하게 쓴 코드이다.
		}
		System.out.println();
		
		System.out.println("stest 배열값");
		for(String temp : stest) {
			System.out.println(temp);
		}
		
	}
}
