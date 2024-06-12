package day04;

public class EnhancedForEx {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		for (int i=0; i<arr.length; i++) { // index는 항상 0부터 시작함, < 길이 미만
			System.out.println(arr[i]);
		}
		
		
		// 향상된 for문
		for(int v : arr) { // 무조건 : 들어감
			System.out.println(v); // 배열의 값을 순서대로 v에 담음, 위 for문과 결과는 같음
				}
		
		
		System.out.println("-------------");
		
		
		char[] arr2= {'A','B','C','D','E'};
 		for (char c : arr2) {
 			System.out.println(c);
 		}
		
 		System.out.println("-------------");
 		
 		int[] score = {33, 55, 43, 23, 43, 66};
 		// 향상된 for문을 이용하여 합계와 평균(소수점)을 출력할 것
		int sum = 0;
 		for (int a : score) {
 			sum+=a;
 		} System.out.println(sum);
 		  System.out.println((double)sum/score.length);
		
	}
}
