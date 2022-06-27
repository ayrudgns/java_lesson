package prc1;

public class Gugudan {
	public static void main(String[] args) {
		
		System.out.println("구구단 출력하기");
		System.out.println();
		
		int result;
		
		for(int j = 2; j <= 9; j++) {
			System.out.println("==" + j + "단==");
			for(int i = 1; i <= 9; i++) {
				result = j * i;
				System.out.println(j + " * " + i + " = " + result);
				
			}
			System.out.println();
		}
		
		for(int j = 1; j <= 9; j++) {
			for(int i = 2; i <= 9; i++) {
				result = j * i;
				System.out.printf("%d * %d = %d\t", i, j, result);

			}
			System.out.println();
		}

	}
}
