import java.util.*;

public class CalendarDemo2 {
	public static void main(String[] args) {
	
		// Date --> Calendar
		Date date = new Date();
		// �� ��¥�� �ش��ϴ� �и������尪�� ��ȯ
		long time = date.getTime();

		Calendar cal = Calendar.getInstance();
		//cal.setTime(date);
		// �и������尪�� �ش��ϴ� Calendar�� ����
		cal.setTimeInMillis(time);

		// Calendar --> Date
		// Calendar��ü�� ��¥�� �ش��ϴ� Date��ü�� ��ȯ
		Date date2 = cal.getTime();
	}
}