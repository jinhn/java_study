public class CalculatorApp {
	public static void main(String[] args) {
	 
	 Calculator c = new Calculator();
	 
	 int result1 = c.plus(2, 5);
	 System.out.println(result1);

	 int result2 = c.plus(2, 5, 4);
	 System.out.println(result2);
	}
}