package koreait.day11.test.test;

public class AnimalTest2 {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[2] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("개굴A");
		animals[4] = new Frog();
		animals[4].setName("개굴B");
		animals[6] = new Crow();
		animals[8] = new Dog();
		System.out.println();
		
		for(Animal temp : animals) {
			if(temp != null) {
				temp.act();
			}
		}
		System.out.println();
		
		// 현재 시간 : ms, ns (1970년 1월 1일 자정을 기준으로 단위마다 카운트한 값이다.)
		System.out.println("현재 시간은?");
		System.out.println(System.currentTimeMillis() + " ms");
		System.out.println(System.nanoTime() + " ns");
		System.out.println();
		
		// 개구리는 몇마리? ==> instaceof 연산을 이용
		System.out.println("개구리 먹이 주기 *************");
		int cnt = 0;		// count 변수.
		long start = System.nanoTime();		// instance 연산 소요 시간 확인
		for(Animal temp : animals) {
			if(temp != null && temp instanceof Frog) {
				cnt++;
				System.out.println(temp.eat(100 * (cnt + 2)));
			}
		}
		long end = System.nanoTime();
		System.out.println("개구리 먹이 주는 데에 걸린 시간 : " + (end - start) + " ns");
		System.out.println("개구리는 " + cnt + "마리 살고 있습니다.");
		System.out.println();
		
		// 강아지는 몇마리? ==> instanceof 연산 쓰지 않고. int type 필드 이용. 강아지 먹이도 주기.
		System.out.println("강아지 먹이 주기 *************");
		cnt = 0;
		start = System.nanoTime();
		for(Animal temp : animals) {
			if(temp != null && temp.type == Animal.DOG) {
				cnt++;
				System.out.println(temp.eat("맛있는 간식"));
			}
		}
		end = System.nanoTime();
		System.out.println("강아지 먹이 주는 데에 걸린 시간 : " + (end - start) + " ns");
		System.out.println("강아지는 " + cnt + "마리 살고 있습니다.");
		System.out.println();
	
		// 까마귀 먹이 주기
		System.out.println("까마귀 먹이 주기 *************");
		System.out.println(animals[6].eat(animals[3]));
		
		
	}
}

class Frog extends Animal{	// 개구리
	
	protected String mouth;	// 접근 허용 범위 : default 한정자(같은 패키지) + 다른 패키지의 자식클래스
	
	public Frog() {
		System.out.println("새로운 동물 가족은 frog");
		type = Animal.FROG;
	}
	
	public void jump() {
		setName("개구리");
		setColor("초록색");
		System.out.println("특징 : 점핑");
	}
	@Override		// annotation (애너테이션) : 코딩(또는 실행)할 때 참고가 되는 주석.
	public void act() {
//		super.act();		// 부모클래스의 act() 실행 : 선택적임. 불필요시 주석처리.
		System.out.println("Frog 행동 : 수시로 점핑하기");
	}
	
	@Override
		public String eat(Object object) {
			return "unknown " + object;
		}
}

class Cat extends Animal{	// 고양이
	
	protected String eyes;
	
	public Cat() {
		System.out.println("새로운 동물 가족은 cat");
		type = Animal.CAT;
	}
	
	public void sound() {
		setName("고양이");
		setColor("하얀색");
		System.out.println("특징 : 야옹야옹");
	}
	
	@Override
	public void act() {
		System.out.println("Animal 행동 : 수시로 야옹야옹 울기");
	}
	
	@Override
	public String eat(Object object) {
		return null;
	}
}
