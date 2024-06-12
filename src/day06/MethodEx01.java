package day06;

public class MethodEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메소드는 다른 메소드 안에 선언할 수 없음
		 * 매일 만들었던 main은 사실 메소드
		 * 근본적으로는 main 위에 선언해야 하지만 자바는 상관 없음
		 * main 밖, class 안 어디서든 선언 가능함
		 */

		// 함수의 호출 (1)
		int result = calSum(); // (3) return에 저장된 sum 값이 여기로 들어옴, 이걸 왼쪽 result에 저장시킴
		System.out.println("합 : "+result);
		int result2 = calSum();
		System.out.println("합 : "+result2); // 재활용 가능함
		
		String result3 = randomStr();
		System.out.println("결과 : "+result3);
		
		// 사실 return이 있는 함수는 출력문 안에서 바로 호출이 됨
		System.out.println("결과 : "+randomStr());
		
		
		
	}
	
	// 반환 유형 (type) - method (name) - ()
	static int calSum() { // static 은 함수 앞에 무조건 붙여야 함, 이유는 나중에
		
		System.out.println("calSum 호출");
		
		// 1-10까지의 합계
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum+=i;
		}
		
		return sum; // (2) return에 값이 걸려 있으면 함수를 '호출'한 자리로 돌아가게 돼 있음  ------>>>>> calSum(); 여기로
		 
	}
	
	static String randomStr( ) { 
		String str = "";
		
		for (char c='A'; c<='Z'; c++) {
			str += c;
		}
		return str;
	}
	
	
	
	/* 함수 잘 모르겠으면 아래 뼈대부터 만들고 보기
	 * 	static String randomStr( ) { 
		String str = "";
		
		
		return str;
	}
	
	 */
	
	
	
	
	
	
	
	
}
