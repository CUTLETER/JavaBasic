package day06;

public class MethodEx03 {

	public static void main(String[] args) { // main은 반환값이 없고 매개변수가 배열임
		
		
		/*
		 *  반환 유형 (return type)
		 * 1. 반환유형은 메소드가 돌려주는 값에 대한 타입 (자바의 특징)
		 * 2. 반환유형이 있는 메소드는 호출문이 값이 되기 때문에 println() 구문 안에서 출력이 가능해짐
		 * 
		 * 3. 반환이 없는 경우에는 반환 유형 자리에 void라고 적음
		 */
		
		add(1,2); // return으로 3이 되어 돌아옴
		System.out.println(add(1,2));
		add(add(1,2), add(3,4)); // 중첩 가능함 (=10)
		System.out.println(add(add(1,2), add(3,4)));
		
		// System.out.println(sub(5,3));  ---->>> void형은 돌아오는 return값이 없어서 이렇게 못 씀, int result = sub(5,3); 이렇게도 못 씀
		sub(5,3); // 반환이 없는 메소드는 단순히 '호출만' 가능함
		
		confirm(-100);
	}
	
	
	
	
	
	
	// 매개변수 2개 받아서 두 매개변수의 합을 리턴하는 메소드 만들기
	static int add(int a, int b) {
		return a+b;
	}
	
	// 반환유형이 없는 메소드
	static void sub(int a,int b) {
		System.out.println("a-b = "+(a-b));
		return; // void형에서의 return은 단순히 메소드의 종료를 의미함
	}
	
	// 이 매개변수는 반드시 양수여야 한다
	static void confirm(int num) {
		if (num<0) {
			System.out.println("0보다 큰 값을 입력하시오");
			return; // 함수의 종료, return문 아래에는 프로그램 코드를 적을 수 없음
		}
		System.out.println("전달받은 매개변수 : " +num);
	}
	
	
	
	
	
	
	
	
}
