package day04;

import java.util.Scanner;

public class WhileEx04 {
	
	public static void main(String[] args) {
		
		// 테스트 케이스(반복 횟수) 5번 입력 받음
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); // 테스트 케이스, 반복 횟수를 결정할 입력창
		
		int i = 1;
		while (i <= num) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println("Case #" + i + ": " + (a+b));

			i++;
		}
		
		System.out.println("종료");
		
		scan.close();
	}
}
