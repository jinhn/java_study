import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
	
		int number = 123456789;

		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		String text = df.format(number);

		System.out.println(text);

		double rate = 12.345;

		// �Ҽ��� 2�ڸ����� ǥ��, 3�ڸ����� �ݿø�
		//String pattern2 = "#.##";
		String pattern2 = "0,000.0000";
		DecimalFormat df2 = new DecimalFormat(pattern2);
		String text2 = df2.format(rate);

		System.out.println(text2);
	}
}