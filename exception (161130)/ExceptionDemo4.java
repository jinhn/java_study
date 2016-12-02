import java.io.*;

public class ExceptionDemo4 {
	
	public static void writing() {
		try {
			FileWriter writer = new FileWriter("sample.txt");
			String text = "12월 3일 볼빨간 사춘기 콘서트";
			
			writer.write(text);
			writer.flush();
		} catch (FileNotFoundException fnfe) {
			throw new L2Exception();
		} catch (IOException ioe) {
			throw new L2Exception();
		}
	}

	public static void reading() {
		try {
			// FileNotFoundException을 던지는 생성자
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			// IOException을 던지는 메소드
			String text = reader.readLine();
			System.out.println("내용: " + text);
		} catch (FileNotFoundException fnfe) {
			// FileNotFoundException이 발생한 것을 가로채고, 대신 HtaException을 생성해서 던진다.
			throw new L2Exception();
		} catch (IOException ioe) {
			throw new L2Exception();
		}
	}

	public static void main(String[] args) {
	}
}