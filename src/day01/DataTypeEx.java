package day01;

public class DataTypeEx {

	public static void main(String[] args) {
		
		// 정수형 타입
		byte a = 127; // -128~127까지 저장됨
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647;
		int c1 =  -2147483648;
		
		long d = 3432423425455555566L; // L 붙여야 함
		
		
		/* 2진수 0b
		8진수 0
		16진수 0x도 저장됨
		*/
		int bin = 0b1010; // 2진수 1010 가리킴
		System.out.println("2진수 1010은 " +bin+ "입니다.");
		
		System.out.println("------------------");
		
		// 실수형 타입
		float f1 = 3.14F; // F 붙여야 함
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.141592653F; // 7자리까지만 저장함
		double d2 = 3.141592653; // 15자리까지 저장함
		System.out.println(f2);
		System.out.println(d2);
		
		// e 표기법 - 나타낼 수 있는 소수잠 자리가 너무 크거나 작은 경우에 컴퓨터가 알아서 써줌
		float f3 = 314.15e-2F; // e-2 왼쪽으로 2칸 점프
		System.out.println(f3);
		float f4 = 0.5465121e2F; // e2 오른쪽으로 2칸 점프
		System.out.println(f4); 
		
		System.out.println("---------------");
		
		boolean boo1 = true;
		boolean boo2 = false;
		System.out.println(boo1);
		System.out.println(boo2);

	
	}
	
}
