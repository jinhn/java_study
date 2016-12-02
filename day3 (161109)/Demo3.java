public class Demo3 {
	public static void main(String[] args) {
		// 삼항 연산자
		// 조건식 ? 참일때 연산식 혹은 값 : 거짓일때

		// 점수가 60점 이상이면 합격으로 판정
		int score = 67;
		String result1 = (score >= 60 ? "합격" : "불합격");
		System.out.println("결과: " + result1);

		// 구매금액이 50000원 이상이면 배송비가 무료
		int price = 25000;
		int result2 = (price >= 50000 ? price : price + 2500);
		System.out.println("결제금액: " + result2);
	}
}