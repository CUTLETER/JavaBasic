package day01;

public class DataTypeEx2 {

	public static void main(String[] args) {
		
		// 한 글자만 저장하는 char (=캐릭터) 타입
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1);
		System.out.println(c2);
		// 왜 c2 값도 A?
		// -> 알파벳에 숫자값을 지정해서 해당 숫자값의 알파벳을 표시함 (=아스키 코드, 1byte)
		
		// 유니코드 - 2byte 크기로 확장시키고 6만여개의 문자를 표시함
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uC00D'; // 역슬래쉬+u -> 유니코드를 나타냄
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		System.out.println("---------------");
		
		// 문자열
		String s1 = "Hello ";
		String s2 = "World ";
		String s3 = ">O<";
		System.out.println(s1 + s2 + s3); // 문자열은 +로 붙여서 출력 가능함
		System.out.println("Hello " + 100); // 문자열에 다른 데이터 타입의 값이 붙어도 문자화 됨
		System.out.println("200" + 100);
		System.out.println(100 + 200 + "300");
		
		System.out.println("A"+10);
		System.out.println('A'+10); 
		System.out.println('A'+"A");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
