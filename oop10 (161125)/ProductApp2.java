public class ProductApp2 {

	public static void main(String[] args) {
	
		Product p1 = new Product("연필", 500);
		Product p2 = new Product("연필", 500);

		// ==과 equals(Object o)는 같은 객체인지 비교
		boolean result1 = (p1 == p2);
		boolean result2 = p1.equals(p2);
		System.out.println("==     비교: " + result1);
		System.out.println("equals 비교: " + result2);
		// ==     비교: false
		// equals 비교: false

		// 해시코드값 조회
		int value1 = p1.hashCode();
		int value2 = p2.hashCode();
		System.out.println("해시코드값: " + value1);
		System.out.println("해시코드값: " + value2);
		// 해시코드값: 366712642
		// 해시코드값: 1829164700

		//toString
		String str1 = p1.toString();
		String str2 = p2.toString();
		System.out.println("객체 정보: " + str1);
		System.out.println("객체 정보: " + str2);
		// 객체 정보: Product@15db9742
		// 객체 정보: Product@6d06d69c
		
		System.out.println(p1); // System.out.println(p1.toString());
		System.out.println(p2); // System.out.println(p2.toString());
		// Product@15db9742
		// Product@6d06d69c
	}
}