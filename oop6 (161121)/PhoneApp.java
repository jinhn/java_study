public class PhoneApp {
	public static void main(String[] args) {
		SmartPhone p = new SmartPhone();

		p.telNumber = "010-1234-5678";
		p.call("010-2222-2222");
		p.message("010-2121-2121", "�ȳ�");

		p.ip = "210.11.123.152";
		p.email = "hong@gmail.com";

		p.web("http://www.daum.net");
		p.sendEmail("lee@gmail.com", "������", "�����Դϴ�");

		FeaturePhone f = new FeaturePhone();
		f.telNumber = "010-4567-8901";
		f.call("010-1234-1234");
		f.message("010-1234-1234", "���������� ����");
		f.keypad();
	}
}