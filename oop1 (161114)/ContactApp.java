public class ContactApp {
	public static void main(String[] args) {
		
		Contact c1 = new Contact();
		Contact c2 = new Contact();

		c1.no = 23;
		c1.name = "È«±æµ¿";
		c1.phoneNum = "010-1111-1111";
		c1.email = "hong@gmail.com";

		c2.no = 25;
		c2.name = "±èÀ¯½Å";
		c2.phoneNum = "010-2222-2222";
		c2.email = "kim@gmail.com";

		c1.call();
		c2.call();

		/*
		Contact[] contacts = new Contact[10];
		contacts[0] = c1;
		contacts[1] = c2;
		*/
	}
}