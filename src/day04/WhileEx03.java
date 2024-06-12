package day04;

import java.util.Arrays;

public class WhileEx03 {
	
	public static void main(String[] args) {
		
		/* 배열의 반복
		int[] arr = {1,2,3,4,5,6,7,8,9}; // 0부터 차례대로 붙는 인덱스 번호는 항상 length '미만', length -1
		
		int i = 0;
		int sum = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			sum += arr[i];
			i++;
		}
		System.out.println("배열의 합 "+sum);
		 */
		
		// 배열에 순서대로 저장하기
		int[] arr = new int[10];
		
		int j = 0;
		while (j < arr.length) {
			arr[j] = j+1;
					
			j++;
		} System.out.println(Arrays.toString(arr));
	}
}
