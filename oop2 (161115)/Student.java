public class Student {

	int no; // 학번
	String name;
	int kor;
	int eng;
	int math;

	// 기본 생성자
	public Student() {
	
	}
	// 모든 필드를 초기화하는 생성자
	public Student(int a, String b, int c, int d, int e) {
		no = a;
		name = b;
		kor = c;
		eng = d;
		math = e;
	}
	// 총점을 반환하는 기능 -> total
	public int total() {
		int value = kor + eng + math;
		return value;
	}
	// 평균을 반환하는 기능 -> avg
	public double avg() {
		double value = total()/3.0;
		return value;
	}
	// 학생정보를 출력하는 기능(총점과 평균도 포함) -> info
	public void info() {
		System.out.println("######학생정보######");
		System.out.println("학    번: " + no);
		System.out.println("이    름: " + name);
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("총    점: " + total());
		System.out.println("평    균: " + avg());
		System.out.println("####################");
	}
}