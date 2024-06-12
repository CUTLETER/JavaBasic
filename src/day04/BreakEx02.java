package day04;

import java.util.Scanner;

public class BreakEx02 {
	
	public static void main(String[] args) {
		
		// 특정 조건까지 무한 입력할 것
		
		Scanner scan = new Scanner(System.in); 
		
		while(true) {
			System.out.println("5 x 3 = ?");
			System.out.print(">");
			int num = scan.nextInt();
			
			if (num == 5*3) {
				System.out.println("정답");
				break;
			} // 여기다 break; 적으면 가장 가까운 while 반복문을 탈출함
			else {
				System.out.println("푸풉");
			}
			
			
			// 입력받은 값이 조건에 만족하면 탈출
		}
		
		
		
		
	}
}
