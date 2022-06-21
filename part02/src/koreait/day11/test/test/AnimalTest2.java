package koreait.day11.test.test;

public class AnimalTest2 {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[2] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("����A");
		animals[4] = new Frog();
		animals[4].setName("����B");
		animals[6] = new Crow();
		animals[8] = new Dog();
		System.out.println();
		
		for(Animal temp : animals) {
			if(temp != null) {
				temp.act();
			}
		}
		System.out.println();
		
		// ���� �ð� : ms, ns (1970�� 1�� 1�� ������ �������� �������� ī��Ʈ�� ���̴�.)
		System.out.println("���� �ð���?");
		System.out.println(System.currentTimeMillis() + " ms");
		System.out.println(System.nanoTime() + " ns");
		System.out.println();
		
		// �������� ���? ==> instaceof ������ �̿�
		System.out.println("������ ���� �ֱ� *************");
		int cnt = 0;		// count ����.
		long start = System.nanoTime();		// instance ���� �ҿ� �ð� Ȯ��
		for(Animal temp : animals) {
			if(temp != null && temp instanceof Frog) {
				cnt++;
				System.out.println(temp.eat(100 * (cnt + 2)));
			}
		}
		long end = System.nanoTime();
		System.out.println("������ ���� �ִ� ���� �ɸ� �ð� : " + (end - start) + " ns");
		System.out.println("�������� " + cnt + "���� ��� �ֽ��ϴ�.");
		System.out.println();
		
		// �������� ���? ==> instanceof ���� ���� �ʰ�. int type �ʵ� �̿�. ������ ���̵� �ֱ�.
		System.out.println("������ ���� �ֱ� *************");
		cnt = 0;
		start = System.nanoTime();
		for(Animal temp : animals) {
			if(temp != null && temp.type == Animal.DOG) {
				cnt++;
				System.out.println(temp.eat("���ִ� ����"));
			}
		}
		end = System.nanoTime();
		System.out.println("������ ���� �ִ� ���� �ɸ� �ð� : " + (end - start) + " ns");
		System.out.println("�������� " + cnt + "���� ��� �ֽ��ϴ�.");
		System.out.println();
	
		// ��� ���� �ֱ�
		System.out.println("��� ���� �ֱ� *************");
		System.out.println(animals[6].eat(animals[3]));
		
		
	}
}

class Frog extends Animal{	// ������
	
	protected String mouth;	// ���� ��� ���� : default ������(���� ��Ű��) + �ٸ� ��Ű���� �ڽ�Ŭ����
	
	public Frog() {
		System.out.println("���ο� ���� ������ frog");
		type = Animal.FROG;
	}
	
	public void jump() {
		setName("������");
		setColor("�ʷϻ�");
		System.out.println("Ư¡ : ����");
	}
	@Override		// annotation (�ֳ����̼�) : �ڵ�(�Ǵ� ����)�� �� ���� �Ǵ� �ּ�.
	public void act() {
//		super.act();		// �θ�Ŭ������ act() ���� : ��������. ���ʿ�� �ּ�ó��.
		System.out.println("Frog �ൿ : ���÷� �����ϱ�");
	}
	
	@Override
		public String eat(Object object) {
			return "unknown " + object;
		}
}

class Cat extends Animal{	// �����
	
	protected String eyes;
	
	public Cat() {
		System.out.println("���ο� ���� ������ cat");
		type = Animal.CAT;
	}
	
	public void sound() {
		setName("�����");
		setColor("�Ͼ��");
		System.out.println("Ư¡ : �߿˾߿�");
	}
	
	@Override
	public void act() {
		System.out.println("Animal �ൿ : ���÷� �߿˾߿� ���");
	}
	
	@Override
	public String eat(Object object) {
		return null;
	}
}
