import java.io.*;

public class ExceptionDemo2 {
	
	// reading()�� �ڽ��� ����ϴ� ���๮���� �߻��ϴ� ���ܸ� ó������ �ʴ´�.
	// ��� �߻��� ����Ǵ� ���ܸ� �ٽ� ����������.
	public static void reading() throws FileNotFoundException, IOException {
		// FileNotFoundException�� ������ ������
		BufferedReader reader = new BufferedReader(new FileReader("memo.txt"));
		// IOException�� ������ �޼ҵ�
		String text = reader.readLine();
		System.out.println("����: " + text);
	}

	// main()�޼ҵ�� reading()�޼ҵ尡 ������ ���ܿ� ���� ó���� �����ϰ� �ִ�.
	// reading()�޼ҵ�� �ڽ��� ����ϴ� main()���� ����ó�� å���� ���Ѱ��.
	public static void main(String[] args) {
		try {
			ExceptionDemo2.reading();
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException ioe) {
			System.out.println("������ �д� �� ������ �߻��Ͽ����ϴ�.");
		}
	}
}