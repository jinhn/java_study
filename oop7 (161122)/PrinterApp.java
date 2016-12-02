public class PrinterApp {
	public static void main(String[] args) {
		
		// 메소드 재정의
		// 상속관계에 있는 클래스들간의
		// 같은 사용방법을 가진 메소드들의 이름을 통일

		// 흑백 인쇄
		Printer p1 = new Printer();
		p1.feed();
		p1.print("이번주 금요일 영타대회...");
		System.out.println();

		// 컬러 인쇄
		ColorPrinter p2 = new ColorPrinter();
		p2.print("일욜날 찍은 사진");
		System.out.println();

		// 사진 인쇄
		PhotoPrinter p3 = new PhotoPrinter();
		p3.print("증명사진");
		System.out.println();

	}
}