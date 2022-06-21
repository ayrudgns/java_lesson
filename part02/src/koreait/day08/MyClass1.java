package koreait.day08;

public class MyClass1 {
	
		private int age;		// 자바의 특성 : 은닉성(기밀성)은 클래스의 필드값에 다른 클래스가 직접 접근하지 못하도록 합니다. (캡슐화 : Encapsulation)
		String name;
		public double point;
		// private 필드는 setter, getter가 있어야 다른 클래스에서 값 쓰기/읽기를 할 수 있음. ==> 캡슐화, 은닉성, 무분별한 사용 방지
		void setAge (int age) {			// setAge는 package 한정자
			if(age > 1 && age <=150) {	// age 필드값의 검사
				this.age = age;		// age 필드는 현재 클래스에서만 접근.
			} else {
				System.out.println("잘못된 값입니다.");
			}

		}

		int getAge() {			// getAge는 package 한정자
			return age;
		}
}


/*
	private int age;			// private  : 다른 클래스에서 사용할 수 없다. 사적인, 나(현재 클래스)만 사용한다.
	String name;				// default(package)  : 다른 패키지에서 사용할 수 없다. 이웃이면 같이 쓴다.
	public double point;			// public   : 어디서나 사용한다. 공공의, 공용의, ... 다같이 쓴다.

	private, default, protected(상속에서 사용), public은 
	변수(필드), 메소드, 생성자, 클래스 등에 사용되는 접근한정자이다. (클래스는 접근한정자 default, public만 사용한다.)
 */

