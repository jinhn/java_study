public class MemberApp {
	public static void main(String[] args) {
	
		// 회원정보를 담기위한 Member 객체를 생성하고
		Member m = new Member();

		// setter를 사용해서 이름, 아이디, 비번, 나이 등의 데이터를 객체에 저장하기
		m.setName("홍길동");
		m.setId("hong");
		m.setPassword("h1234");
		m.setAge(24);

		// 생성된 Member객체에 저장된 값을 getter함수를 사용해서 화면에 출력하기
		System.out.println("이    름: " + m.getName());
		System.out.println("아 이 디: " + m.getId());
		System.out.println("패스워드: " + m.getPassword());
		System.out.println("나    이: " + m.getAge());
	}
}