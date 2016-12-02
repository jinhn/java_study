import java.io.*;

public class ExceptionDemo3 {
	
	public static void writing() throws HtaException {
		try {
			FileWriter writer = new FileWriter("sample.txt");
			String text = "12월 3일 볼빨간 사춘기 콘서트";
			
			writer.write(text);
			writer.flush();
		} catch (FileNotFoundException fnfe) {
			throw new HtaException();
		} catch (IOException ioe) {
			throw new HtaException();
		}
	}

	public static void reading() throws HtaException {
		try {
			// FileNotFoundException을 던지는 생성자
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			// IOException을 던지는 메소드
			String text = reader.readLine();
			System.out.println("내용: " + text);
		} catch (FileNotFoundException fnfe) {
			// FileNotFoundException이 발생한 것을 가로채고, 대신 HtaException을 생성해서 던진다.
			throw new HtaException();
		} catch (IOException ioe) {
			throw new HtaException();
		}
	}

	public static void main(String[] args) {
		try {
			ExceptionDemo3.reading();
			ExceptionDemo3.writing();
		} catch (HtaException e) {
			System.out.println("프로그램 실행 중 오류가 발생했습니다.");
		}
	}
}