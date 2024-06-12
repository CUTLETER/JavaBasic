package day05;

import java.util.Arrays;

public class ArrayInsert2 {
	
	public static void main(String[] args) {
		
		// 배열의 중간에 값을 추가하기
		// 1. 배열의 크기 +1 생성하기
		// 2. 배열을 옮겨 담기										10, 20, 30, 40, 50, 0 을
		// 3. 새로운 배열의 마지막 인덱스부터 타겟 인덱스까지의 값을 옮기기 ->  10, 20, 30, 30, 40, 50로 옮긴다는 말 -> newArr[i] = newArr[i-1]
		// 4. targetIndex에 data를 추가하기
		
		int[] arr= {10,20,30,40,50};
		// targetIndex번째에 data를 추가할 예정
		int targetIndex = 2;
		int data = 100;
		
		// 1.
		int[] newArr = new int[arr.length+1];
		// 2.
		for (int i=0; i<arr.length; i++) {   
			newArr[i] = arr[i];
		} 
		System.out.println(Arrays.toString(newArr));
		
		// 3. 
		for(int i=newArr.length-1; i>targetIndex; i--) {
			System.out.println(i);
			
			newArr[i] = newArr[i-1]; // 5번째에다가는 4번째 값을, 4번째에다간 3번째 값을.. targetIndex 직전까지
			
		} System.out.println(Arrays.toString(newArr));
		
		// 4.
		newArr[targetIndex] = data;
		System.out.println(Arrays.toString(newArr));
		
		
		
		
		
		
		
		
		
	}
}
