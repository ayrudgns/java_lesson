package koreait.day11.test;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;



public class DateTimeTest {
	public static void main(String[] args) {
		// ����ð� : ms, ns (1970�� 1�� 1�� ������ �������� �������� ī��Ʈ�� ���̴�.)
		
		// 1��, 1���� ���� �� ms�ϱ��?	1�� = 1000ms (0.001�� = 1ms)
		// 1�� = 24�ð� * 60�� * 60�� * 1000 => result ������ �����ϱ�.
		int result = 24 * 60 * 60 * 1000;
		System.out.println("1���� " + result + " ms �Դϴ�.");
		System.out.println("1���� " + (result * 365L) + " ms �Դϴ�.");		// int�� ���� ������ �Ѿ ���� �ִ����θ� ��µ�.
		System.out.println();												// int ������ ����� overflow�̹Ƿ� long ��ȯ�� �ʿ��ϴ�.
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		System.out.println("1���� " + df.format(result) + " ms �Դϴ�.");
		System.out.println("1���� " + df.format(result * 365L) + " ms �Դϴ�.");	
		// String.format("%15s", ~)���� �ϸ� �ڸ� ���� ��ġ�� ���� �� �ִ�.
		System.out.println("1���� " + String.format("%15s", (df.format(result * 365L))) + " ms �Դϴ�.");	
		System.out.println();
		
		/*
		 *  ��¥�� �ð� ������ �ٷ�� �ڹ�Ŭ������ �����Ѵ�.
		 *  1) java.util.Date Ŭ����
		 *  2) java.util.Calendar Ŭ����		==> 1, 2�� ������ Ŭ���� (old)
		 *  3) java 8 ����  java.time.LocalDate(��¥), LocalTime(�ð�), LocalDateTime(��¥�� �ð�) Ŭ����
		 *  4) java.sql.Date Ŭ���� : �����ͺ��̽�(DB) �ٷ� �� ���
		 */
		
		// now() �޼ҵ�� ���� �ð� ��¥ ��ü ������.
		LocalDate currentDate = LocalDate.now();		// static �޼ҵ�� ��ü�� ������.
		System.out.println("��¥ Ȯ�� " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("�ð� Ȯ�� : " + currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("��¥�� �ð� Ȯ�� : " + current);

		// of() �޼ҵ�� Ư�� �ð� �� ��¥ ��ü ����
		LocalDate mybirth = LocalDate.of(1995, 8, 1);
		System.out.println("�� ź���� Ȯ�� : " + mybirth);
		
		LocalTime mybirth_time = LocalTime.of(8, 40);
		System.out.println("�� ź�� �ð� : " + mybirth_time);
		
		// �� ���� Ŭ������ ��¥ ������ ���� ��� Ŭ������ �ִ�. (���� �¾�� ���? ���? ��ĥ?)
		Period between = Period.between(mybirth, currentDate);
		System.out.println("���� �¾ �� " + between.getYears() + "��(years)");
		System.out.println(" " + between.getMonths() + "����(months)");
		System.out.println(" " + between.getDays() + "��(days)");
		
		System.out.println("���� �¾ �� " + ChronoUnit.DAYS.between(mybirth, currentDate) + "�� �������ϴ�.");
		
		
		// Duration Ŭ����
		// ChronoUnit Ŭ����
		
	}

}
