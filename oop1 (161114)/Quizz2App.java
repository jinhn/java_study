public class Quizz2App {

	public static void main(String[] args) {
		Quizz2 a = new Quizz2();

		a.array[0] = 1;
		a.array[1] = 2;
		a.array[2] = 3;

		a.number = 4;

		if (a.include() == true) {
			System.out.println(a.number+" 포함");
		} else {
			System.out.println(a.number+" 없음");
		}	
	}
}