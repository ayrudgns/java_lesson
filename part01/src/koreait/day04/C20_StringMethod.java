package koreait.day04;

public class C20_StringMethod {
	public static void main(String[] args) {

		String message = "hello~";		// java.lang.String (�⺻��Ű�� Ŭ�����̴�.)
										// �⺻��Ű���� �ƴ� Ŭ������ import�� �ʿ��ϴ�. (ex: Scanner)

		// String Ŭ������ �޼ҵ� �˾ƺ���
		
		int len = message.length();
		char temp = message.charAt(3);		// 0���� �����ؼ� 3�� ���ڰ� �������� return�Ѵ�.
		boolean isState = message.equals("Hello~");		// ���ڿ��� ������ �����ش�.
		
		System.out.println("length() = " + len);	// 6
		System.out.println("chatAt(3) = " + temp);	// l
		System.out.println("equals(\"Hello~\") = " + isState);	// false
		System.out.println();
		
		System.out.println("indexOf('e') = " + message.indexOf('e'));		// 1�� ��ġ
		System.out.println("indexOf(\"lo\") = " + message.indexOf("lo"));	// 3�� ��ġ
		System.out.println("indexOf(\"ol\") = " + message.indexOf("ol"));	// -1 : ã�� ���ڿ��� ����!
		System.out.println();
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = " + test.indexOf("lo"));				// 3�� ��ġ (��ġ�ϴ� ó�� ��ġ)
		System.out.println("test.lastIndexOf(\"lo\") = " + test.lastIndexOf("lo"));		// 9�� ��ġ (��ġ�ϴ� ������ ��ġ)
		System.out.println();
		
		System.out.println("substring(2) = " + message.substring(2));		// �κ����� : llo~
		System.out.println("substring(2, 4) = " + message.substring(2, 4));	// ll, 2������ 2��(4-2)
		System.out.println("substring(1, 4) = " + message.substring(1, 4));	// ll, 2������ 2��(4-2)
		// substring���� ������ �� �ִ� ���ڴ� 0���� 5����, �� ���� ���� ���� IndexOutOfBounds ������ �߻���.
		System.out.println("replace(\"ll\", \"*@\") = " + message.replace("ll", "*@"));	// ġȯ : he*@o~
		System.out.println("startWith(\"H\") = " + message.startsWith("H"));	// false
		System.out.println("endsWith(\"~\") = " + message.endsWith("~"));		// true
	}

}

//		message.length();				// public int length() : ����
//		message.charAt(0);				// public char charAt(int index) : ����
//		message.equals("Hello~");		// public boolean equals(Object anObject), Object�� ��� Ÿ���� �����ϴ�.
										// message�� String Ÿ���̹Ƿ� �̶��� Object�� String���� �ؼ��Ѵ�.
//	���ϰ� ���� ���߱�!
//		message.indexOf('e');			// 1		==> int
//		message.indexOf("lo");			// 3, 4 (?)	==> int		!! Ʋ��, ��ġ�ϴ� ó�� ��ġ�� �ε����� ��µ�.
//		message.substring(2);			// llo~		==> String
//		message.substring(2, 4);		// llo		==> String 	!! Ʋ��, ������ �ε����� �������� ����.
//		message.replace("ll", "*@");	// he*@o~	==> String	@@ Ư�� ���ڿ��� �ٸ� ���ڿ��� ��ü��, ���̰� �޶� ��.
//	�޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���������� ����, ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��.
