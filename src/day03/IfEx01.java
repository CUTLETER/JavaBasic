package day03;

public class IfEx01 {

	public static void main(String[] args) {
		
		int point = (int)(Math.random()*101); // 0-100까지
		System.out.println("랜덤 값 " + point);
		
		
		
		
		String grade;
		
		if (point>=60) {
			System.out.println("합격");
			grade = "P";
			
		} else {
			System.out.println("불합격");
			grade = "F";
		}
		System.out.println(grade);
		
		
		
		
		
		
		
		
		
	}
}
