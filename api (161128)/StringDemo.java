public class StringDemo {
	public static void main(String[] args) {
	
/*
    String Ŭ����
        String Ŭ������ ���ڿ��� ǥ���Ѵ�.
        String���� �Һ����̴�. �ѹ� ������� ���Ŀ��� ������ �� ����.
        String�� ��ü�� �����ϴ� Ư���� ����� �����Ѵ�.
            String str = new String("abc"); // �����ڸ� �̿��� String��ü ����
            String str = "abc";             // ���ڿ� ǥ������ �̿��� String��ü ����
            str.toUpperCase(); == "abc".toUpperCase();
*/

		String str = "�ڹ� ���α׷��� ����";

	// ���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ�: int length()
		int len = str.length();
		System.out.println("���ڿ��� ����: " + len); // ���ڿ��� ����: 11
	// ex. �Է��ؾ��ϴ� ĭ�� ���ڰ����� �ٸ� ���

	// ���ڿ��� ����ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�: boolean isEmpty()
		boolean empty = str.isEmpty();
		System.out.println("�� ���ڿ��ΰ�? " + empty); // �� ���ڿ��ΰ�? false
	// ex. �ʼ��� �Է��ؾ��ϴ� ĭ

	// ���ڿ����� �ǹ̾��� ������ ������ ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ�: String trim()
		String str2 = "    ȫ �浿    ";
		String str3 = str2.trim();
		System.out.println("str2["+str2+"]"); // str2[    ȫ �浿    ]
		System.out.println("str3["+str3+"]"); // str3[ȫ �浿]

	// ���ڿ��� ������ ���ؼ� ������ ������ ���� ���ڿ����� ���θ� ��ȯ�ϴ� �޼ҵ�: boolean equals(Object str)
		String str4 = "����";
		String str5 = "����";
		boolean equal = str4.equals(str5);
		System.out.println("������ ���ڿ��ΰ�? " + equal); // true

		String str6 = "apple";
		String str7 = "Apple";
		boolean equal2 = str6.equalsIgnoreCase(str7);
		System.out.println("��ҹ��� ���о��� ������ �� ������ ���ڿ��ΰ�? " + equal2); // true
	
	// ���ڿ��� ������ ���ڿ��� �����ϰ� �ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�: boolean contains(CharSequence s)
		String str8 = "�ڹ� ���α׷��� - �ڹ� ����";
		boolean contains = str8.contains("�ڹ�");
		System.out.println("[�ڹ�]��� ���ڿ��� �����ϰ� �ִ°�? " + contains); // true

	// ���ڿ����� ������ ��ġ�� ����(char)�� ��ȯ�ϴ� �޼ҵ�: char charAt(int index)
		char ch = str8.charAt(1);
		System.out.println("1��° ���ڴ�? " + ch); // ��

	// ���ڿ����� ������ ���ڿ��� ó������ �����ϴ� ��ġ�� ��ȯ�ϴ� �޼ҵ�: int indexOf(String str)
		int index = str8.indexOf("���α׷���");
		System.out.println("���ڿ����� [���α׷���]�̶�� ���ڰ� ó������ �����ϴ� ��ġ��? " + index); // 3

	// ���ڿ��� ������ ������ ���ڿ��� ��ü�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ�: String replace(String str, String str)
		String str9 = str8.replace("�ڹ�", "���̽�");
		System.out.println("str8 ["+str8+"]"); // str8 [�ڹ� ���α׷��� - �ڹ� ����]
		System.out.println("str9 ["+str9+"]"); // str9 [���̽� ���α׷��� - ���̽� ����]

	// ���ڿ����� ������ ��ġ���� ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ�: String substring(int beginIndex)
		String str10 = "abcdefghijklmn";
		String sub1 = str10.substring(5);
		System.out.println("5��°���� �߶� ���ڿ�: " + sub1); // fghijklmn

	// ���ڿ����� ������ ������ ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ�: String substring(int beginInclusive, int endExclusive)
		String sub2 = str10.substring(0, 4);
		System.out.println("0������ 4���ձ��� �߶� ���ڿ�: " + sub2); // abcd

		String name = "ȫ�浿";
		String familyName = name.substring(0, 1);
		System.out.println("��: " + familyName);

	// ���ڿ��� ������ �����ڸ� �������� �߶� �迭�� ��ȯ�ϴ� �޼ҵ�: String[] split(String delim)
		String cities = "����,���,��õ,����,�λ�,����,���,�뱸";
		String[] city = cities.split(",");
		System.out.println(city[0]); // ����
		System.out.println(city[2]); // ��õ

	// ���ڿ��� �ҹ���/�빮�ڷ� ��ȯ�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ�: String toUpperCase(), String toLowerCase()
		String str11 = "sony";
		String str12 = str11.toUpperCase();
		System.out.println("str11 ["+str11+"]"); // str11 [sony]
		System.out.println("str12 ["+str12+"]"); // str12 [SONY]

	// ����, �Ǽ�, �Ҹ���, ��Ÿ ���� ������ ������ ���ڿ��� ��ȯ�ؼ� ��ȯ�ϴ� ���� �޼ҵ�
	// String valueOf(int value), String valueOf(double value), String valueOf(boolean value)
		int number = 1234;
		String str13 = String.valueOf(number);
		System.out.println(str13); // ���� 1234�� ���ڿ� "1234"�� ��ȯ�ؼ� ��ȯ
		System.out.println("���� �ڸ���: " + str13.substring(str13.length()-1)); // ���ڸ� ��ȯ
	// ������ �ڸ����� ��ȯ�Ҷ� ���ڿ��� ��ȯ�ؼ� ��ȯ�ϸ� ����.

		String str14 = 1234 + ""; // ���ڿ��� ���������.
	}
}