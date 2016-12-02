import java.util.*;
import java.text.SimpleDateFormat;

public class AnniversaryCalc {
	public static void main(String[] args) {
	
		Date anniversary = new Date(); // ����ϰ�ü ����
		Calendar date = Calendar.getInstance(); // ����ð� �޾ƿ���

		String pattern = "yyyy�� MM�� dd��"; // �������ϱ�
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		date.set(2016,10,10); // �޾ƿ� ����ð� ���س���Ϸ� ������

		int year = date.get(Calendar.YEAR); // �� �̱�
		int month = date.get(Calendar.MONTH)+1; // �� �̱�
		int day = date.get(Calendar.DATE); // �� �̱�

		System.out.printf("���س������ %d�� %d�� %d�� �Դϴ�.\n", year, month, day);
		// ���س���� ���

		for (int i=1; i<=10; i++) { // ����� for�� ������
			date.add(Calendar.DAY_OF_MONTH, 100); // ���س���Ͽ� 100�� ���ϱ�
			
			anniversary = date.getTime(); // Calendar��ü�� Date��ü�� ��ȯ
			String annDate = sdf.format(anniversary); // ������ �������� �����
			System.out.printf("%d00���� %s �Դϴ�.\n", i, annDate); // ����� ���
		}
	}
}