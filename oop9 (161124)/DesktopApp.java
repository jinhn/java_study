public class DesktopApp {
	public static void main(String[] args) {
	
		//OpticalMouse m = new OpticalMouse();
		BallMouse m = new BallMouse();
		Desktop pc = new Desktop();

		pc.setMouse(m);

		pc.running();
		pc.painting();
		pc.cleaning();
	}
}