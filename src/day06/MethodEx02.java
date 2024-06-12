package day06;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 * 매개 변수(=Parameter) 
		 * 1. 매개 변수는 메소드 호출 시 전달하는 매개체다
		 * 2. 매개 변수를 받지 않으면 () 비워두면 되고 여러 개 받고 싶다면 , 로 연결하면 된다
		 * 
		 */
		int result = calSum(10); // () 안에는 메소드에 전달할 값 --->>> int end = 10;
		System.out.println("합 " + result);
		System.out.println("합 :" + calSum(100)); // 1부터 100까지의 합
		
		System.out.println("결과 : "+calSum2(1,3,"k"));
		System.out.println("결과 : "+calSum2(1,30,"k"));
	
	}
	
	// 어떤 값을 매개 변수로 받아서 매개 변수까지의 합계를 구하기
	static int calSum(int end) { // ()안에 데이터 타입까지 적어줘야 함
		int sum = 0;
		for (int i=1; i<=end; i++) {
			sum+=i;
		}
		
		return sum;
	}
	
	// 시작값, 끝값, 문자열을 전달 받아서, 문자열을 반복하여 반환하는(돌려주는) 메소드
	static String calSum2(int a, int b, String c) { // 문자열을 반복하여 반봔하니까 맨앞엔 String
						 //시작 값, 끝값,  문자열
		String str = "";
				//	 1	   3
		for (int i = a; i<=b; i++) {
			str+=c; // c = k
		}
		return str;
		}
	
	
	
	
	
	
	
	
}
