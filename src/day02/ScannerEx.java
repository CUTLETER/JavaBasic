package day02;

import java.util.Scanner; //(빨간 줄 뜨면 컨트롤+스페이스 눌러서 선언할 것(2))

public class ScannerEx {
	
	public static void main(String[] args) {
		
		
		// 1. 먼저 스캐너를 생성함
		Scanner scan = new Scanner(System.in); //(빨간 줄 뜨면 컨트롤+스페이스 눌러서 선언할 것(1))
		
		
		// 2. 스캐너가 가지고 있는 기능을 활용해서 데이터를 입력받음
		System.out.print("너 이름이 뭐야? >");
		String name = scan.next(); // next() - 공백을 '제외'한, 공백의 앞까지 문자열을 입력 받음
		
		
		System.out.print("너는 나이가 몇이야? >");
		int age = scan.nextInt(); // 정수를 입력 받음		
		
		System.out.print("키는 어떻게 돼? >");
		double cm = scan.nextDouble(); // 실수를 입력 받음
		
		
		System.out.print("자기 소개 >");
		scan.nextLine(); //위에서 (실수만 취하고 남은) 엔터값이 있어 바로 넘어가기 때문에 엔터값을 소모시켜주는 메소드를 씀
		String intro = scan.nextLine(); // 공백 '포함'한 문자열을 \n까지 입력 받음
		//nextLine과 다른 입력 구문을 사용하면, 입력이 무시되고 넘어가는 경우가 있음
		
		
		System.out.println("너의 이름은..  " + name + ", 나이는 " + age + "살");
		System.out.println("키는 " + cm + "cm");
		System.out.println("자기 소개 " + intro);
		
		// 3. 스캐너 종료
		scan.close();
		
		
		
		
	}

}
