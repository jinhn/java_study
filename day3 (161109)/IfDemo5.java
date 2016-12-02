import java.util.Scanner;

public class IfDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:커피(1500원) 2:과일주스(2000원) 3:이온음료(1000원)");
		
		System.out.print("돈을 넣으세요: ");
		int money = sc.nextInt();
		System.out.print("음료를 고르세요: ");
		int no = sc.nextInt();

		int returnCoin = 0;

		if (no == 1) {
			System.out.println("커피를 받아가세요");
			returnCoin = money - 1500;
		} else if (no == 2)	{
			System.out.println("과일주스를 받아가세요");
			returnCoin = money - 2000;
		} else if (no == 3)	{
			System.out.println("이온음료를 받아가세요");
			returnCoin = money - 1000;
		} else {
			System.out.println("잘못된 번호입니다");
		}
		System.out.println("거스름돈은 " + returnCoin + "원 입니다.");
	}
}