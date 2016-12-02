import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class AnniversaryCalcAs {
	public static void main(String[] args) throws ParseException {
	
		// args -> 명령행 인자
		System.out.println("args[0]" + args[0]);
		System.out.println("args[1]" + args[1]);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date day = sdf.parse(args[0]);
		long time = day.getTime();

		// 밀리세컨드이기 때문에 하루 = 초*분*시*1000
		long period = (long)Integer.parseInt(args[1]) * 60*60*24*1000;
		day.setTime(time + period);

		System.out.println("[" + args[1] + "]일째 되는 날: " + sdf.format(day));
	}
}