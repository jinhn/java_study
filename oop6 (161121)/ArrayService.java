public class ArrayService {
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	// 배열 이동시키기
	// arr1배열에서 no를 찾아서 한칸씩 왼쪽으로, no는 맨 뒤로
	public int[] move(int no) {
		int temp = arr1[no-1];
		for (int i=no-1; i<9; i++) {
			arr1[i] = arr1[i+1];
		}
		arr1[9] = temp;
		return arr1;
	}

	// 배열 복사하기
	// arr2배열에서 지정된 위치부터 끝까지 복사한 배열을 반환하기
	// begin 3 이면 3부터 끝까지 새로운 배열 반환
	public int[] copy(int begin) {
		int position = 0;
		int[] temp = new int[11-begin];
		for (int i=begin-1; i<10; i++) {
			temp[position] = arr2[i];
			position++;
		}
		return temp;
	}

	// 배열 잘라내기
	// arr3배열을 지정된 위치부터 지정된 위치까지 복사한배열을 반환하기
	public int[] copy(int begin, int end) {
		int position = 0;
		int[] result = new int[end-begin+1];
		for (int i=begin-1; i<end; i++) {
			result[position] = arr3[i];
			position++;
		}
		return result;
	}

	// 다하면
	// arr4 (5, 2)이면 5를 2칸 왼쪽으로 이동
	public int[] shift(int begin, int step) {
		int temp = arr4[begin-1];
		for (int i=begin-1; i>=begin-step; i--) {
			arr4[i] = arr4[i-1];
		}
		arr4[begin-step-1] = temp;
		return arr4;

	}
}