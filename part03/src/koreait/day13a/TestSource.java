package koreait.day13a;

import java.util.Comparator;

public class TestSource implements Comparable<TestSource>{
	private String korean;
	private int page;
	
	public TestSource(String korean, int page) {
		this.korean = korean;
		this.page = page;
	}
	
	public String getKorean() {
		return korean;
	}
	
	public int getPage() {
		return page;
	}

	@Override
	public int compareTo(TestSource o) {	// 얘를 page로 바꾸면 page 기준 정렬.
		String o1 = this.korean;
		String o2 = o.getKorean();
		
		return o1.compareTo(o2);
	}
	
	@Override
	public String toString() {
		return "[korean = " + korean + ", page = " + page + "]";
	}
	
}

class tsListKorAscending implements Comparator<TestSource>{
	
	@Override
	public int compare(TestSource o1, TestSource o2) {
		return o1.getKorean().compareTo(o2.getKorean());
	}
	
}

class tsListKorDescending implements Comparator<TestSource> {
	
	@Override
	public int compare(TestSource o1, TestSource o2) {
		Integer page1 = o1.getPage();
		Integer page2 = o2.getPage();
		
		return page2.compareTo(page1);
	}
}