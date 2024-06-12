package day05;

import java.util.Arrays;

public class ArrayMatrix {

	public static void main(String[] args) {
		
		// 다차원 배열 - 매트릭스
		// 배열 안에 배열이 저장되는 형태
		// int[][] arr; 2차원 배열 [[], [], [], [], []]
 		
		int[] kor = {10,20,30};
		int[] math = {40,50,60};
		int[] eng = {70,80,90};
 		
		int[][] arr = {kor,math,eng}; // arr[0]=kor, arr[1]=math, arr[2]=eng
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		// 2차원 배열의 사용 -> arr[행][열]
		System.out.println(arr[0][0]);
		arr[0][0] = 100;
		System.out.println(arr[0][0]);
		
		// 2차원 배열을 한 번에 생성, 초기화하기
		int[][] arr2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		// 2차원 배열의 크기만 지정하는 방법
		int[][] arr3 = new int[3][4]; // 3행 4열짜리 배열이 생성됨
		
		// 2차원 배열의 모형을 한눈에 보는 방법
		System.out.println(Arrays.deepToString(arr3));
		
		// 2차원 배열의 순회
		int x = 1;
		for (int i = 0; i<arr3.length; i++) { // 바깥에 있는 반복문은 행
			
			for(int j=0; j<arr3[i].length; j++) { // 열에 있는 배열의 length
				arr3[i][j] = x++;
			}
			
		} System.out.println(Arrays.deepToString(arr3));
		
		
		
		
		
		
		
		
		
		
	}

}
