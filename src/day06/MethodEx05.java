package day06;

import java.util.Arrays;

public class MethodEx05 {
	public static void main(String[] args) {
		
		// 배열의 한계점 - 크기가 고정적
		// Stack -> Last In First Out (LIFO) 를 주로 씀, LIFO = 물건을 쌓거나 정리할 때 가장 최근에 넣은 것을 가장 먼저 꺼내는 방식 ex)책 쌓기, 엘리베이터
		
		push(4);
		push(5);
		push(6);
		push(7);
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop()); // 더 뽑을 게 없으면 0 뜸
		System.out.println(Arrays.toString(arr));
		
	
	}
	
	static int[] arr = {1,2,3};
	static void push(int data) { 										// 추가추가추가추가추가추가추가추가
		// 뒤에다가 값을 하나 추가하는 함수
		int[] temp = new int[arr.length+1]; // 복사한 값을 넣을 빈 배열 만들기
		for (int i=0; i<arr.length; i++) {
			temp[i] = arr[i]; // 만들어진 새 배열에 값을 복사해서 넣기
		}
		temp[temp.length-1] = data; // 마지막 인덱스에 추가할 값 넣기
		arr = temp; // 원본 배열을 바꾸기
		temp = null; // 복사 배열 삭제하기
	}
	
	// pop - 특정 요소를 마지막에서 삭제 시키고 그 삭제된 데이터 값을 반환함
	static int pop() { 													// 삭제삭제삭제삭제삭제삭제삭제삭제
		if (arr.length>0) { // 배열 첫번째 값까지만 삭제시킬 수 있어서
			// 1. 삭제할 데이터를 백업시킴
			int data = arr[arr.length-1]; // 배열의 맨마지막 데이터를 넣어둠
			// 2. arr가 -1인 사본 배열을 만듦
			int[] temp = new int[arr.length-1];
			// 3. 값을 복사함
			for (int i=0; i<temp.length; i++) {
				temp[i] = arr[i];
			}
			// 4. 원본 배열을 바꿈
			arr = temp;
			temp = null;
			
			return data; // 삭제한 데이터를 반환함
		} 
		
		return 0;
	}
}
