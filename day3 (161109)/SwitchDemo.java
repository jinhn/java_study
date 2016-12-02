public class SwitchDemo {
	public static void main(String[] args) {
		
		String grade = "Silver";

		switch (grade) {
		case "Gold":
			System.out.println("골드등급");
			break;
		case "Silver":
			System.out.println("실버등급");
			break;
		case "Bronze":
			System.out.println("브론즈등급");
			break;
		default:
			System.out.println("일반등급");
		}
	}
}