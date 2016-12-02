public class Demo1 {
	public static void main(String[] args) {
		// 논리 연산자
		int x = 10;
		int y = 10;
		
		// &&는 좌변이 false이면
		// 우변을 평가하지 않고
		// 바로 전체 결과를 false로 판정
		boolean result1 = false && x++ > 10;
		boolean result2 = false & y++ > 10;
		System.out.println(result1); // false
		System.out.println(result2); // false
		System.out.println("x: " + x); // 10
		System.out.println("y: " + y); // 11
	}
}