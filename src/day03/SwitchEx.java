package day03;

public class SwitchEx {

	public static void main(String[] args) {
		
		//switch에 들어가는 값은 정수 or 문자 or 문자열
		int a = 4; // 
		
		switch (a) {
		
		case 0: // 비워두면 1과 같은 실행문으로
		case 1: // case 이름도 데이터 타입에 맞게 적기
			System.out.println("1");
			break; //switch문에서 탈출시킴
		case 2: // int 값에다 2를 넣으면 바로 여기서 시작됨
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
			
		default :
			System.out.println("어디에도 해당되지 않습니다.");
			// int값이 case 개수를 초과할 경우 실행함
		
		}
	}
}
