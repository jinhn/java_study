public class Quizz5 {
	public static void main(String[] args) {
	
		String[] words = {"����", "��", "��"};

		// ������ ������ ��Ģ� ���ԵǾ� �ִ��� ���� Ȯ���ϱ�

		String text = "�� �̻�����";

		boolean isContain = false;

		for (String word : words) {
			boolean value = text.contains(word);
			if (value) {
				isContain = true;
			}
		}

		if (isContain) {
			System.out.println("�Խ��� �� �����ϴ�.");
		}

		if (!isContain) {
			System.out.println("�ԽõǾ����ϴ�.");
		}
	}
}