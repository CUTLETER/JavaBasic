package day06;

import java.util.Arrays;

public class MethodEx04 {

	
	public static void main(String[] args) {
		
	// 배열도 메소드의 매개변수 or 반환으로 사용할 수 있나? YEEEEES
	
	// 1	
	int[] arr = {1,2,3,4,5,6,7}; // 어찌 됐건 메소드를 만든 뒤 호출 창에도 배열 만들어 줘야 함, 이 배열이 저 아래 메소드로 전달됨
	method01(arr); //배열의 변수명 - 주소값			
		
	
	// 2
	int[] result = method02(); // 호출을 시키고 return이 돌아오면 반환 타입에 맞게 [] 넣어서 result에다 저장시키면 됨
	System.out.println(Arrays.toString(result));
		
	
	// 3
	int a=1; // 변수는 완전히 새로운 a가 복사돼서 넘어가서 바뀌지 않음
	int[] ar = {1,2,3}; // 배열은 주소값이 동일해서 바뀜
	method03(a,ar);
	System.out.println("a : "+a);
	System.out.println("ar : "+Arrays.toString(ar));
	
	
	
	}
	
	// 매개변수로 배열을 받는 메소드 1 - 
	static void method01(int[] arr) { // 호출할 때도 똑같이 배열 타입으로
		for (int i=0; i<arr.length; i++) {
		System.out.println(arr[i]+" -> ");
		}
	}
	
	// 반환으로 배열을 리턴하는 메소드 2
	static int[] method02() { // 반환 타입에다 대괄호 찍으면 됨
		int[] arr = {1,2,3,4}; // 어떻게든 배열을 만들어서 return에 걸어주면 됨
		
		
		return arr;
	}
	
	// 배열을 전달할 때는 흥미로운 사실이 한 가지 있음 3 - call by reference
	static void method03(int a, int[] arr) {
		a = 10; // a를 10으로 변경함
		arr[0] = 10; // 마찬가지로 10으로 변경함
		
	}
	
	
	
	
}
