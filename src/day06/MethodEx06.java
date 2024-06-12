package day06;

import java.util.Arrays;

public class MethodEx06 {
	public static void main(String[] args) {
		
		// Stack과 반대 성격
		// ************* 매우 중요함********** Queue - First In Firsr Out (FIFO), 가장 먼저 들어온 것이 가장 먼저 나가는 순서를 따르는 방식, ex) 은행 대기줄
		
		// push(1); 길이가 1 만큼 커짐
		push(5);
		push(6);
		push(7);
		push(8);
		System.out.println(Arrays.toString(arr));
	
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(Arrays.toString(arr));
		
	}
	
	static int[] arr = {1,2,3,4};
	
	static void push(int data) {
		// 1. 배열의 크기 +1 생성
		// int[] temp = new int[arr.length+1];
		
		int[] temp = Arrays.copyOf(arr, arr.length+1); // (배열 이름, 복사할 길이) - 배열 복사하는 편리한 메소드, 1번 작업 편하게 가능해짐
		System.out.println(Arrays.toString(temp));
		// 2. 생겨난 자리에 데이터 추가
		temp[temp.length-1] = data;
		// 3. 복사 배열 삭제
		arr = temp;
		temp = null;
	}
	
	static int pop() {
		
		// 1 삭제가 가능한 조건 안에서
		if (arr.length>0) {
		// 2 삭제할 데이터 백업하고
		int data = arr[0];
		// 3 길이 -1 배열 생성하고
		int temp[] = new int[arr.length-1];
		// 4 배열 인덱스 1번째 요소-마지막 요소까지 복사하고
		for (int i=0; i<temp.length; i++) {
			temp[i] = arr[i+1];
		}  // 4번 작업은 메소드가 아예 따로 있음 -> Arrays.copyOfRange(arr, 1 ,arr.length); (복사할 배열, 시작 위치, 끝 위치)
		
		// 5 원본 배열 바꾸고
		arr = temp;
		temp = null;
		// 6 삭제된 데이터 반환하기 1,2,3,4,...,8 삭제 순서
		return data;
	} 
		return 0;
	}
}
