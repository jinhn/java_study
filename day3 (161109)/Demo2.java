public class Demo2 {
	public static void main(String[] args) {
		
		// 석차가 3등 이내이고, 점수가 4.3점 이상인 경우
		// 장학금 지급
		int ranking = 4;
		double score = 4.4;

		boolean result = (ranking <= 3 && score >= 4.3);
		System.out.println("결과: " + result);

		// 구매금액이 50만원 이상이거나
		// 단일 품목 하나의 금액이 20만원 이상인 경우
		// 상품권 지급
		int price1 = 18;
		int price2 = 18;
		int price3 = 18;

		int totalPrice = price1 + price2 + price3;

		boolean result2 = totalPrice >= 50
			|| price1 >= 20 || price2 >= 20 || price3 >= 20;
		System.out.println("결과: " + result2);
	}
}