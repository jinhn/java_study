public class DisplayChartApp {
	public static void main(String[] args) {
		
		// Chart ���� ��ü �����
		Chart c = new XLSChart();
		Chart c2 = new CloudChart();

		// Chart�� ��ü�� �����ؼ� Display��ü �����
		Display chartDisplay = new Display(c);
		Display chartDisplay2 = new Display(c2);

		// �׷��� �׸���
		chartDisplay.drawGraph();
		chartDisplay2.drawGraph();
	}
}