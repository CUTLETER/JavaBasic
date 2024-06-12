package day01;

public class CastingEx03 {

	public static void main(String[] args) {
		
		// 연산에서의 형 변환
		char c = 'A';
		int i = 2;
		System.out.println(c + i);
		char cc = (char)(c + i); // c + i 를 먼저 하고 그 값을 char로 형 변환
		System.out.println(cc);
		
		// 연산에서의 형 변환
		// ***int 보다 작은 타입들은 무조건 int 로 나옴 
		// **byte + byte = int (byte를 int크기로 늘려서 자릿수 맞춘 다음 연산함)
		// byte + short = int
		// byte + int = int
		// char + int = int
		
		
		
		// ***반면에 int 보다 큰 타입들은 그 큰 타입들을 따라감
		int k = 3;
		double d = 3.14;
		System.out.println(k + d);
		
		
		
		
	}
}
