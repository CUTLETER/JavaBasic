package day01;

public class VariableEx {
	
	public static void main(String[] args) {
		
		// 변수는 선언과 초기화 과정을 거침
		
		// 데이터 타입과 이름을 선언함
		int num1; // int는 정수를 저장하는 대표적인 유형
		
		// 초기화도 필수, 10을 num1에다 저장한다
		num1 = 10;
		
		System.out.println(num1);
		
		int num2 = 20;
		System.out.println(num2);
		
		//int num2 = 30;
		// 변수는 같은 이름으로 선언할 수 없음
		
		// 변수의 값은 변경 가능
		System.out.println(num2); // = 20
		num2 = 30;
		System.out.println(num2); // 여기부터는 바뀐 값으로 출력됨
		
		// 변수에 다른 변수의 값을 저장할 수 있음
		int result = num1 + num2 + 10;
		System.out.println(result);
		
		// 변수는 데이터 타입이 다르면 바로 저장 불가
		// String str; 문자열
		
		
		
		
	}

}
