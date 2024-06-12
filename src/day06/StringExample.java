package day06;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		
		// 문자열을 다루는 다양한 방법
		// 문자열은 사실 알고 보면 char문자들의 배열이 합쳐진 것
		// index라는 개념을 가짐
		
		// 문자열.메소드명()
		
		
		 // **********************모든 메소드는 밑에 자동완성 되는 곳에서 정보 얻을 수 있음 () 안에는 매개변수 타입,  : 옆에는 반환 타입
		
		
		
		String str = "안녕하쌉사리";
		
		// 문자열 index번호로 자르기 .charAt()
		char c = str.charAt(0); // 매개변수는 int, 반환 타입은 char
		System.out.println("0번째 인덱스 : "+c);
		
		// 문자열의 길이 .length()
		System.out.println("문자열의 길이 : "+str.length());
		
		// 문자 찾기 .indexOf("")
		str.indexOf("녕"); //String str는 매개변수, int로 반환
		System.out.println("녕이 있는 위치 : "+str.indexOf("녕"));
		System.out.println(str.indexOf("흥")); // 없는 문자라면 -1 반환함
		
		// 문자 변경하기  .replace("")
		String r1 = str.replace("안녕", "hello"); // 대상 (=타겟) 문자, 변경할 문자
		System.out.println(r1);
		System.out.println(str); // 원본 문자열은 그대로임
		
		// 공백 없애기 replace
		String str2 = "아 집에 가고 싶다~ ㅠㅠ";
		String r2 = str2.replace(" ", "");
		str2=str2.replace(" ", ""); // 이러면 원본이 바뀜
		System.out.println(str2);
		
		// 문자열 자르기 .substring()
		System.out.println(str.substring(2)); // 2번 index '미만'으로 잘라버림 = 하쌉사리
		System.out.println(str.substring(0,2)); // 0 이상 2 '미만'으로 추출됨
		
		// 문자열 자르기 .split()
		String str3 = "010-1234-5678";
		String[] result3 = str3.split("-"); // - 기준으로 잘라서 배열로 반환함
		String[] result4 = str3.split(""); // 한 글자씩 잘라서 배열로 반환함 , String형
		char[] result5 = str3.toCharArray(); // char형
		System.out.println(Arrays.toString(result3));
		System.out.println(Arrays.toString(result4));
		System.out.println(Arrays.toString(result5));
		
		// 양쪽 공백 제거하기 .trim()
		String str4 = "   hello world   ";
		System.out.println(str4.trim()); // 문자열 앞뒤 공백 제거됨, 가운데는 ㄴㄴ
		
		// 문자열의 비교 .equals()
		System.out.println("홍길동".equals("홍길동")); // 같으면 true
		System.out.println("홍길동".equals("홍길똥")); // 다르면 false
		
		// 문자열의 대소비교 .compareTo() ---->>>> 앞문자의 아스키 코드 - 뒷문자의 아스키 코드 // 한글도 가능
		System.out.println( "ABC".compareTo("ABC")); // 0 = 같은 문자
		System.out.println( "ABC".compareTo("ABD")); // -1 음수가 나오면 사전적으로 뒤에 있음  
		System.out.println( "ABC".compareTo("ABB")); // 1 양수가 나오면 사전적으로 앞에 있음

		// 문자열 합치기 String.join() - 얘는 독특하게 String. 찍음 
		String.join("->", "유", "선", "화");
		System.out.println(String.join("->", "유", "선", "화")); // 문자 사이마다 넣어줌
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
