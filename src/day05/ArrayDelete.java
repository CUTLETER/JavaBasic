package day05;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		// 배열의 삭제 - 사실 배열은 삭제가 없다, 삭제된 것처럼 보이기 위함
		
		// arr[5] = 0; 이렇게 하면 배열에 구멍이 남
		// 7,8,9,10을 한칸씩 왼쪽으로 옮기면 됨
		// 맨뒤 제외하고 새 배열에 옮기면 됨
		
		// 1. 삭제할 위치의 다음 값들을 하나씩 당겨옴
		// 2. 길이 -1인 새로운 배열 만들기
		// 3. 값을 옮겨 담음
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int targetIndex = 5; // 5번 인덱스 삭제 - 값은 6
		
		// 1. 5번 인덱스에 6번 인덱스 값을 담고 6번 인덱스에 7번 인덱스를 담고.. 10엔 그 다음 값을 못 담기에 9까지(8번 인덱스까지) 반복 돌아야 함, 8번 인덱스 =  i<arr.length-1;
		for (int i= targetIndex; i<arr.length-1; i++) {
			System.out.println(i);
			arr[i] = arr[i+1];
		} System.out.println(Arrays.toString(arr));
		
		// 2.
		int[] newArr = new int[arr.length-1];
		
		// 3.
		for (int i=0; i<newArr.length; i++) {
			newArr[i] = arr[i];
		} System.out.println(Arrays.toString(newArr));
		
		arr = newArr;
		newArr = null;
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
