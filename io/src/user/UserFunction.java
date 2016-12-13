package user;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UserFunction {

	Scanner sc = new Scanner(System.in);
	User person = new User();
	int no = 0; // 번호

	public void register() throws Exception {
		ArrayList<User> Users = new ArrayList<>();

		person.setNo(no++);
		System.out.print("아 이 디입력: ");
		person.setId(sc.nextLine());
		System.out.println("비밀번호입력: ");
		person.setPwd(sc.nextLine());
		System.out.println("이    름입력: ");
		person.setName(sc.nextLine());
		System.out.println("연 락 처입력: ");
		person.setTel(sc.nextLine());

		Users.add(person);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("USER_DATA.sav", true));
		oos.writeObject(Users);
		oos.close();
	}

	public void login() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("USER_DATA.sav"));

		ArrayList<User> Users2 = (ArrayList<User>) ois.readObject();

		System.out.println("아이디입력: ");
		String idid = sc.nextLine();
		System.out.println("비밀번호입력: ");
		String pwdpwd = sc.nextLine();

		for (User user : Users2) {
			if (idid.equals(user.getId()) && pwdpwd.equals(user.getPwd())) {
				System.out.println("로그인되었습니다.");
			}
		}
		ois.close();
	}
}