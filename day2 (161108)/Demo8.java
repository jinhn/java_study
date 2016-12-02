public class Demo8 {
	public static void main(String[] args) {
		// 수동 형변환
		
		// 자료의 손실이 발생하지만 정수로 변환
		int a = (int)3.14;
		System.out.println(a);

		double b = (double) 10;
		System.out.println(b);

		System.out.println((double) a);
		System.out.println((double) 24);

		System.out.println((char) 65);
		System.out.println((char) 66);
	}
}