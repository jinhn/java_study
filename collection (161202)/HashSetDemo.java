import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		// �޴��̸��� �����ϴ� HashSet��ü �����
		HashSet<String> menuset = new HashSet<String>();

		boolean r = false;
		r = menuset.add("û����");
		System.out.println("û����   -> " + r); // true
		menuset.add("�����");
		menuset.add("�κ�����");
		menuset.add("�ѿ�������");
		menuset.add("Ȳ������");
		menuset.add("��������");
		menuset.add("��������");
		menuset.add("��������");
		r = menuset.add("��������");
		System.out.println("�������� -> " + r); // false

		int len = menuset.size();
		System.out.println("����� ����: " + len); // 6

		for (String menu : menuset) {
			System.out.println(menu);
		}
	}
}