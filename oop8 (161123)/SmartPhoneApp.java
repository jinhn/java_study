public class SmartPhoneApp {
	public static void main(String[] args) {
/*	
		SmartPhone smart = new SmartPhone();
		smart.setTelNumber("010-3333-3333");
		smart.setCompany("LG U+");
		smart.setIp("192.168.0.1");

		smart.displayInfo();
*/
		SmartPhone smart = new SmartPhone("010-5555-5555", "LGU+", "192.168.0.2");
		smart.displayInfo();
	}
}