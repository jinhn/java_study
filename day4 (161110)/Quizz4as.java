import java.util.Scanner;
import java.util.Random;

public class Quizz4as {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	// 무인도행 : 두 주사위의 합이 7이면 무인도행
	// 무인도 탈출 : 같은 숫자 조합일때 탈출
	// 무인도 탈출 : 주사위를 3번 굴리면 탈출
	// 칸이동 : 무인도에 갇히지 않은 경우 주사위 합만큼 이동
	boolean island = false;	// false이면 자유 true이면 무인도
	int count = 3;			// 3번의 기회
	int distance = 0;		// 이동거리

		for (;;) {
			System.out.println("----------------------------");
			System.out.println("1. 주사위 굴리기     0. 종료");
			System.out.println("----------------------------");

			System.out.print("선택하세요: ");
			int no = sc.nextInt();

			if (no == 1) {
				int first = random.nextInt(6) + 1;		// 주사위 1
				int second = random.nextInt(6) + 1;		// 주사위 2
				System.out.printf("(%d, %d)\n", first, second);
				if (!island) {				// 무인도아닐때
					if (first + second == 7) {
						island = true;		// 무인도행
						count = 3;			// 탈출까지 3회 남음
						System.out.println("무인도입니다");

					} else {						// 주사위 합이 7이 아닌 경우
						distance += first + second; // 이동거리 증가
						System.out.println("이동거리: " + distance+ "칸");
						if (distance > 100) {		// 이동거리 100넘으면 끝
							System.out.println("끝. 수고하셨습니다");
							break;
						}
					}

				} else {					// 무인도일때
					if (first == second) {
						island = false;		// 무인도 탈출
						System.out.println("더블~! 탈출성공입니다");
					
					} else {					// 주사위가 다른 경우
						count--;				// 남은 횟수 1감소
						if (count == 0) {		// 남은 횟수가 0이면
							island = false;		// 무인도 탈출
							System.out.println("3일 휴식~! 탈출성공입니다");
						} else {
							System.out.println("탈출까지 ["+count+"]일 남았습니다");
						}
					}
				}

			} else {
				System.out.println("종료합니다.");
				break;
			}
		}	
	}
}