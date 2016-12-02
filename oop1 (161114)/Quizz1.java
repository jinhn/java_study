public class Quizz1 {

	public static int max(int[] numbers) {
		int maxNum = 0;
		for (int a=0; a<numbers.length; a++) {
			if (numbers[a] > maxNum) {
				maxNum = numbers[a];
			}
		}
		return maxNum;
	}
}