package day04;

public class BreakEx01 {

	public static void main(String[] args) {
		
	
	/*
	 * 무한 반복문
	 * 반복문의 횟수를 정확히 모를 때 주로 사용하고
	 * while(true) 문장을 많이 사용함
	 * 항상 조건과 같이 씀
	 */
	int i = 1;
	while(true) {
		
		if(i==15) {
			break;  // 15를 만나자마자 가장 가까운 반복문 하나를 빠져나옴, 그 아래 출력문을 못 만나서 14까지 출력됨
		}
		
		System.out.println(i);
		i++;
	}
	
	}
} 
