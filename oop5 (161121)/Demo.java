package kr.co.jhta;

// * -> 해당 패키지의 모든 클래스만 import
import kr.co.l2.*;
import kr.co.l2.sub.*;
//import kr.co.l2.Employee;
//import kr.co.l2.sub.Family;

public class Demo {
	public static void main(String[] args) {
		System.out.println("패키지 데모 애플리케이션");

		Person p = new Person();
		p.setName("홍길동");
		System.out.println(p);
		System.out.println(p.getName());

		// Employee 클래스는 다른 패키지에 있기때문에
		// import 해줘야한다.
		Employee e = new Employee();
		System.out.println(e);

		Family f = new Family();
		System.out.println(f);
	}
}