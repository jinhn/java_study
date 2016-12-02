import java.util.*;

public class Baseballgame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		// 숫자도 같고 자리도 같으면 strike
		// 숫자는 같은데 자리가 다르면 ball
		// 아무 숫자도 같지 않으면 out
		// Tip! 2중 for문 사용, numbers outfor문 answer innerfor문
		//      숫자가 같을때 자리수까지 같은지 비교

		// 임의의 숫자 3개를 저장할 배열
		int[] numbers = new int[3];
		int position = 0;
		for (;;) {
			int number = ran.nextInt(10);
			boolean isExist = false;
			for (int i=0; i<position; i++) {
				if (numbers[i] == number) {
					isExist = true;
				}
			}
			if (!isExist) {
				numbers[position] = number;
				position++;
			}
			if (position == 3) {
				break;
			}
		}
		System.out.println(Arrays.toString(numbers));

		// 사용자가 입력한 답을 저장할 배열
		int[] answer = new int[3];

		boolean isSuccess = false;

		for (int a=1; a<=10; a++) { // 도전횟수
			int strike = 0;
			int ball = 0;
			// 여기를 구현할것

			if (strike == 3) {
				isSuccess = true;
				break;
			}
			
		}

		if (isSuccess) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
}