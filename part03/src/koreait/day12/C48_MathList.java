package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class C48_MathList {
// C43번 예제 리스트로 변경하기.	// 작성자 : 이경훈 (파일로 제출)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int size = 5;
		
		ArrayList<MathProblemDay12> problems = new ArrayList<>();
		
		int ans;
		int cnt = 0;
		
		System.out.println("=============================");
		System.out.println("   빨간펜 수학 2자리 덧셈 문제 풀기      ");
		System.out.println("=============================");
		System.out.println("시작합니다.");
		
		for(int i = 0; i < size; i++) {
			MathProblemDay12 tmp = new MathProblemDay12('+');
			tmp.makeProb();
			
			System.out.print("문제 " + (i + 1) + ". " + tmp.problem() + " 답 입력 -> ");
			ans = sc.nextInt();
			if(ans == tmp.showAnswer()) {
				cnt++;
				tmp.setCorrect(true);
			} 
			problems.add(tmp);
			
		}
		System.out.println("=============================");
		System.out.println("채점합니다. 맞은 개수 " + cnt + " ( " + (cnt * 100 / size) + " 점 )");
		System.out.println("::::::: 틀린 문제 정답 보기 :::::::");
		for(int i = 0; i < problems.size(); i++) {
			if(!problems.get(i).isCorrect()) {
				System.out.println("문제 " + (i + 1) + ". " + problems.get(i).problem() + problems.get(i).showAnswer());
			}
		}
	}

}
