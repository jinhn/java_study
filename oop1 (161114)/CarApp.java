public class CarApp {
	public static void main(String[] args) {
/*
	Car c
		Car��� ���赵�� ����ؼ� ������ ��ü�� �ּҰ��� ��� ����c�� �����.
		CarŸ��(Ŭ����Ÿ��=����Ÿ��)�� ���� c(��������)�� �����.
		Ŭ���� ���� = new Ŭ����();

	new Car();
		Car���赵�� �ε��ؼ� ��ü�� �����ϰ�,
		������ ��ü�� ������ �� �ִ� �ּҰ��� ��ȯ�ϴ� �ڵ��.

	Car c = new Car();
		Car���赵�� �ε��ؼ� ��ü�� �����ϰ�,
		������ ��ü�� ������ �� �ִ� �ּҰ��� CarŸ���� ���� c�� �����ض�.
*/
		Car c = new Car();
		System.out.println(c);	// ���: Car@15db9742
		Car c2 = new Car();		// ���赵@�ؽ��ڵ�
		System.out.println(c2);	// ���: Car@6d06d69c

		//������ ��ü�� �ʵ�, ������ ��ü�� �޼ҵ带 ����ϱ�
		System.out.println(c.speed);
		c.speed = 10;
		System.out.println(c.speed);

		c.speedUp();
		System.out.println(c.speed);
	}
}