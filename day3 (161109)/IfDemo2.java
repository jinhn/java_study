public class IfDemo2 {
	public static void main(String[] args) {
		
		int score = 98;
		if (score >= 60) {
			System.out.println("합격입니다.");
			if (score >= 95) {
				System.out.println("장학금지급");
			}
		} else {
			System.out.println("불합격입니다.");
		}
	}
}