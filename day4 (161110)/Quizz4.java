import java.util.Scanner;
import java.util.Random;

public class Quizz4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	// 무인도행 : 두 주사위의 합이 7이면 무인도행
	// 무인도 탈출 : 같은 숫자 조합일때 탈출
	// 무인도 탈출 : 주사위를 3번 굴리면 탈출
	// 칸이동 : 무인도에 갇히지 않은 경우 주사위 합만큼 이동
	int island = 0; // 0이면 자유 1이면 무인도
	int count = 3; // 3번의 기회
	int condition = 0; // 현재상태
	int conditionMax = 0; // 누적이동거리
	int distance = 50; // 남은이동거리

		for (;;) {
			System.out.println("----------------------------");
			System.out.println("1. 주사위 굴리기     0. 종료");
			System.out.println("----------------------------");

			System.out.print("선택하세요: ");
			int no = sc.nextInt();

			if (no == 1) {
				int first = random.nextInt(6) + 1;
				int second = random.nextInt(6) + 1;
			//	System.out.printf("(%d, %d)\n", first, second);
				if (island == 0) { // 무인도아닐때
					if (first + second == 7) {
						count = 3;
						island = 1;
						System.out.println("무인도입니다");

					} else if (first + second != 7)	{
						condition = first + second;
						conditionMax = conditionMax + condition;
						distance = distance - condition;
						System.out.printf("%d칸 이동하세요 \n", condition);
						System.out.printf("%d칸 이동했습니다 \n", conditionMax);
						System.out.printf("%d칸 남았습니다 \n", distance);
						if (distance <= 0) {
							System.out.println("끝. 수고하셨습니다");
							break;
						}
					}

				} else if (island == 1) { // 무인도일때
					if (first == second) {
						island = island -1;
						System.out.println("탈출성공입니다");
					
					} else if (first != second)	{
						if (count == 1) {
							island = island - 1;
							count = 3;
							System.out.println("탈출성공입니다");
						} else if (count != 1) {
							count = count -1;
							System.out.println("다시 던지세요");
						}
					}
				}

			} else if (no == 0) {
				System.out.println("종료합니다.");
				break;
			}
		}	
	}
}