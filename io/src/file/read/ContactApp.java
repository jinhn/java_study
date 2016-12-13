package file.read;

import java.io.FileInputStream;
import java.util.ArrayList;

public class ContactApp {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("contacts.txt");
		int count = 0;
		byte[] buf = new byte[1024];

		// 1. contacts.txt의 내용을 읽어서 화면에 표시하기
		StringBuilder sb = new StringBuilder();
		while ((count = fis.read(buf)) != -1) {
			String text = new String(buf, 0, count);
			sb.append(text);
		}
		fis.close();
		String data = sb.toString();
		System.out.println(data);

		// 2. contacts.txt의 내용을 한 사람씩 구분해서 화면에 표시하기
		String[] contact = data.split(":");
		for (String person : contact) {
			System.out.println(person);
		}

		// 3. ArrayList<Contact>를 생성해서 모든 사람의 정보를 저장하기
		ArrayList<Contact> con = new ArrayList<>();
		for (String s : contact) {
			Contact person = new Contact();
			String[] arr = s.split(",");
			person.setName(arr[0]);
			person.setTel(arr[1]);
			person.setEmail(arr[2]);
			con.add(person);
		}
		for (Contact c : con) {
			System.out.println("이름: " + c.getName() + ", 연락처: " + c.getTel() + ", 이메일: " + c.getEmail());
		}
	}
}