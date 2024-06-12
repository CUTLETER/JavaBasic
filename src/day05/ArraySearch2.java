package day05;

import java.util.Arrays;

public class ArraySearch2 {

	public static void main(String[] args) {
		
		// 이진탐색 - 알고리즘
		// 절반을 분할해서 값을 찾아가는 방법
		// 전제 조건이 있음 - 배열이 꼭 정렬되어 있어야 함
		
		/* 방법
		 * 1. 시작값 (= 0), 끝값 (= 배열의 마지막 값)을 처음에다 2개 배치하고
		 * 2. 중간값을 구함
		 * 3. 중간값이 찾는 값인지 확인함
		 * 4. 중간값이 찾는 값보다 크면, end를 중간값-1 로 내림 (예로 중간값이 50이면 49까지의 그 안에서 찾아야 하니까)
		 * 5. 중간값이 찾는 값보다 작으면, start를 중간값 +1로 올림 (마찬가지로 51부터 찾아야 하니까)
		 * 반복
		 * 반복의 중단 조건 : end랑 start가 중간지점에서 만나고 난 후부터는(=교차가 되면) 찾는 값이 안에 없다고 봐야 함, (start <=end)
		 */
		
		int[] arr = {1,3,4,10,20,50,80,100};
		int find = 79;
		int start = 0; // 배열의 시작 값
		int end = arr.length-1; // 배열의 마지막 값
		
		while (start <=end) {
		
			int mid = (start+end) / 2; // 짝수 홀수 상관 없음
			
			if (arr[mid] == find ) { // 찾음
			System.out.println("찾는 값은 : "+mid+"번째 위치에" );
			break; // 더이상 찾을 필요 없어져서
			}
			
			if (arr[mid] < find) {
				start = mid + 1; // 시작값을 중간값+1로
			} else {
				end = mid - 1;
			}
		}	
		
		if (start > end) { // start와 end가 만나고 마침내 start가 end보다 커질 때는 값을 못 찾았단 의미
			System.out.println(find+ " : 없다");
		}
		
		
		// 이진 탐색 기능
		System.out.println(Arrays.binarySearch(arr, 80));
		// 음수가 나오면 값이 없다는 뜻
		// 양수가 나오면 해당 위치의 인덱스가 뜸
		
		
	}
}
