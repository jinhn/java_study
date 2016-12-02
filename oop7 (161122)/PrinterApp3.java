public class PrinterApp3 {
	public static void main(String[] args) {
		Printer p1 = new ColorPrinter();
		
		// p1참조변수는 ColorPrinter객체와 함께 생성된 Printer 객체를 참조중이다.
		// p1참조변수는 Printer객체의 필드/메소드를 실행할 수 있다.
		// p1참조변수는 ColorPrinter객체의 필드/메소드는 실행할 수 없다.
		// 단, ColorPrinter객체와 Printer객체에 재정의 관계에 있는 메소드가 있다면
		// p1참조변수로 ColorPrinter객체의 재정의된 메소드를 실행할 수 있다.

		p1.feed();			// Printer에 정의된 메소드
		p1.print("내용");	// Printer에 정의, ColorPrinter에 재정의
							// ----> ColorPrinter의 print(String text)가 실행

		// 코드 오류 발생 <-- p1참조변수로는 접근 불가
		//p1.dpi = 600;		// ColorPrinter에 정의된 필드
		//p1.chargeInk();	// ColorPrinter에 정의된 메소드

		// 객체의 강제 형변환
		ColorPrinter p2 = (ColorPrinter) p1;	// p1에서 ColorPrinter객체쪽으로 옯겨간다.
												// ColorPrinter객체의 참조값이 반환된다.
		p2.dpi = 600;
		p2.chargeInk();

		((ColorPrinter) p1).chargeInk();
	}
}