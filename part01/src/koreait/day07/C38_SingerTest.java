package koreait.day07;

public class C38_SingerTest {
	public static void main(String[] args) {
		
		Singer twice = new Singer();		// Ʈ���̽� �����
		
		twice.name_eng = "Twice";
		twice.name_kor = "Ʈ���̽�";
		twice.debutYear = 2015;
		twice.genre = "Kpop-GirlGroup";
		
		twice.members = new String[9];		// ** �迭�� ���̸� �˷����� ������ ���� �߻� **
		twice.members[0] = "���";		
		twice.members[1] = "����";
		twice.members[2] = "����";
		
		System.out.println("twice members");
		twice.printMembers();
		System.out.println("Ȱ���Ⱓ : " + twice.actYears(2022) + "��");
		System.out.println();
		
		Singer beo = new Singer();			// ��� �����
		
		beo.name_eng = "BE'O";
		beo.name_kor = "���";
		beo.genre = "Hiphop";
		beo.printMembers();
		System.out.println();
		
		System.out.println(Singer.JOB + Singer.label);
		System.out.println(twice.toString());
		System.out.println(beo.toString());
		System.out.println();
		System.out.println(twice);		// ��ü ���� Ÿ���� ��, toString() ������ ����
		System.out.println(beo);
		System.out.println();
		
		Singer blackPink = new Singer();		// ����ũ �����
		
		blackPink.debutYear = 2016;
		blackPink.genre = "K-pop";
		blackPink.members = new String[4];
		blackPink.members[0] = "����";
		blackPink.members[1] = "����";
		blackPink.members[2] = "����";
		blackPink.members[3] = "����";
		blackPink.name_eng = "BLACKPINK";
		blackPink.name_kor = "����ũ";
		System.out.println("======= ����ũ =======");
		System.out.println(blackPink.JOB + blackPink.label);
		blackPink.printMembers();
		System.out.println(blackPink);
		System.out.println("Ȱ���Ⱓ : " + blackPink.actYears(2022) + "��");
		
	}

}
