package day04;

public class ForEx01 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) { //제어 변수를 안에서 선언하기 때문에 다른 for문에서 i값 새로 선언 가능함, while은 밖에다 선언해서 불가능함
			
			System.out.println(i);
			
		}
		
	System.out.println("----------------------");
		
		for (int i = 10; i>=1; i--) {
			
			System.out.println(i);
		}
		
	}
}
