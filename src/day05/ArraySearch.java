package day05;

public class ArraySearch {

	public static void main(String[] args) {
		
		// 탐색 (=순회)
		int[] arr= {1,2,3,5,10,20,50,80,100};
		int find = 80; // 찾을 값
		int findIndex = -1; // 인덱스 0번째부터 탐색하니까 if 조건문 쓰려면 -1로 해야
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == find) { // 찾는 과정
				findIndex = i; // 몇 번째에 있다
				break; // 탈출 - 찾았으니 뒤는 의미 없어서
				}
			
		}
		
		if (findIndex != -1) {
			System.out.println(find+ " : " +findIndex+ " 번째 인덱스에");
		} else {
			System.out.println(find + " : 없다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
