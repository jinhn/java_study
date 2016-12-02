public class ArrayDemo1 {
	public static void main(String[] args) {
		// 정수 5개를 가지고 있는 배열 만들기
		int[] numbers = {1, 5, 8, 10, 4};
		
		// 배열의 크기를 알아내기
		// numbers.length
		int size = numbers.length;
		System.out.println("배열의 크기: " + size);

		// 배열에서 값 가져오기
		// numbres[인덱스번호]
		int x = numbers[0];
		int y = numbers[1];
		System.out.println("배열의 0번째 값: " + x);
		System.out.println("배열의 1번째 값: " + y);
		
		// 모든 숫자의 합계를 구하기
		
		//int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
		//System.out.println("합계: " + sum);
		
		//int sum = 0;
		//sum += numbers[0];
		//sum += numbers[1];
		//sum += numbers[2];
		//sum += numbers[3];
		//sum += numbers[4];
		//System.out.println("합계: " + sum);
		
		//int sum = 0;
		//for (int i=0; i<=4; i++) {
		//	sum += numbers[i];
		//}
		//System.out.println("합계: " + sum);

		//int sum = 0;
		//for (int i=0; i<size; i++) {
		//	sum += numbers[i];
		//}
		//System.out.println("합계: " + sum);

		// enhanced for문
		int sum = 0;
		for (int i:numbers) {
			sum += i;
		}
		System.out.println("합계: " + sum);
	}
}