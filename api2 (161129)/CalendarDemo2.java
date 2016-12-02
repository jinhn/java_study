import java.util.*;

public class CalendarDemo2 {
	public static void main(String[] args) {
	
		// Date --> Calendar
		Date date = new Date();
		// 그 날짜에 해당하는 밀리세컨드값을 반환
		long time = date.getTime();

		Calendar cal = Calendar.getInstance();
		//cal.setTime(date);
		// 밀리세컨드값에 해당하는 Calendar로 변경
		cal.setTimeInMillis(time);

		// Calendar --> Date
		// Calendar객체의 날짜에 해당하는 Date객체가 반환
		Date date2 = cal.getTime();
	}
}