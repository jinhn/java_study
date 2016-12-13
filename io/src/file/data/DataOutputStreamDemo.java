package file.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {

	public static void main(String[] args) throws Exception {

		String name = "홍길동";
		int kor = 30;
		int eng = 50;
		int math = 70;
		
		FileOutputStream fos = new FileOutputStream("score3.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF(name);
		dos.writeInt(kor);
		dos.writeInt(eng);
		dos.writeInt(math);

		dos.close();
	}
}