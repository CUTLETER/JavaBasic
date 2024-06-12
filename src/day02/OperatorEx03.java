package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		
		// 논리 연산자 & | && ||
		int x = 10;
		int y = 20;
		
		// if 소괄호가 true라면 if구문이 실행되고 false라면 else구문이 실행됨
		if ( x != 10 & ++y == 21 ) {
			System.out.println("참");
			
		} else {
			System.out.println("거짓");
		}
		
		System.out.println("x값은 "+x);
		System.out.println("y값은 "+y);
		
		
		
		
		
		if ( x != 10 && ++y == 21 ) { 
			System.out.println("참");
			
		} else {
			System.out.println("거짓");
		}
		
		System.out.println("x값은 "+x);
		System.out.println("y값은 "+y); // && 절대 true가 나올 수 없는 경우에 뒤(++y == 21)를 실행하지 않아서 그대로 21
		
		
		
		
		
		if ( x == 10 | ++y == 21 ) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		System.out.println("x값은 "+x);
		System.out.println("y값은 "+y);
		
		
		
		
		
		if ( x == 10 || ++y == 21 ) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		System.out.println("x값은 "+x);
		System.out.println("y값은 "+y);  // || 절대 false가 나올 수 없는 경우에 뒤(++y)를 실행하지 않아서 그대로 22
		
		
		
		
		
	}
}
