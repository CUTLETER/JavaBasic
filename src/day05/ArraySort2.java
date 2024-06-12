package day05;

import java.util.Arrays;

public class ArraySort2 {
	
	public static void main(String[] args) {
		
		// 버블정렬 - 가장 느린 정렬 방식, 바로 옆에 있는 값과 비교함
		// 가장 큰 수를 뒤로 보냄 
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		/*
		 * 1회전 결과
		 * 5, 1, 23, 43, 100, 40, 200
		 * 2회전 (200은 빼고 100까지 비교)
		 * 1, 5, 23, 43, 40, 100, 200
		 * 3회전 (100은 빼고 43까지 비교)
		 * 1, 5, 23, 40, 43, 100, 200
		 * 
		 */
		 
		// 바깥 반복문이 회전수 (선택정렬과 동일함)
		// 안쪽 반복문이 자리 변경
		
		for (int i = 0; i<arr.length-1; i++) {
			
			for(int j = 0; j<arr.length-1-i; j++) { // i=0일 때 j=5(첫번째 회전), i=1일 때 j=4, ... 반복
				
				System.out.println(i+" "+j);
				
				if (arr[j] > arr[j+1]) { // 앞에 꺼가 크면 자리 바꾸는 조건문, (<)로 바꾸면 내림차순 됨
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 	// 결과적으로는 가장 큰 녀석이 뒤로 감
					
					
					
				}
				
			}
			
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		// 가장 빠른 정렬 - 퀵 정렬
		Arrays.sort(arr); // 오름차순
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
