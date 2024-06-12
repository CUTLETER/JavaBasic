package day01;

public class CastingEx01 {

	public static void main(String[] args) {
		
		
		// 크기가 작은 타입을 큰 타입에 넣을 때면 자바 가상머신이 자동으로 형 변환을 해줌
		
		byte b = 10;
		
		short s = b; // byte가 short형으로 자동 형 변환됨
		
		int i = b; // byte가 int형으로 자동 형 변환됨
		
		long l = b; // byte가 long형으로 자동 형 변환됨
		
		
		char c = '가'; // 2 byte
		int j = c; // char -> int
		
		System.out.println(j);
		
		int k = 1000;
		double d = k;
		System.out.println(d);
	
		
	}
}
