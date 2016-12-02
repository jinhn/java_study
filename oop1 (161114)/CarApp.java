public class CarApp {
	public static void main(String[] args) {
/*
	Car c
		Car라는 설계도를 사용해서 생성된 객체의 주소값을 담는 변수c를 만든다.
		Car타입(클래스타입=참조타입)의 변수 c(참조변수)를 만든다.
		클래스 변수 = new 클래스();

	new Car();
		Car설계도를 로드해서 객체를 생성하고,
		생성된 객체를 참조할 수 있는 주소값을 반환하는 코드다.

	Car c = new Car();
		Car설계도를 로드해서 객체가 생성하고,
		생성된 객체를 참조할 수 있는 주소값을 Car타입의 변수 c에 저장해라.
*/
		Car c = new Car();
		System.out.println(c);	// 출력: Car@15db9742
		Car c2 = new Car();		// 설계도@해시코드
		System.out.println(c2);	// 출력: Car@6d06d69c

		//생성된 객체의 필드, 생성된 객체의 메소드를 사용하기
		System.out.println(c.speed);
		c.speed = 10;
		System.out.println(c.speed);

		c.speedUp();
		System.out.println(c.speed);
	}
}