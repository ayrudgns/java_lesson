package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {
	public static void main(String[] args) {
		// String Ŭ������ split(�п�, �ɰ���) �޼ҵ�.
		
		String temp = "��� 90 88 79";
		String[] result = temp.split(" ");		// ������ �������� ���ڿ��� �������� �ɰ���.
		
		System.out.println("1. �ݺ��� ���� ���");
		System.out.println("index 0 : " + result[0]);
		System.out.println("index 1 : " + result[1]);
		System.out.println("index 2 : " + result[2]);
		System.out.println("index 3 : " + result[3]);
		System.out.println();
		
		// for�� Ȱ��
		System.out.println("2. �Ϲ����� for�� ���");
		for(int i = 0; i < result.length; i++) {
			System.out.println(String.format("result[%d] : %s", i, result[i]));
		}
		System.out.println();
		
		// ���� for�� Ȱ��
		System.out.println("3. ���� for�� ���");
		for(String t : result) {
			System.out.println("result ��� : " + t);
		}
		System.out.println();
		
		String temp2 = "���,90,88,79";	// split �޼ҵ�� ������ �ν��ϱ� ������.
		result = temp2.split(",");		// ������ ������ �������, ������ ���´�� String�� �迭���� ���Ͻ��� �־�� �Ѵ�.
		System.out.println("4. split ���� ��ȣ ','");
		for(String t : result) {
			System.out.println("result ��� : " + t);
		}
		System.out.println();
		
		temp2 = "���,,90,,88,,79";		
		result = temp2.split(",");	
		System.out.println("5. split ���� ��ȣ ','");
		System.out.println("result.length : " + result.length);		// ���� 7, �޸��� �޸� ���� ��ҷ� �ν���.
		for(String t : result) {
			System.out.println("result ��� : " + t);
		}
		// result[1], result[3], result[5] �� 3���� �� ���ڿ� (,�� , ������ �� ���ڿ��� �ν���.)
		System.out.println();
		
		result = temp2.split(",,");		// ���� ��ȣ ���ڿ��� ������.
		System.out.println("6. split ���� ��ȣ ',,'");
		System.out.println("result.length : " + result.length);
		for(String t : result) {
			System.out.println("result ��� : " + t);
		}
		System.out.println();
		
		// split�� ������ ���ڿ��� ���Խ� ���ڿ��̴�. (���Խ��� ������ �����ϰ� �����..)
		// ���Խ��� ���� : [] �ȿ� ǥ���ϴ� ���� ���� �������� �Ǵ�(or, �� split)�� �ش�ȴ�. Line 61 ����!
		// regex = 'reg'ular 'ex'pression = ���Խ�
		temp2 = "���,90 88()79";
		result = temp2.split("[ ,()]");		// ���Խ� ���ڿ� : ���� ��ȣ�� ���� �Ǵ� , �Ǵ� ( �Ǵ� )
		System.out.println("7. split ���ڰ� ���Խ�");
		System.out.println("result.length : " + result.length);		// ���� 5
		for(String t : result) {
			System.out.println("result ��� : " + t);
		}
		System.out.println();
		
		temp2 = "���,90,88,79";
		result = temp2.split(",", 2);		// temp2.split(regex, limit); ==> �޼ҵ� �����ε�
		System.out.println("8. split �ι�° ������ limit Ȯ��");
		// limit�� ���ϵǴ� �迭�� ũ��. ��, �ɰ����� �������� Ŀ�� ���� ����.
		System.out.println("result.length : " + result.length);
		for(String t : result) {
			System.out.println("result ��� : " + t);
		}
		System.out.println();
		
// ********************************************************************************** //
		
		// �迭�� ���������� ���� ���� ���̴� �ڷ� ���� : List
		// �迭�� List�� ��ȯ�ϴ� ���
		result = temp2.split(",");
		System.out.println("9. result �迭�� List ��ü�� ����");
		List<String> rlist = Arrays.asList(result);
		System.out.println(rlist);
		System.out.println("rlist.size : " + rlist.size());
		for(String t : rlist) {
			System.out.println("rlist ��� : " + t);
		}
		System.out.println();
		
		// ���� rlist�� �迭�� ũ�⸸ŭ List�� ũ�⸦ �������� �����Ѵ�. (List ��ü�� ������ �� ����. �߰�/����/���� �Ұ���)
//		rlist.add("test");	// ���� : ������ ũ���� rlist�̹Ƿ� �߰��� �� ����.
//		rlist.remove(2);	// ���� : rlist ��ü�� �����Ǿ� �����Ƿ� ������ �Ұ���.
//		rlist.add(2, "100");	// Line 97�� �������� ������ ���� 
		
		// �ٽ� ������ List�� �����. (�߰�/����/������ �� �ִ� List�� �����)
		System.out.println("10. ArrayList�� ���ڰ� �ִ� ������ �׽�Ʈ, �߰�/����/������ �� �ִ� List");
		List<String> rlist2 = new ArrayList<String>(rlist);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2, "100");
		System.out.println(rlist2);
		System.out.println();
		
		// Arrays.asList�� �׽�Ʈ������ ����� List�� ����ų� ������ ���� List�� ���� �� �����ϴ�.
		List<Integer> ilist = Arrays.asList(1, 2, 6, 9, 100);
		System.out.println("11. Arrays.asList Ȱ��");
		System.out.println(ilist);
	}
}
