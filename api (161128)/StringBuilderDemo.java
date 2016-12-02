public class StringBuilderDemo {
	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder();
		//sb.append("중앙HTA학원 ");
		//sb.append("정규과정 안내");
		//sb.append("\n");
		//sb.append("전자정부표준프레임워크 과정, ");
		//sb.append("SW 응용프로그램 개발자 과정, ");
		//sb.append("수강기간(일):");
		//sb.append(120);

		sb.append("중앙HTA학원 ")
		  .append("정규과정 안내")
		  .append("\n")
		  .append("전자정부표준프레임워크 과정, ")
		  .append("SW 응용프로그램 개발자 과정, ")
		  .append("수강기간(일):")
		  .append(120);

		String text = sb.toString();
		System.out.println(text);
	}
}