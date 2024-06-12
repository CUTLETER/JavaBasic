package day01;

public class VariableScope {
	
	public static void main(String[] args) {
		
		int num = 100; // 선언 위치, main 안에서라면 다 쓸 수 있음
		System.out.println(num);
		
		int num2 = 200; // 이 중괄호 안에서 값을 사용 또는 변경하고, 중괄호 밖에서 사용하는 경우(1) - 선언을 가장 밖에다 할 것
		
		if(true) { // 범위
			int num1 = 10; // 선언 위치, if 안에서만 쓸 수 있음
			System.out.println(num1);
			// 변수의 범위는 중괄호 안에서만 유효함
		
			num2 = 20; // 이 중괄호 안에서 값을 사용 또는 변경하고, 중괄호 밖에서 사용하는 경우(2)
			
		}
		
		System.out.println(num2); // 이 중괄호 안에서 값을 사용 또는 변경하고, 중괄호 밖에서 사용하는 경우(3) = 중간에 바뀐 값으로 출력됨
	}

}
