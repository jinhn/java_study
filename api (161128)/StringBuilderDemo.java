public class StringBuilderDemo {
	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder();
		//sb.append("�߾�HTA�п� ");
		//sb.append("���԰��� �ȳ�");
		//sb.append("\n");
		//sb.append("��������ǥ�������ӿ�ũ ����, ");
		//sb.append("SW �������α׷� ������ ����, ");
		//sb.append("�����Ⱓ(��):");
		//sb.append(120);

		sb.append("�߾�HTA�п� ")
		  .append("���԰��� �ȳ�")
		  .append("\n")
		  .append("��������ǥ�������ӿ�ũ ����, ")
		  .append("SW �������α׷� ������ ����, ")
		  .append("�����Ⱓ(��):")
		  .append(120);

		String text = sb.toString();
		System.out.println(text);
	}
}