import java.io.*;

public class ExceptionDemo4 {
	
	public static void writing() {
		try {
			FileWriter writer = new FileWriter("sample.txt");
			String text = "12�� 3�� ������ ����� �ܼ�Ʈ";
			
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
			// FileNotFoundException�� ������ ������
			BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
			// IOException�� ������ �޼ҵ�
			String text = reader.readLine();
			System.out.println("����: " + text);
		} catch (FileNotFoundException fnfe) {
			// FileNotFoundException�� �߻��� ���� ����ä��, ��� HtaException�� �����ؼ� ������.
			throw new L2Exception();
		} catch (IOException ioe) {
			throw new L2Exception();
		}
	}

	public static void main(String[] args) {
	}
}