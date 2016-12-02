public class StudentApp {

	public static void main(String[] args) {
		StudentService service = new StudentService();

		Student student1 = service.getStudentByNo(23);
		System.out.println(student1);
		System.out.println(student1.getNo()+", "+student1.getGrade()+", "+student1.getName()+", "+student1.getPhone());

		Student student2 = new Student(28, 4, "ÀÌ¼ø½É", "010-1234-5678");
		service.change(student2);
		System.out.println(student2.getNo()+", "+student2.getGrade()+", "+student2.getName()+", "+student2.getPhone());
	}
};