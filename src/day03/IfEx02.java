package day03;

import java.util.Scanner;

public class IfEx02 {
	

	public static void main(String[] args) {
		
		
		// 점수를 입력 받아서 점수에 따른 학점을 부여할 것
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 >");
		int point = scan.nextInt();
		
		if (point >=90) {
				//System.out.println("A");
				if (point >=95) {
					System.out.println("A+");
				} else {
					System.out.println("A");
				}
			}
		else if (point >=80) {
			System.out.println("B");
		} else if (point >=70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		//이 네 가지 중에서 하나는 반드시 실행됨
		//조건 순서를 잘 짜야 함
		
		scan.close();
		} }
		
	