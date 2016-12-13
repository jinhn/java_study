package file.object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo1 {

	public static void main(String[] args) throws Exception{
		
		Account account = new Account();
		account.setName("홍길동");
		account.setAccNumber("111-222-333-4444");
		account.setBalance(100000000);
		
		// Rate 클래스가 직렬화 되어있지 않으면
		// NotSerializableException 발생
		Rate rate = new Rate();
		rate.setMonth(0.03);
		rate.setYear(0.3);
		account.setRate(rate);
		
		FileOutputStream fos = new FileOutputStream("account.sav");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		/*
		 * Account객체를 직렬화해서 FileOutputStream으로 흘려보낸다.
		 */
		
		oos.writeObject(account);
		
		oos.close();
	}
}