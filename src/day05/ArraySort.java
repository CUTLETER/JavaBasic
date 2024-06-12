package day05;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		// 배열의 정렬
		// 정렬 방식 9-10개 있음
		// 선택정렬, (버블정렬 <-좀 느림)
		 int[] arr = {5, 23, 1, 43, 200, 100, 40};
		 /*
		  * 1회전
		  * 1,23,5,43,200,100,40 (5보다 작은 1이랑만 자리를 바꿈)
		  * 2회전
		  * 1, 5, 23, 43, 200, 100, 40
		  * 3회전
		  * 1, 5, 23, 43, 200, 100, 40
		  * 4회전
		  * 1, 5, 23, 40, 200, 100, 43 
		  * 5회전
		  * 1, 5, 23, 40 , 43, 200, 100
		  * 마지막
		  *  1, 5, 23, 40, 43, 100, 200
		  * 오름차순으로 정렬 1->200
		 */
		 
		 // 바깥 반복문 - 회전수
		 // 안쪽 반복문 - 자리바꿈
		 for (int i=0; i<arr.length-1; i++) { // 배열 끝까지 돌 필요 없음(5까지 돌면 됨), 끝에서 두번째 값인 5가 마지막 값 6이랑 비교할 테니까 굳이?
			 for (int j=i+1; j<arr.length; j++) { // 얘는 마지막까지 돌아야 함 (6까지 돌아야 함) 그래야 비교 가능해짐
				 System.out.println(i+" "+j);
				 if(arr[i] > arr[j]) { // i는 대상, j는 비교대상 // 앞에 꺼가 크면 자리 바꾸는 조건문, (<)로 바꾸면 내림차순 됨
					 int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			 }
			 
			 System.out.println(Arrays.toString(arr)); // 중간 확인용
		 }
		 
 		System.out.println(Arrays.toString(arr));
		
		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}
}
