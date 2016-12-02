import java.io.*;
import java.text.*;

public class StudentApp2 {
	public static Student2 parse(String text) {
		
		Student2 s = new Student2();
		
		String[] arr = text.split(",");
		
		s.setName(arr[0]);
		s.setGrade(arr[1]);
		int kor = Integer.parseInt(arr[2]);
		s.setKor(kor);
		int eng = Integer.parseInt(arr[3]);
		s.setEng(eng);
		int math = Integer.parseInt(arr[4]);
		s.setMath(math);

		return s;
		
	}
	public static void main(String[] args) throws Exception {
		
		Student2[] students = new Student2[10];
		
		BufferedReader reader = new BufferedReader(new FileReader("score2.txt"));
		for (int i = 0; i < students.length; i++) {
			students[i] = parse(reader.readLine());
		}
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("이름\t학년\t국어점수\t영어점수\t수학점수\t총점\t평균");
		for (Student2 returnS : students) {
			System.out.printf("%s\t%s\t%d\t\t\t%d\t\t\t%d\t\t\t%d\t\t%s\n", returnS.getName(), returnS.getGrade(), returnS.getKor(), returnS.getEng(), returnS.getMath(), returnS.getTotal(), df.format(returnS.getAvg()));
		}
		
	}

}
