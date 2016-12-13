package file.read;

import java.io.FileInputStream;

public class FileInputStreamDemo2 {

	public static void main(String[] args) throws Exception {

		long start = System.currentTimeMillis();

		FileInputStream fis = new FileInputStream("sample.txt");
		int count = 0;
		// 데이터를 배열에 담아서 읽어오면 처리속도를 향상시킬 수 있다.
		byte[] buf = new byte[1024];
		while ((count = fis.read(buf)) != -1) {
			//System.out.println(count);
			
			// String(byte[] bytes, int offset, int length)
			// bytes 배열, 시작위치, 길이
			String str = new String(buf, 0, count);
			System.out.println(str);
		}
		fis.close();

		long stop = System.currentTimeMillis();
		System.out.println("\n소요시간: " + (stop - start) + "밀리초");
	}
}
