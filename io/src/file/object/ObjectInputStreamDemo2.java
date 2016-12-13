package file.object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo2 {

	public static void main(String[] args) throws Exception {
		// 역직렬화
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.sav"));
		
		User user = (User) ois.readObject();
		System.out.println("이    름: " + user.getName()); // 이    름: 홍길동
		System.out.println("아 이 디: " + user.getId()); // 아 이 디: hong1234
		System.out.println("비밀번호: " + user.getPassword()); // 비밀번호: null
		
		ois.close();
	}
}