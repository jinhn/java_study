public class Quizz2 {
	// �Ӽ�
	int number;
	int[] array = new int[3];
	// ���
	public boolean include() {
		boolean result = false;
		for (int a=0; a<3; a++) {
			if (array[a] == number)	{
				result = true;
			}
		}
		return result;
	}
}