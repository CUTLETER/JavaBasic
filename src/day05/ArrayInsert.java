package day05;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		
		// 배열은 크기가 고정이라 값을 삭제,추가할 순 없음 (변경만 가능)
		// 다만 아래 방법처럼 하면 가능은 해짐
		// 1. 원본 배열의 +1 크기의 새로운 배열을 만든다
		// 2. 값을 옮긴다
		// 3. 마지막에 값을 하나 추가한다
		// 4. 원본 배열의 주소값을 새로운 배열로 바꾼다
		
		int[] arr = {10,20,30,40,50}; // 여기다가 60을 넣어볼 예정
		int data = 60;
		
		// 1.
		int[] newArr = new int[arr.length+1];
		
		// 2.
		for (int i=0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		// 3.
		newArr[newArr.length-1] = data;
		System.out.println(Arrays.toString(newArr));
		
		// 4.
		arr = newArr; // arr이 newArr로 바뀜
		System.out.println(newArr == arr); 
		
		// 5. 
		newArr = null; // newArr 삭제 처리 작업
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
