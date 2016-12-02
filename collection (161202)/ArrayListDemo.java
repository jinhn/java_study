import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		// 이름을 여러 개 저장할 수 있는 ArrayList만들기
		ArrayList<String> names = new ArrayList<String>();

		// ArrayList에 String객체 저장하기
		names.add("홍길동");
		names.add("김유신");
		names.add("이순신");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");

		// ArrayList에 저장된 모든 엘리먼트 삭제하기
		//names.clear();

		// ArrayList에 저장된 엘리먼트 갯수 조회하기
		int len = names.size();
		System.out.println("저장된 갯수: " + len);

		/*
		// for문 사용시 size범위
		for (int i=0; i<names.size(); i++) {
			String username = names.get(i);
			System.out.println(username);
		}
		*/

		// ArrayList에 엘리먼트가 저장되어 있는지 확인하기
		boolean empty = names.isEmpty();
		if (!empty) {
			System.out.println("엘리먼트가 존재하는 AllayList다.");
		} else {
			System.out.println("비어있는 ArrayList다.");
		}

		for (String username : names) {
			System.out.println(username);
		}
	}
}