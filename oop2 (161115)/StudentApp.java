public class StudentApp {
	public static void main(String[] args) {
		Student st = new Student();

		st.no = 1;
		st.name = "È«±æµ¿";
		st.kor = 80;
		st.eng = 70;
		st.math = 74;

		System.out.println("ÃÑÁ¡: " + st.total());
		System.out.println();
		System.out.println("Æò±Õ: " + st.avg());
		System.out.println();
		st.info();
		System.out.println();
		
		// ¸ðµç ÇÊµå¸¦ ÃÊ±âÈ­ÇÏ´Â »ý¼ºÀÚ
		Student st2 = new Student(2, "±èÀ¯½Å", 75, 60, 35);

		System.out.println("ÃÑÁ¡: " + st2.total());
		System.out.println();
		System.out.println("Æò±Õ: " + st2.avg());
		System.out.println();
		st2.info();
		System.out.println();
	}
}