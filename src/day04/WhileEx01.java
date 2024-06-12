package day04;

public class WhileEx01 {

	public static void main(String[] args) {
		
		
		int a = 1; // 반복문의 횟수를 제어할 변수 -> 제어 변수
		int sum = 0; // 어떤 값을 누적시킬 변수
		
		while (a<=10) {
			
			sum += a; // sum = sum + a; 1부터 10까지 누적 값 (많이 쓰는 표현)
		
			a++; // 제어 변수를 1씩 증가시켜서 조건에 맞지 않는 false가 되게끔 장치함, 없으면 무한 루프
		} 
		
		System.out.println("반복문 종료");
		System.out.println("sum 값 "+sum);
		
		/*
		 * int sum = 0;
		 * sum = sum + 1;
		 * sum = sum + 2;
		 * sum = sum + 3;
		 * sum = sum + ..10;
		 * sum +=a -> sum = sum + a;
		 *  
		 */
		
		
	}
}
