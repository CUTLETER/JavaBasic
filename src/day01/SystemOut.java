package day01;

public class SystemOut {
	
	public static void main(String[] args) { // main 적고 컨트롤 + 스페이스 (기본 세팅)
	
	// 출력 형식 3가지
	// print () - 단축키가 없음, 자동 줄바꿈이 없어 가로로 출력할 때 사용함
	// println () - 단축키 있음, 자동 줄바꿈 있음
	// printf () - 출력 형식을 지정하고 값을 넣어주는 형식
		
		System.out.printf("배고픕니다\n");
		System.out.println("오늘은 5월 7일");
		System.out.printf("오늘은 %d월 %d일", 5, 7); // %d 는 정수 값이 들어갈 자리를 만들어둠
	
	// 서식 문자 %d - 정수 , %f - 실수, %s - 문자열
		System.out.printf("\n%s님의 생일은 %d월 %d일입니다.", "이수진", 5, 23);
		System.out.printf("\n원주율은 %.1f입니다.", 3.14); // 실수 서식문자는 출력 시 자릿수 조정 가능함 (기본적으로 6자리까지 보여짐)
		
	}
	
}
