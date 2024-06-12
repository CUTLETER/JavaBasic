package day04;

import java.util.Scanner;

public class MultiForEx02 {

	public static void main(String[] args) {
		
		/* 사각형 출력하기
		* 가로 5, 세로 4
		* 
		* 출력
		* *****
		* *****
		* *****
		* *****
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("가로 >");
		int a = scan.nextInt();
		System.out.print("세로 >");
		int b = scan.nextInt();
		
		for (int i=1; i<=b; i++) {
			
			for (int j=1; j<=a; j++) {
				System.out.print("*");
			} System.out.println(); // 줄바꿈
			
		}
		
		
		
		
		
		
	}
}
