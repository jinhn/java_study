public class Morning implements Car {
	// Car를 구현함으로 불필요한 메소드까지 구현해서
	// 코드가 지저분해짐
	public void on() {
		System.out.println("시동 켜기");
	}
	public void off() {
		System.out.println("시동 끄기");
	}
	public void run() {
		System.out.println("주행하기");
	}
	public void stop() {
		System.out.println("멈추기");
	}
	public void audio() {}
	public void navi() {}
	public void aircon() {}
	public void wiper() {}
}