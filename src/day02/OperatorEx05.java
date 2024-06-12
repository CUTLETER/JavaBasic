package day02;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		// 3항 연산식을 보기 전에, 프로그램에서 랜덤값을 만드는 법
		//*******************************************double d = Math.random(); // 실수 랜덤값을 뽑아줌
		//System.out.println(d); // 0 이상 ~ 1 '미만'의 랜덤 실수 랜덤값
		
		// int d = (int)(Math.random() * 10) +1; 연산자 우선적으로 괄호 쳐준 뒤에 캐스팅
		int d = (int)(Math.random() * 10) +1; // 1~10 랜덤한 수
		System.out.println("랜덤수 "+d);
		
		
		// 3항 연산식
		// 형식 -> 조건 ? 연산1 : 연산2
		//  d %2 == 0 ? "짝수" : "홀수"; 를 변수에다 저장한다면 아래처럼
		String result = d % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);
		// System.out.println( d %2 == 0 ? "짝수" : "홀수"); 이렇게 바로 출력문에다 넣어도 됨
		
	
	}
}
