package koreait.test;

public abstract class Product {		// [3]
// �ۼ��� : �̰���
	protected int price;			// [2]
	protected String prdName;		// [1], [2]

	public abstract String sell(Object obj);	// [3]

	
}
