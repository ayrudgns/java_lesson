package koreait.test2;

public class Overloading {

	public static void main(String[] args) {
		
		Overloading ov = new Overloading();
		
		ov.methodA("¹Ùº¸");
//		ov.me
	}
	
	
	
	public int methodA(int a, int b) {
		return a + b;
	}
	
	public int methodA(int a, int b, int c) {
		return a + b + c;
	}
	
	public int methodA(int a, double d) {
		return a + (int)d;
	}
	
	public int methodA(int a) {
		return a;
	}
	
	public String methodA(String str) {
		return str;
	}
	
//	public void methodA(double e) {
//		
//	}
//	
//	public int methodA(double e) {
//		return 0;
//	}
}
