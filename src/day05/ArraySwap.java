package day05;

import java.util.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
		
		/*
		int x = 5;
		int y = 10;
		int temp = 0; // 값을 임시 저장함
		
		temp = x;
		x = y;
		y = temp;
		*/
		
		// 랜덤한 두 수를 이용해서 배열의 자리를 바꾸기
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int a= (int)(Math.random()*10); // 0-9
		int b= (int)(Math.random()*10); // 0-9
		
		System.out.println("바꿀 인덱스 : "+a+" "+b);
		
		int temp  = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
}
