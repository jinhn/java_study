/*
	StudentService��
	�л������� ����/��ȸ/����/�����ϴ� ����� �����ϴ� Ŭ�����̴�.
*/
public class StudentService {

	private Student[] db = new Student[5];

	public StudentService() {
		db[0] = new Student(23, 3, "ȫ�浿", "010-1111-1111");
		db[1] = new Student(25, 1, "������", "010-2222-1111");
		db[2] = new Student(27, 2, "������", "010-3333-1111");
		db[3] = new Student(28, 3, "�̼���", "010-4444-1111");
		db[4] = new Student(30, 4, "����", "010-5555-1111");
	}

	// �й��� ���޹޾Ƽ� �� �й��� �ش��ϴ� �л������� ��ȯ�ϴ� �޼ҵ�
	public Student getStudentByNo(int no) {
		Student result = null;

		for (Student s : db) {
			if (s.getNo() == no) {
				result = s;
				break;
			}
		}
		return result;
	}

	// �г��� ���޹޾Ƽ� �� �г⿡ �ش��ϴ� �л������� ��ȯ�ϴ� �޼ҵ�
	public Student[] getStudentsByGrade(int grade) {
		Student[] result = null;

		Student[] temp = new Student[db.length];
		int position = 0;
		for (Student st : db) {
			if (st.getGrade() == grade) {
				temp[position] = st;
				position++;
			}
		}

		result = new Student[position];
		for (int i=0; i<position; i++) {
			result[i] = temp[i];
		}
		return result;
	}

	// �л������� ���޹޾Ƽ� �� �й��� �ش��ϴ� �л������� ��ȯ�ϴ� �޼ҵ�
	public void change(Student stu) {
		for (int i=0; i<db.length; i++) {
			Student s = db[i];
			if (s.getNo() == stu.getNo()) {
				db[i] = stu;
			}
		}
	}
}