public class ScoreApp1 {
	public static void main(String[] args) {
		
		Score s = new Score();

		s.name = "È«±æµ¿";
		s.kor = 80;
		s.eng = 85;
		s.math = 75;

		int result1 = s.total();
		System.out.println("ÃÑÁ¡: " + result1);

		double result2 = s.average();
		System.out.println("Æò±Õ: " + result2);
	}
}