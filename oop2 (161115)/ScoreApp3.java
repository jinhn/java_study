public class ScoreApp3 {
	public static void main(String[] args) {

		// 생성하자마자 이순신의 값이 들어감
		Score s = new Score("이순신", 40, 50, 60);

		int result1 = s.total();
		System.out.println("총점: " + result1);

		double result2 = s.average();
		System.out.println("평균: " + result2);
	}
}