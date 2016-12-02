public class Tico extends CarAdapter {
	// CarAdapter를 상속받음으로
	// Car의 불필요한 메소드를 구현하지않아도 된다.
	public void run() {
		System.out.println("주행하기");
	}
	public void stop() {
		System.out.println("멈추기");
	}
}