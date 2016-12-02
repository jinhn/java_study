public class Quizz5 {
	public static void main(String[] args) {
	
		String[] words = {"새끼", "놈", "년"};

		// 위에서 나열한 금칙어가 포함되어 있는지 여부 확인하기

		String text = "야 이새끼야";

		boolean isContain = false;

		for (String word : words) {
			boolean value = text.contains(word);
			if (value) {
				isContain = true;
			}
		}

		if (isContain) {
			System.out.println("게시할 수 없습니다.");
		}

		if (!isContain) {
			System.out.println("게시되었습니다.");
		}
	}
}