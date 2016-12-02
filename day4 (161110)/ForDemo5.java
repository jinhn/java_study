public class ForDemo5 {
	public static void main(String[] args) {
		// break
		// 원하는 값을 찾았을 경우 break로 탈출가능
		// 코드의 실행속도 향상
		for (int i=0; i<10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}

	}
}