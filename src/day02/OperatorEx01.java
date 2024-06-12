package day02;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		// <단항 연산자> - 항이 하나인 것
		
		// 부호 연산자 +,-
		int i = 3;
		int j = -i;
		
		// 증감 연산자 ++, --
		int k = 1;
		int h = k++;
		System.out.println("k값은 " + k);
		System.out.println("h값은 " + h);
		// h 값은 1 왜?
		// -> ++가 뒤에 붙으면 후위 연산, 먼저 값이 대입되고 그 다음에 증가되기 때문에
		
		int x = 1;
		int y = ++x;
		System.out.println("x값은 " +x);
		System.out.println("y값은 " +y);
		// ++가 앞에 붙으면 전위 연산, 먼저 값이 증가되고 그 다음에 대입이 됨
		
		x = 1;
		x++;
		++x;
		System.out.println(x);
		
		System.out.println("------------");
		
		// 비트 연산자 ~
		byte b = 10; // 10을 2진수로 표현하면 0000 1010
		System.out.println(~b); // -> 1111 0101,  0과 1값이 반전됨 
		System.out.println(~b + 1); // -> 1을 더해서 1111 0110
		
		System.out.println("------------");
		
		// 논리 반전 연산자 ! , 조건식을 세울 때 사용됨
		System.out.println(true);
		System.out.println(!true);
		System.out.println(false);
		System.out.println(!false);
		
		boolean boo1 = !true;
		System.out.println(boo1);
		
		
		
		
		
		
		
		
	}
}
