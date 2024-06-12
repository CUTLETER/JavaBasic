package day05;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		// 배열의 복사
		
		// 얕은 복사, 깊은 복사 두 가지가 있음
		
		// 얇은 복사 - 주소값을 통한 복사 (원본 배열에도 실제 영향을 미침)
		
		// 깊은 복사 - 아예 새로운 배열을 만들어서 복사함
		
		int[] arr = {1,2,3,4,5};
		System.out.println(arr);
		int[] newArr = arr;
		System.out.println(newArr == arr); // 둘이 똑같다고 나옴 true
		
		newArr[0] = 100;
		
		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(arr)); // 주소값을 통해 이뤄진 복사라 arr[0]도 덩달아 100으로 바뀜
		// ------------>>>>>>>> 이게 바로 얕은 복사의 개념, 다만 원본도 바뀌니까 쓸 일이 딱히 없음
		
		
		
		System.out.println("----------------------------");

		
		int[] arr2 = new int[arr.length]; // 원본과 동일한 크기
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr2)); // 원본과 동일한 복사본을 새로 만듦
		arr2[0] = 1000;
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr)); // 복사본에서 값이 바뀌더라도 원본엔 영향 미치지 않음
		// ------------->>>>>>>>>>>>>>>>>>>깊은 복사의 개념
		
		
		
		
		
		
	}
}
