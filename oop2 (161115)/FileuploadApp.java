public class FileuploadApp {
	public static void main(String[] args) {
		// �⺻
		Fileupload f1 = new Fileupload();
		f1.upload();
		System.out.println();
		
		// ����� ����
		Fileupload f3 = new Fileupload(1024*1024*500L);
		f3.upload();
		System.out.println();

		// ������ ����
		Fileupload f2 = new Fileupload(100);
		f2.upload();
		System.out.println();
		
		// ������, ���� �Ѵ� ����
		Fileupload f4 = new Fileupload(1024*1024*500L, 100);
		f4.upload();
		System.out.println();
	}
}