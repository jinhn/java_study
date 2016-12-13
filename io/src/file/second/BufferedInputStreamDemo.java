package file.second;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws Exception {
		// 경로를 적을땐 역슬래쉬 한개 더 붙여야함(이스케이프문자)
		String resource = "C:\\Users\\JHTA\\Desktop\\progit-ko.582.pdf";
/*		
		long begin1 = System.currentTimeMillis();
		FileInputStream fis1 = new FileInputStream(resource);
		while (fis1.read() != -1) {}
		fis1.close();
		long end1 = System.currentTimeMillis();
		
		System.out.println("소요시간: " + (end1-begin1) + "밀리초");
*/
		
		long begin2 = System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resource));
		while (bis.read() != -1) {}
		bis.close();
		long end2 = System.currentTimeMillis();
		
		System.out.println("소요시간: " + (end2-begin2) + "밀리초");
	}
}