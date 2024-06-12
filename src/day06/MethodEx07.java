package day06;

public class MethodEx07 {
		
	public static void main(String[] args) {
		
		// 메소드 안에서 메소드 호출하기
		method01(); //메소드는 동기적인(순서대로) 호출됨
		
		//재귀적인 호출 - 메소드 안에서 자신을 호출시킴 (a 메소드 안에서 a 호출)
		recursive(1);
		
		System.out.println(factorial(5)); 
		
	}
	
	static void method01() {
		System.out.println("method1 start");
		method02(); // 2번 메소드 호출
		System.out.println("method1 end");
	}
	
	
	
	
	static void method02() {
		System.out.println("method2 start");
		
		System.out.println("method2 end");
	}
	
	
	static void recursive(int a) {
		
		// 재귀를 탈출할 조건이 반드시 필요함 - 아니면 끝없이 돌아감
		if (a == 10) {
			return; // 함수 종료
		}
		
		System.out.println(a+" 호출");
		a++;
		
		recursive(a);
	}
	
	
	static int factorial(int a) {
		if (a == 1) {
			return 1;
		}
					// 4x3x2x1
		return a * factorial(a-1); // fac5-5, fac4-4,..., fac1-return1 -> return1 값이 fac2로 반환돼서 1로, fac3으로 반환돼서 2x1, fac4 - 3x2x1, fac5 - 4x3x2x1 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


