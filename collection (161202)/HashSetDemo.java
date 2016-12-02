import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		// ¸Ş´ºÀÌ¸§À» ÀúÀåÇÏ´Â HashSet°´Ã¼ ¸¸µé±â
		HashSet<String> menuset = new HashSet<String>();

		boolean r = false;
		r = menuset.add("Ã»±¹Àå");
		System.out.println("Ã»±¹Àå   -> " + r); // true
		menuset.add("µÈÀåÂî°³");
		menuset.add("µÎºÎÁ¶¸²");
		menuset.add("ÇÑ¿ìÀ°°³Àå");
		menuset.add("È²ÅÂÁ¶¸²");
		menuset.add("Á¦À°ººÀ½");
		menuset.add("Á¦À°ººÀ½");
		menuset.add("Á¦À°ººÀ½");
		r = menuset.add("Á¦À°ººÀ½");
		System.out.println("Á¦À°ººÀ½ -> " + r); // false

		int len = menuset.size();
		System.out.println("ÀúÀåµÈ °¹¼ö: " + len); // 6

		for (String menu : menuset) {
			System.out.println(menu);
		}
	}
}