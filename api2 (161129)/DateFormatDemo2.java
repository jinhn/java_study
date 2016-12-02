import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateFormatDemo2 {
	public static void main(String[] args) throws ParseException {

		String pattern = "yyyy/MM/dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		// 지정된 형식의 텍스트를 Date객체로 변환하기
		String text = "2016.11/29";
		Date date = sdf.parse(text);

		System.out.println(date);
	}
}
/*
error: unreported exception ParseException; must be caught or declared to be thrown
예외 발생 시, 예외를 잡거나 던져야한다. 예외를 잡지않고 던지면 프로그램이 종료된다.
*/