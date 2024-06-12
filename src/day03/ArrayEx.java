package day03;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		// 배열 Array
		
		// 1. 배열의 선언
			int[] arr;
		// 2 배열의 생성
			arr = new int[5]; // System.out.println(arr); 이대로 출력하면 상자가 만들어진 위치(주소값) 나옴
		// 3. 배열의 초기화 - 값을 대입하는 작업
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			arr[4] = 50;
		// 4. 배열의 사용
			System.out.println("배열의 0번째 상자 값 "+ arr[0]);
		// 5. 배열 속 데이터 값 변경
			arr[0] = 100;
			System.out.println("배열의 0번째 상자 값 "+ arr[0]);
		// 6. 배열의 값을 한눈에 문자열로 보고 싶을 때
			System.out.println(Arrays.toString(arr));
		// 7. 배열의 길이(값을 담아낼 상자의 총 개수)를 확인함
			System.out.println("배열의 길이 " + arr.length);
		// 8. 배열의 마지막 인덱스는 '길이 -1' 값이다, arr.length - 1
			System.out.println("배열의 마지막 상자 " + arr[arr.length - 1]);
			
			System.out.println("--------------");
			
		// 9. 생성과 선언을 동시에 하는 법
			int[] arr2 = new int[7];
		// 10. 배열의 선언, 생성, 초기화 동시에 하는 법
			byte[] arr3 = {0,1,2,3,4,5,6}; // 또 하나의 방법 : byte[] arr4 = new byte[] {0,1,2,3,4,5,6};
			System.out.println(Arrays.toString(arr3));
			
		// 배열은 값을 지정하지 않으면 기본값으로 채워짐 (=초기화됨)
		//0, 0.0, false, null
			System.out.println(Arrays.toString(arr2));
		
			System.out.println("-----------------------");
			
			
			
			/*
			 * 문자열을 저장하는 크기가 7배열을 생성하고
			 * 월-일까지 값을 저장하기
			 */
			
			String[] week = new String[7];
			week[0] = "월요일";
			week[1] = "화요일";
			week[2] = "수요일";
			week[3] = "목요일";
			week[4] = "금요일";
			week[5] = "토요일";
			week[6] = "일요일";
			System.out.println(Arrays.toString(week));
			
			String[] week2 = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
			System.out.println(Arrays.toString(week2));
			
			System.out.println("-------------------");
			
			
			
			/*
			 * arr 배열 안 값의 합계와 평균을 출력하기
			 */
			
			int total = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
			System.out.println("arr의 합계 "+total);
			int average = total / arr.length;
			System.out.println("arr의 평균 "+average);
			//System.out.println("arr의 평균 "+ total / arr.length); 평균을 구하는 숏코드
			//System.out.println("arr의 평균 "+ (double) total / arr.length); 실수로 구할 때
		
	}

}
