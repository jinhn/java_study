import java.util.Random;

public class ForDemo9 {
	public static void main(String[] args) {
		// 주사위 만들기
		Random random = new Random();

		for (int i=1; i<=10; i++) {
			int first = random.nextInt(6) + 1;
			int second = random.nextInt(6) + 1;

			System.out.printf("(%d, %d)\n", first, second);
		}

	}
}