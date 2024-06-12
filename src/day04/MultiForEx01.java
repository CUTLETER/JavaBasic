package day04;

import java.util.Scanner;

public class MultiForEx01 { // 중첩 반복문

	public static void main(String[] args) {
		
		/* 예시
		for(int i=1; i<=10; i++) {
		
			for (int j=1; j<=9; j++) {
				System.out.println(i+" - "+j);
			}	
		}
		*/
		
		// 모든 구구단
		int x = 0;
		for (int i=2; i<=9; i++) {
			
			System.out.println("구구단 : "+i+"단"); // i가 돌기 전에 실행되는 코드
			for (int j=1; j<=9; j++) {
				x = i*j;
				System.out.println(i+" x "+j+" = "+x);	
			} System.out.println("---------------"); // j가 돌고 나서 실행되는 코드
		}
		
		
		
	}
}
