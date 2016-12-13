package file.read;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ScoreApp {

	public static void main(String[] args) throws Exception {
		
		ArrayList<Score> scoreList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("score.txt");
		FileOutputStream fos2 = new FileOutputStream("score2.txt");
		// 파일명 뒤에 true를 쓰면 이어쓸 수 있다.
		
		// 1.성적정보 등록  2.성적정보 파일로 저장  0.종료
		while (true) {
			System.out.println("1.성적정보 등록  2.성적정보 파일로 저장  3.성적순으로 저장  0.종료");
			int menu = Integer.parseInt(sc.nextLine());
			
			if (menu == 1) {
				// 이름, 국어, 영어, 수학점수를 입력받아서 Score객체에 담고 ArrayList에 저장
				Score person = new Score();
				
				System.out.println("이름 입력: ");
				person.setName(sc.nextLine());
				System.out.println("국어점수 입력: ");
				person.setKor(Integer.parseInt(sc.nextLine()));
				System.out.println("영어점수 입력: ");
				person.setEng(Integer.parseInt(sc.nextLine()));
				System.out.println("수학점수 입력: ");
				person.setMath(Integer.parseInt(sc.nextLine()));
				
				scoreList.add(person);
				
			} else if (menu == 2) {
				// ArrayList에 저장된 성적정보를 파일로 기록하기
				// ex. 홍길동^80^60^30
				for (Score person : scoreList) {
					
					String name = person.getName();
					int kor = person.getKor();
					int eng = person.getEng();
					int math = person.getMath();
					
					String text = name + "^" + kor + "^" + eng + "^" + math + System.lineSeparator();
					byte[] bytes = text.getBytes();
					fos.write(bytes);
				}
				fos.close();
			} else if (menu == 3) {
				// 성적순 정렬해서 파일로 저장
				Comparator<Score> com = new Comparator<Score>() {
					public int compare(Score s1, Score s2) {
						return s2.getTotal() - s1.getTotal();
					}
				};
				
				Collections.sort(scoreList, com);
				
				// 람다표현식
				//Collections.sort(scoreList, (s1, s2) -> s2.getTotal() - s1.getTotal());
				
				for (Score person : scoreList) {
					String name = person.getName();
					int kor = person.getKor();
					int eng = person.getEng();
					int math = person.getMath();
					int total = person.getTotal();
					
					String text = name + "^" + kor + "^" + eng + "^" + math + "^" + total + System.lineSeparator();
					byte[] bytes = text.getBytes();
					fos2.write(bytes);
				}
				fos2.close();
			} else if (menu == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}