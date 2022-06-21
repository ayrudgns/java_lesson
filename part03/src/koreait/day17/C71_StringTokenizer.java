package koreait.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class C71_StringTokenizer{
// token : ǥ��(�ּ� ������ �з�)
	public static void main(String[] args) {
		
		String temp = "��� 90 88 79";
		
		// ��ūȭ : StringTokenizer Ŭ������ ��� ����ϱ�
		// ���� ��ȣ�� �⺻ ���� : ����, ��, �ٹٲ�
		StringTokenizer stk = new StringTokenizer(temp);
		System.out.println("1. nextToken() �޼ҵ�");	// "��� 90 88 79"
		System.out.println(stk.nextToken());		//   ��(��ũ�������� ������, nextToken() �޼ҵ� �� ��ġ �̵�)
		System.out.println(stk.nextToken());		//      ��(��ũ�������� ������, nextToken() �޼ҵ� �� ��ġ �̵�)
		System.out.println(stk.nextToken());		//         ��(��ũ�������� ������, nextToken() �޼ҵ� �� ��ġ �̵�)
		System.out.println(stk.nextToken());		//            ��(��ũ�������� ������, nextToken() �޼ҵ� �� ��ġ �̵�)
		System.out.println("stk.hasMoreTokens? : " + stk.hasMoreTokens());	// false
		System.out.println();

		System.out.println("2. �ݺ������� hasMoreTokens �޼ҵ�");
		// ��ū���� �����͸� �� �а� ���� �ٽ� ������ �ٽ� ��ü�� �����ؾ���.
		stk = new StringTokenizer(temp);	// ��ũ������ ��ü �����
		while (stk.hasMoreTokens()) {		// ������ �о�� ��ū�� ������
			System.out.println(stk.nextToken());
		}
		System.out.println();
		
		System.out.println("3. �������� ���� ��ȣ ����ϱ�");
		temp = "���,90 88()79";				// empty�� ������ �ʴ´�. (split���� ������)
		stk = new StringTokenizer(temp, " ,()");	// �ι�° ���ڴ� delim : ���� ��ȣ ���ڸ� �����ϱ�. (���Խ� X)
		while (stk.hasMoreTokens()) {				//				�� Delimiter(s)
			System.out.println(stk.nextToken());	// ������
		}											//	���
		System.out.println();						//	90
													//	88
													//	79	==> (�� ) ������ empty�� ������ �ʴ´�.
		
		System.out.println("4. ��ūȭ �����ͷ� ��ü �����");
		temp = "��� 90 88 79";
		stk = new StringTokenizer(temp);
		Score score = null;
		while(stk.hasMoreTokens()) {
			score = new Score(stk.nextToken(), 
					Integer.parseInt(stk.nextToken()), 	
					Integer.parseInt(stk.nextToken()), 		// split()�� �迭�θ� ��ȯ�ϹǷ�, �ѹ� �� ��ȯ���־�� ��.
					Integer.parseInt(stk.nextToken()));		// Tokenizer�� �ٷιٷ� ��ü�� �־��� �� ����.
		}
		System.out.println("������ Score ��ü : " + score);		// �� ���ű���.. ***
		System.out.println("���� : " + score.sum());	
		System.out.println("��� : " + score.average());	
		System.out.println("���� : " + score.getGrade());
		System.out.println();
		
		// List�� ����� ==> ������ �ٽ� �غ���.
		System.out.println("5. ArrayList ���� StringTokenizer�� ��ü �����ϱ�");
		temp = "��� 90 88 79\n���� 78 83 79\n�ź� 92 73 66";
		stk = new StringTokenizer(temp);				// StringTokenizer�� ������.
		List<Score> scores = new ArrayList<>();			// List ����. Ÿ���� Score Ÿ��.

		while(stk.hasMoreTokens()) {
			score = new Score(stk.nextToken(), 				// ��ü ����� + �ְ� (�̸�)
					Integer.parseInt(stk.nextToken()), 		// �ְ� (��������)
					Integer.parseInt(stk.nextToken()), 		// �ְ� (��������)
					Integer.parseInt(stk.nextToken()));		// �ְ� (��������)
			scores.add(score);								// ����Ʈ�� �߰�	(�� ������ �ݺ�)
		}
		System.out.println("��ũ������ ��� : " + scores);	
		System.out.println();

		scores.clear();		// ����Ʈ�� ��� ��Ҹ� �����ϱ�
		
		// split() �޼ҵ� ���� ����� ��� ��ü�� ���� �� ������? ==> ������ �ٽ� �غ���.
		System.out.println("6. split() �޼ҵ带 �̿��Ͽ� ArrayList�� ��ü �����ϱ�");
		String[] result = temp.split("[ \n]");			// temp�� split() �޼ҵ�� ���´�. ���� ���� ����.
		for(int i = 0; i < result.length; i += 4) {		// i += 4�� 4���� ���ư��ϱ�.
			Score s = new Score(result[i + 0], 			// ��ü ����� + �ְ� (�̸�)
					Integer.parseInt(result[i + 1]), 	// �ְ� (��������)
					Integer.parseInt(result[i + 2]),	// �ְ� (��������)
					Integer.parseInt(result[i + 3]));	// �ְ� (��������)
			scores.add(s);								// ����Ʈ�� �߰�	(�� ������ �ݺ�, result�� length ��ŭ)
		}
		System.out.println("split() �޼ҵ� ��� : " + scores);
	
	}

}
