package day04;

import java.util.Scanner;

public class ForEx02 {
	
	public static void main(String[] args) {
		
		/*
		 *소수 판별하기 
		 *소수 : 약수가 1과 자기 자신인 수
		 *2,3,5,7 등
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 >");
		int num = scan.nextInt();
		int cnt = 0;
		for (int i=1; i<=num; i++) {
			
			if(num %i ==0) { //i는 num의 약수
				cnt++;
			}
		} if (cnt==2) { //num을 i로 한바퀴 돌려서 카운트된 횟수가 2면 소수
			System.out.println(num+"는 소수");
		} else {
			System.out.println(num+"는 소수 아님");
		}
	
	
	}
}
