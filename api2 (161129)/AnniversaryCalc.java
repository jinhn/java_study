import java.util.*;
import java.text.SimpleDateFormat;

public class AnniversaryCalc {
	public static void main(String[] args) {
	
		Date anniversary = new Date(); // 기념일객체 생성
		Calendar date = Calendar.getInstance(); // 현재시간 받아오기

		String pattern = "yyyy년 MM월 dd일"; // 패턴정하기
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		date.set(2016,10,10); // 받아온 현재시간 기준년월일로 재정의

		int year = date.get(Calendar.YEAR); // 년 뽑기
		int month = date.get(Calendar.MONTH)+1; // 월 뽑기
		int day = date.get(Calendar.DATE); // 일 뽑기

		System.out.printf("기준년월일은 %d년 %d월 %d일 입니다.\n", year, month, day);
		// 기준년월일 출력

		for (int i=1; i<=10; i++) { // 기념일 for문 돌리기
			date.add(Calendar.DAY_OF_MONTH, 100); // 기준년월일에 100일 더하기
			
			anniversary = date.getTime(); // Calendar객체를 Date객체로 변환
			String annDate = sdf.format(anniversary); // 지정한 패턴으로 만들기
			System.out.printf("%d00일은 %s 입니다.\n", i, annDate); // 기념일 출력
		}
	}
}