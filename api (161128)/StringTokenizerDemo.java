import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		
		String text = "�����ڸ� �������� ������ ������ �����ڰ� �ȴ�";

		StringTokenizer st = new StringTokenizer(text);

		int length = st.countTokens();
		System.out.println("�ܾ� ����: " + length);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			System.out.println("���� ��ū ����: " + st.countTokens());
		}

		/*
		---------- ���� ----------
		�ܾ� ����: 6
		�����ڸ�
		���� ��ū ����: 5
		��������
		���� ��ū ����: 4
		������
		���� ��ū ����: 3
		������
		���� ��ū ����: 2
		�����ڰ�
		���� ��ū ����: 1
		�ȴ�
		���� ��ū ����: 0

		��� �Ϸ� (0�� ���) - ���� ����
		*/

		//String[] tokens = text.split(" ");
		//System.out.println("�ܾ� ����: " + tokens.length);

/*
	StringTokenizer
		- ���ڿ��� �����ڸ� �������� �߶� ��ū���� �����.
		- new StringTokenizer(�ؽ�Ʈ);
		  �����ڸ� �������� ������ ������ �����ڰ� �ȴ�.
		- new StringTokenizer(�ؽ�Ʈ, ������);
		- boolean hasMoreTokens() : �������� ���� ��ū�� �����ϸ� true�� ��ȯ�Ѵ�.
		- String nextToken() : ��ū(���ڿ�)�� ������.
*/
	}
}