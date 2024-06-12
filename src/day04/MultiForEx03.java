package day04;

public class MultiForEx03 {

	public static void main(String[] args) {
		
		int star = 8;
		for (int i=1; i<=star; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			} 
			
			System.out.println();
		
		}
		
		System.out.println("-------반대------");
		
		for (int i=1; i<=star; i++) {
			
			for (int j=1; j<=(star+1)-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("--------다른 방법------");
		 
		for (int i=1; i<=star; i++) {
			
			for (int j = 5; j>=1; j--) { // int j = (star+1)-i 로 하면 위와 같은 출력
				
				System.out.print("*");
				
			}  System.out.println("");
			
		}
		
		
		
		System.out.println("------------------");
		
		// 바깥 반복문 - 행
		// 내부 반복문 - 출력
		
		//////////////////////////// 아래 선생님 답
		for (int i=1; i<=star; i++) {
			
			for (int j=1; j<star-i; j++) { // 공백 출력문
				System.out.print(" ");	
			} for (int j=1; j<=i; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		
		System.out.println("------------------");
		
		
		
		
    	String s = "*";
    	String str = "";
    	for (int i=1; i<=star; i++) {
    		
    		for (int ii=0; ii<star-i; ii++) {
    			System.out.print(" ");
    		}

    		str+=s;
    		System.out.println(str);
		
		
    	}
    	
    	
    	
    	
    	System.out.println("-------------------");
    	
    	
    	for (int i=0; i<=star; i++) {
    		
    		for (int j=0; j<i; j++) {
    			System.out.print(" ");
    		}
    		for (int k=0; k<2*(star-i)-1; k++) {
    			System.out.print("*");
    		} System.out.println();		
    	}
   
    	
    	System.out.println("-------------------");
    	
    	
    	
    	//////////////////////// 아래 선생님 답
    	
    	for (int i=1; i<=star; i++) {
    		for (int j=1; j<=star-i; j++) { // 공백 찍음 43210
    			System.out.print(" ");
    		}
    									   // i 12345 일때	  
    		for (int j=1; j<=i*2-1; j++) { // j 13579 찍음
    			
    			System.out.print("*");
    		}
    		
    		System.out.println();
    	} 
    	
    	
    	
    	
    	
    

    	
    	
    	
    	
    	
	}
}
