public class PhoneApp {
	public static void main(String[] args) {

		Phone p1 = new Phone();
		p1.setTelNumber("010-1111-1111");
		p1.setCompany("KT");

		Phone p2 = new Phone("010-2222-2222", "SKT");

		p1.displayInfo();
		p2.displayInfo();
	}
}