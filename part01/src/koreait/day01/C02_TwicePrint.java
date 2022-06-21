package koreait.day01;

public class C02_TwicePrint {
	public static void main(String[] args) {
		System.out.println("트와이스");
		System.out.println("이름\t생년월일\t\t나이");	// 한 개의 문자열을 출력
		System.out.println("===============================");
		System.out.println("사나\t1996.12.29\t27");
		System.out.println("지효\t1997.02.01\t26");
		System.out.println("미나\t1998.03.24\t25");
		// printf() 메소드를 사용해서 출력 형식을 지정합니다.
		// 12칸 문자열 + 자릿수를 지정하지 않은 문자열 + 5칸을 차지하는 정수
		// %s는 지정된 칸에서 오른쪽으로 맞춤, -를 붙이면 왼쪽 맞춤으로 바뀜.
		System.out.printf("%-12s%s%5d\n", "dahyeon", "1998.05.28", 25);
		System.out.printf("%-12s%s%5d\n", "momo", "1999.04.23", 24);
		System.out.printf("%-12s%s%5d\n", "nayeon", "1997.06.14", 27);
		
		// printf() 메소드에서는 형식 문자 개수와 뒤에 나오는 데이터의 개수가 일치해야 한다.
//		System.out.printf("%-12s%s%5d\n", "nayeon", "1997.06.14");
		// printf() 메소드에서 형식 문자와 뒤에 나오는 데이터의 형식이 일치해야 한다.
//		System.out.printf("%-12s%5d\n", "nayeon", "1997.06.14");
		System.out.println();
		
		// 연습 : System.out.printf("%-12s%s%5d\n", "dahyeon", "1998.05.28", 25);
		//	ㄴ 생년월일 "1998.05.28"을 정수 형식으로 출력하도록 수정하기
		System.out.println("///// 연습 /////");
		System.out.printf("%-12s%4d.%02d.%2d%5d\n", "dahyeon", 1998, 05, 28, 25); 
		System.out.printf("%-12s%4d.%2d.%2d%5d\n", "momo", 1999, 11, 23, 24);
		System.out.printf("%-12s%4d.%02d.%02d%5d\n", "nayeon", 1997, 06, 03, 27);
		// .과 0은 형식문자에 추가하여 출력하면 된다.
		// 형식이 있는 경우에는 위와 같이 형식 출력으로 코드를 작성하는 것이 좋다.
		// 여기까지는 데이터를 직접 리터럴(literal, 값 자체)로 표현해서 출력했다.
		
		// 진도 방향 : 변수(데이터를 저장하고 있는 기억장소의 이름)를 사용하기
//		System.out.printf("%-12s%4d.%02d.%02d%5d\n", name, year, month, day, age);
		 
	}
/*
 * 	출력에 사용되는 형식
 * 	\ (역슬래쉬) 사용하는 이스케이프 문자 : \n (줄바꿈), \t (tab키)
 * 	형식지정문자 %기호 사용 : %s (문자열), %d (정수), 자릿수를 지정해서 쓸 수 있습니다.
 * 									ㄴ 남은 자리를 0으로 채울 때에는 %03d와 같이 입력해주면 됨.
 */
}
