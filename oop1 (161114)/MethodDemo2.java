public class MethodDemo2 {

	public static void displayGugudan(int dan) {
		System.out.printf("%d�� �Դϴ�.\n", dan);
		for (int a=1; a<=9; a++) {
			System.out.printf("%d * %d = %d\n", dan, a, dan*a);
		}
		System.out.printf("\n");
	}

	public static void main(String[] args) {
		displayGugudan(8);

		displayGugudan(19);
	}
}