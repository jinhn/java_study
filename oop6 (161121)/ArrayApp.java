public class ArrayApp {
	public static void main(String[] args) {

		ArrayService as = new ArrayService();

		int[] nums1 = as.move(3);
				for (int i=0; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		System.out.println();

		int[] nums2 = as.copy(5);
		for (int i=0; i<nums2.length; i++) {
			System.out.println(nums2[i]);
		}
		System.out.println();

		int[] nums3 = as.copy(2, 9);
		for (int i=0; i<nums3.length; i++) {
			System.out.println(nums3[i]);
		}
		System.out.println();

		int[] nums4 = as.shift(5, 2);
		for (int i=0; i<nums4.length; i++) {
			System.out.println(nums4[i]);
		}
		System.out.println();
	}
}