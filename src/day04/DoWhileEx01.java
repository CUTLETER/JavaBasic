package day04;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		
		int i = 1;
		int sum = 0;
		do {
			
			System.out.println(i);
			sum += i;
			
			i++;
		} while (i <= 10); // 조건이 거짓이어도 처음 1번은 무조건 실행됨
		
		System.out.println("합계 "+sum);
		
		// do ~while문은 첫번째 회전은 반드시 하게 되고, 그 이후부터는 while문과 동일함
		
		
		
	}
}
