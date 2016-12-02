public class BallMouse implements Mouse, Cleanable {

	public void wheel() {
		System.out.println("ºù±Û ºù±Û");	
	}

	public void click() {
		System.out.println("Å¬¸¯ Å¬¸¯");
	}

	public void move() {
		System.out.println("¶¼±¼ ¶¼±¼");
	}

	public void clean() {
		System.out.println("BallÀÇ ¸ÕÁö Á¦°Å ¿Ï·á");
	}
}