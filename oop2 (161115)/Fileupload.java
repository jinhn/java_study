public class Fileupload {

	long maxFileSize;
	int maxFileAmount;
	
	// 기본(디폴트 생성자)
	public Fileupload() {
		maxFileSize = 1024 * 1024 * 10; // 10M
		maxFileAmount = 10; // 10개
	}
	
	// 사이즈만 변경
	public Fileupload(long size) {
		maxFileSize = size;
		maxFileAmount = 10;
	}
	
	// 갯수만 변경
	public Fileupload(int amount) {
		maxFileSize = 1024 * 1024 * 10;
		maxFileAmount = amount;
	}
	
	// 사이즈, 갯수 둘다 변경
	public Fileupload(long size, int amount) {
		maxFileSize = size;
		maxFileAmount = amount;
	}

	public void upload() {
		System.out.println("파일 업로드 실행중.....");
		System.out.println("최대 파일크기: " + maxFileSize);
		System.out.println("최대 파일갯수: " + maxFileAmount);
	}
}