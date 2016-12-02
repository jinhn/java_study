public class StringDemo {
	public static void main(String[] args) {
	
/*
    String 클래스
        String 클래스는 문자열을 표현한다.
        String값은 불변값이다. 한번 만들어진 이후에는 변경할 수 없다.
        String은 객체를 생성하는 특별한 방법을 제공한다.
            String str = new String("abc"); // 생성자를 이용한 String객체 생성
            String str = "abc";             // 문자열 표현식을 이용한 String객체 생성
            str.toUpperCase(); == "abc".toUpperCase();
*/

		String str = "자바 프로그래밍 연습";

	// 문자열의 길이를 반환하는 메소드: int length()
		int len = str.length();
		System.out.println("문자열의 길이: " + len); // 문자열의 길이: 11
	// ex. 입력해야하는 칸의 문자갯수가 다를 경우

	// 문자열이 비어있는지 여부를 반환하는 메소드: boolean isEmpty()
		boolean empty = str.isEmpty();
		System.out.println("빈 문자열인가? " + empty); // 빈 문자열인가? false
	// ex. 필수로 입력해야하는 칸

	// 문자열에서 의미없는 공백을 제거한 새로운 문자열을 반환하는 메소드: String trim()
		String str2 = "    홍 길동    ";
		String str3 = str2.trim();
		System.out.println("str2["+str2+"]"); // str2[    홍 길동    ]
		System.out.println("str3["+str3+"]"); // str3[홍 길동]

	// 문자열의 내용을 비교해서 동일한 내용을 가진 문자열인지 여부를 반환하는 메소드: boolean equals(Object str)
		String str4 = "애플";
		String str5 = "애플";
		boolean equal = str4.equals(str5);
		System.out.println("동일한 문자열인가? " + equal); // true

		String str6 = "apple";
		String str7 = "Apple";
		boolean equal2 = str6.equalsIgnoreCase(str7);
		System.out.println("대소문자 구분없이 비교했을 때 동일한 문자열인가? " + equal2); // true
	
	// 문자열이 지정한 문자열을 포함하고 있는지 여부를 반환하는 메소드: boolean contains(CharSequence s)
		String str8 = "자바 프로그래밍 - 자바 기초";
		boolean contains = str8.contains("자바");
		System.out.println("[자바]라는 문자열을 포함하고 있는가? " + contains); // true

	// 문자열에서 지정된 위치의 문자(char)를 반환하는 메소드: char charAt(int index)
		char ch = str8.charAt(1);
		System.out.println("1번째 문자는? " + ch); // 바

	// 문자열에서 지정된 문자열이 처음으로 등장하는 위치를 반환하는 메소드: int indexOf(String str)
		int index = str8.indexOf("프로그래밍");
		System.out.println("문자열에서 [프로그래밍]이라는 글자가 처음으로 등장하는 위치는? " + index); // 3

	// 문자열의 내용을 지정된 문자열로 대체한 새로운 문자열을 반환하는 메소드: String replace(String str, String str)
		String str9 = str8.replace("자바", "파이썬");
		System.out.println("str8 ["+str8+"]"); // str8 [자바 프로그래밍 - 자바 기초]
		System.out.println("str9 ["+str9+"]"); // str9 [파이썬 프로그래밍 - 파이썬 기초]

	// 문자열에서 지정된 위치부터 끝까지 문자열을 잘라서 반환하는 메소드: String substring(int beginIndex)
		String str10 = "abcdefghijklmn";
		String sub1 = str10.substring(5);
		System.out.println("5번째부터 잘라낸 문자열: " + sub1); // fghijklmn

	// 문자열에서 지정된 구간의 문자열을 잘라서 반환하는 메소드: String substring(int beginInclusive, int endExclusive)
		String sub2 = str10.substring(0, 4);
		System.out.println("0번부터 4번앞까지 잘라낸 문자열: " + sub2); // abcd

		String name = "홍길동";
		String familyName = name.substring(0, 1);
		System.out.println("성: " + familyName);

	// 문자열을 지정한 구분자를 기준으로 잘라서 배열로 반환하는 메소드: String[] split(String delim)
		String cities = "서울,경기,인천,대전,부산,광주,울산,대구";
		String[] city = cities.split(",");
		System.out.println(city[0]); // 서울
		System.out.println(city[2]); // 인천

	// 문자열을 소문자/대문자로 변환한 새로운 문자열을 반환하는 메소드: String toUpperCase(), String toLowerCase()
		String str11 = "sony";
		String str12 = str11.toUpperCase();
		System.out.println("str11 ["+str11+"]"); // str11 [sony]
		System.out.println("str12 ["+str12+"]"); // str12 [SONY]

	// 정수, 실수, 불린값, 기타 여러 종류의 값들을 문자열로 변환해서 반환하는 정적 메소드
	// String valueOf(int value), String valueOf(double value), String valueOf(boolean value)
		int number = 1234;
		String str13 = String.valueOf(number);
		System.out.println(str13); // 숫자 1234를 문자열 "1234"로 변환해서 반환
		System.out.println("일의 자리수: " + str13.substring(str13.length()-1)); // 끝자리 반환
	// 숫자의 자릿수를 반환할때 문자열로 변환해서 반환하면 쉽다.

		String str14 = 1234 + ""; // 문자열로 만들어진다.
	}
}