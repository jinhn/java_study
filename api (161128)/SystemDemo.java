import java.util.*;

public class SystemDemo {
	public static void main(String[] args) {

		// 현재 시간정보 알아내기
		long time = System.currentTimeMillis();
		System.out.println(time);
		// ---------- 실행 ----------
		// 1480292432779
		// 출력 완료 (0초 경과) - 정상 종료

		// 1970년 1월 1일부터 지금까지의 시간을
		// 1/1000초로 환산하여 출력
		// 중복방지의 목적으로도 사용

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);

		// 시스템 환경변수값 조회하기
		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		String value2 = System.getenv("PATH");
		System.out.println(value2);

		// 시스템 프로퍼티값 조회하기
		// 현재 시스템의 줄바꿈문자 조회하기
		String newLineChar = System.getProperty("line.separator");
		System.out.println("abcd"+newLineChar+"efgh");
		// 사용하는 시스템이 다르더라도 줄바꿈 실행

		// 현재 시스템의 사용자 홈 디렉토리 조회하기
		String dir = System.getProperty("user.home");
		System.out.println(dir);

		// 프로그램 종료하기
		//System.exit(0);

		// 배열 복사하기
		String[] src = {"이순신", "강감찬", "김유신", "홍길동", "일지매", "임꺽정"};
		String[] dest = new String[10];

        /*
            System.arraycopy(src, srcPosition, dest, destPosition, length);
                src          : 원본 배열
                srcPosition  : 원본 배열에서 복사할 항목의 시작 위치
                dest         : 새 배열
                destPosition : 새 배열에서 복사할 항목을 붙여넣을 시작 위치
                length       : 원본 배열에서 복사할 항목의 갯수
        */
		
		System.arraycopy(src, 3, dest, 1, 2);

		System.out.println(Arrays.toString(dest));
		// [null, 홍길동, 일지매, null, null, null, null, null, null, null]
	}
}