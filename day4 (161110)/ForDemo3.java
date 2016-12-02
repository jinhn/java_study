public class ForDemo3 {
	public static void main(String[] args) {
		// 1 ~ 10까지의 합을 계산하기
		// 명사찾기(만들어야할 변수) : 합
		int total = 0;

		for (int a=1; a<=10; a++) {
			total = total + a;
		}
		System.out.println("합: " + total);
	}
}