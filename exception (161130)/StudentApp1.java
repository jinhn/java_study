import java.io.*;

public class StudentApp1 {
	public static void main(String[] args) throws Exception {
	
		BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
		String text = reader.readLine();

		String[] arr = text.split(",");
		
		Student st = new Student();

		st.setName(arr[0]);
		st.setGrade(arr[1]);
		int kor = Integer.parseInt(arr[2]);
		st.setKor(kor);
		int eng = Integer.parseInt(arr[3]);
		st.setEng(eng);
		int math = Integer.parseInt(arr[4]);
		st.setMath(math);
		
		System.out.println("��    ��: " + st.getName());
		System.out.println("��    ��: " + st.getGrade());
		System.out.println("��������: " + st.getKor() + "��");
		System.out.println("��������: " + st.getEng() + "��");
		System.out.println("��������: " + st.getMath() + "��");
	}
}