public class ForDemo8 {
	public static void main(String[] args) {
		System.out.println("break.......");
		for (int i=1; i <=10; i++) {
			if (i%3 == 0) {
				break;
			}
			System.out.println(i);
		}

		// continue를 만나면 다음식들을 수행하지않고
		// 다시 for문으로 이동
		System.out.println("continue....");
		for (int i=1; i <=10; i++) {
			if (i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}