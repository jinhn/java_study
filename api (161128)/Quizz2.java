public class Quizz2 {
	public static void main(String[] args) {
	
		String text = "<hong@naver.com>,<kim@hanmail.com>,<kang@naver.com>,<yushin@daum.net>";

		String[] emails = text.split(",");

		for (String mail : emails) {
			int beginIndex = mail.indexOf("<");
			int endIndex = mail.indexOf(">");
			mail = mail.substring(beginIndex+1, endIndex);
			System.out.println(mail);
		}

//		for (String mail : emails) {
//			mail = mail.substring(1, mail.length()-1);
//			System.out.println(mail);
//		}

//		for (String mail : emails) {
//			mail = mail.replace("<", "").replace(">", "");
//			System.out.println(mail);
//		}

	}
}