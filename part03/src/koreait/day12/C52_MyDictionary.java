package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {
	// ����??
// �ۼ��� : juleeus	
	public static void main(String[] args) {
//		HashMap<String, String> dic = new HashMap<>();
		TreeMap<String, String> dic = new TreeMap<String, String>();
		// ���� �˻��� ������ ������ Map�� ���� : ������ �Ǵ� Map�̴�.
		Scanner sc = new Scanner(System.in);
		String eng;
		String kor;
		boolean go = true;
		
		while(go) {			// go�� false�� �� ������ �ݺ�.
			System.out.println("���� ��� : 1. �ܾ� ���� | 2. �ܾ� �˻� | 3. �ܾ��� ���� | 4. ���α׷� ������");
			System.out.print("���� => ");
			String x = sc.nextLine();			// �ƴ� �̰� nextInt�� ��� �ް� �־���.. �׷��� �ȵ���..
			switch (x) {		// �Է��� x�� ���� case �з�
				case "1":
					System.out.print("English => ");	// ���� �ܾ� �Է�
					eng = sc.nextLine();
					System.out.print("Korean => ");		// �ѱ� �� �Է�
					kor = sc.nextLine();
					dic.put(eng, kor);				// dic�� key���� value�� ���� + ����
					break;
				case "2":
					System.out.print("�˻� �ܾ� English => ");	// ���ܾ� �˻�
					eng = sc.nextLine();
					System.out.println("�ܾ��� �˻��߽��ϴ�. ��� => " + dic.get(eng));
					break;
				
				case "3":
					System.out.println("�ܾ��� ��ü���� : " + dic);	// dic Ʈ���� ��ü����
					break;
				
				case "4":
					go = false;			// go �� false�� �Ǵϱ� while�� ����
					break;
	
				default:
					System.out.println("�߸� �Էµ� ���Դϴ�. �ٽ� �Է��ϼ���. (���� 1 ~ 4)");
					break;
			}
		}	// ���� : ���� ������ �Է��� �޾ƾ� �Ѵٸ�, ���ڿ� nextLine()���� �޾Ƽ� ������ ��ȯ�����ش�. !!
			// ��� : Integer.parseInt(sc.nextLine()) �޼ҵ带 �̿��Ѵ�.
			// ex) int x = Integer.parseInt(sc.nextLine());
			// nextInt()�� enter�� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ذ� �ȴ�.
			// ��� : �� �ҽ����Ͽ��� nextInt()�� ��� �Ǵ� nextLine()�� ����� ��.
	}
}
