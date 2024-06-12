package day04;

import java.util.Scanner;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			
			/*
			if (i==5) {
				continue; // 5가 되면 아래 출력문으로 가지 않고(=건너뛰고) 다음 반복문 (i++)으로 진행함, 그래서 5가 결과에서 빠짐
			}*/
			
			if (i%2==0) {
				continue; // 짝수일 때만 출력하지 않고 건너뛰며 i값부터 증가
			}
			
			System.out.println(i);

		}
		
											System.out.println("----------------------");
		
		
											
		int i = 1;
		while (i<=10) {
			
			if (i==5) {
				i++; // 그래서 여기다가도 써야 함 (2)
				continue; // while문은 i++가 맨아래에 있어서 출력문과 함께 그마저도 건너뜀, 1-4 무한반복 (1)
			}
			
			System.out.println(i);
			
			i++;
			
		}
		
		
							System.out.println("-----------------------------");

		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(); // 5

		int sum = 0;

		name : for (int k=1; k<=x; k++) { 

			int cnt=0;

			for (int j=1; j<=k; j++) { 

				if (k%j==0) {

					cnt++;}

			} 	
			
			if (cnt > 2) { // 약수가 최소 3개 이상이면 더이상 반복문을 돌릴 필요가 없어지므로
				continue name; // 이렇게 하면 속도가 좀 더 빨라짐
			}
			
			
			
			if (cnt==2) { 
				
					sum+=k; 
			}
			
	} System.out.println(sum);
										
										
		
		
		
		
		
		
		
	}
}
