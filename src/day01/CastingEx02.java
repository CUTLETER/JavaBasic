package day01;

public class CastingEx02 {

	public static void main(String[] args) {
		
		// 이번에는 큰 녀석을 작은 녀석에게 대입해봄 (캐스팅 연습)
		
		int i = 70;
		char c = (char)i; // 캐스팅 하려면 (타입) 쓰기
		System.out.println(c);
		byte b = (byte)i;
		System.out.println(b);
		
		double d = 3.14;
		int j = (int)d;
		System.out.println(j);
		
		int k = 1000;
		byte b2 = (byte)k; // (byte의 한계치인 8자리만 잘라서 담음)
		System.out.println(b2);
		
		
		// *예외적으로 형 변환을 해야 하는 경우
		// char(문자) -> short(숫자), 같은 크기임에도 데이터 타입이 다르기에
		char cc = 'A';
		short ss = (short)cc;
		System.out.println(ss);
		
		
	}
}
