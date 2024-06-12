package day05;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		// 배열의 문법
		
		int[] arr; // 배열의 선언
		
		arr = new int[5]; // 배열의 생성
		
		arr[0] = 10; // 배열의 초기화
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50; // 마지막 인덱스는 항상 길이 -1
		
		System.out.println(arr); // 배열이 만들어진 위치, 주소값
		System.out.println(Arrays.toString(arr));
		
		// 배열의 길이
		System.out.println("배열의 길이 : "+arr.length);
		
		// 배열을 선언하는 다양한 방법
		int[] arr2 = new int[7]; // 초기화가 안 된 상태
		int[] arr3 = {1,2,3,4};
		int[] arr4 = new int[] {1,2,3,4,5,6};
		
		// 배열은 값을 지정하지 않으면 기본값으로 초기화
		// 기본값 : 정수는 0, 실수는 0.0, 논리는 false, 문자열은 null
		
		
		
		
		
	}
}
