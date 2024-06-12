package day04;

public class WhileEx02 {

	public static void main(String[] args) {
		
		// 어떤 수 x까지의 짝수들의 합
		// 예를 들어 어떤 수가 10 이면 2+4+6+8+10의 값 구하기
		
		int i = 1;
		int sum = 0;
		while (i<=10) {
			
			if (i % 2 == 0) {
				System.out.println(i);
				sum +=i;
			}
			
			i++;
		} System.out.println("합계 "+sum);
		
		
		
		
		
	}
}
