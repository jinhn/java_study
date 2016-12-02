public class Quizz3 {
	public static void main(String[] args) {
	
		String text = "abcdefghijklmnopqrstuvwxyz";
		text = text.toLowerCase();

		int [] arr = new int[26];

		for (int i=0; i<text.length(); i++) {
			int value = text.charAt(i) - 97;
			if (value >= 0) {
				arr[value]++;
			}
		}
		System.out.println(java.util.Arrays.toString(arr));

		for (int i=0; i<arr.length; i++) {
			System.out.println((char)(i+97) + " : " + arr[i]);
		}
	}
}