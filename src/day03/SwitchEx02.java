package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		//점수를 입력 받아서 점수에 따른 학점을 부여할 것
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력 >");
		int point = scan.nextInt();
		
		
		
		switch (point / 10) { // 소괄호 안에 연산식을 넣을 수도 있음
		
		case 10:
		case 9: // case 안에 if문 삽입 가능
			
			if (point >=95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
			
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;	
		case 6:
			System.out.println("D");
			break;	
			
		default:
			System.out.println("F");
			break;
		}
		
		scan.close();
		
		
		
	}
	
	
}

