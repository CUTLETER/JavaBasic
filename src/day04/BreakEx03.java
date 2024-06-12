package day04;

public class BreakEx03 {

	public static void main(String[] args) {
		
		/*
		 * 중첩 반복에서 break 
		 */
		
		
		/*   1. 탈출을 위한 변수를 활용한다
		boolean bool = false;
		
		for (char c='A'; c<='Z'; c++) {
			
			for (char l = 'a'; l<='z'; l++) {
				
				System.out.println(c + "-" + l);
				
				if (l=='e') {
					bool = true; // if문을 실행했음을 나타냄
					break; // l 값이 e가 되면 l값은 e에서 탈출하고 c값이 ++ 되면 다시 l은 a부터 들어와서 e에서 탈출을 반복함
				}
			}
			
			//위에 break는 여기로 빠져나옴
			if (bool) { // boolean 값이 true면 완전히 탈출시킴
				break;
			}
			
		}
		*/
		
		
		
		// 2. 이름 붙이기
		// 중첩 반복문에서 바깥 반복문을 완전히 탈출하려면, 탈출할 반복문에 이름을 붙여주고 break 뒤에 붙이기
		name : for (char c='A'; c<='Z'; c++) {
			
			for (char l = 'a'; l<='z'; l++) {
				
				System.out.println(c+ "-" +l);
				
				if (l == 'e') {
					break name; // 탈출할 반복문의 이름 넣어주기
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
