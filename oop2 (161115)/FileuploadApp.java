public class FileuploadApp {
	public static void main(String[] args) {
		// 기본
		Fileupload f1 = new Fileupload();
		f1.upload();
		System.out.println();
		
		// 사이즈만 변경
		Fileupload f3 = new Fileupload(1024*1024*500L);
		f3.upload();
		System.out.println();

		// 갯수만 변경
		Fileupload f2 = new Fileupload(100);
		f2.upload();
		System.out.println();
		
		// 사이즈, 갯수 둘다 변경
		Fileupload f4 = new Fileupload(1024*1024*500L, 100);
		f4.upload();
		System.out.println();
	}
}