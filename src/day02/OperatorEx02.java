package day02;

public class OperatorEx02 {
	
	public static void main(String[] args) {
		
		// <2항 연산자>
		
		// 산술 연산자 + - * / %
		int i = 7 / 3; // 몫
		int j = 7 % 3; // 나머지
		int k = 7 * 3;
		System.out.println("i값은 "+ i);
		System.out.println("j값은 "+ j);
		System.out.println("k값은 "+ k);
		
		
		// 비교 연산자 <, <=, >, =>, ==, !=
		System.out.println(i==j);
		System.out.println(i!=j);
		System.out.println(i>=j);
		System.out.println(i<=j);
		System.out.println(i<j);
		System.out.println(k % 2 == 0); //이게 만약 true 라면 짝수
		System.out.println(k % 2 != 0); //이게 만약 true 라면 홀수
		System.out.println(k % 5 == 0); //이게 만약 true 라면 5의 배수
		
		System.out.println("-------------");
		
		
		// 비트 연산자
		int a = 5; // 0000 0101
		int b = 3; // 0000 0011
		System.out.println(a & b); // 0000 0001
		System.out.println(a | b); // 0000 0111
		System.out.println(a ^ b); // 0000 0110
		
		// 비트 이동 연산자 >> <<
		int num = 192; //1100 0000
		System.out.println(num >>2); //0011 0000
		System.out.println(num <<2); // 0011 0000 0000
		
		
		
	}

}
