import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		// 기본자료형값을 저장하는 ArrayList만들기
		// 기본자료형 타입에 대응되는 Wrapper클래스 타입을 ArrayList의 타입으로 저장한다.
		// ArrayList<Integer>, ArrayList<Double>, ...
		
		// 정수를 여러개 저장하는 ArrayList만들기
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(12));
		numbers.add(23); // numbers.add(new Integer(23)); 오토박싱
		numbers.add(16); // numbers.add(new Integer(16)); 오토박싱
		numbers.add(5); // numbers.add(new Integer(5)); 오토박싱

		//Integer e1 = numbers.get(0);
		//Integer e2 = numbers.get(1);
		//Integer e3 = numbers.get(2);
		//Integer e4 = numbers.get(3);

		/*
			ArrayList에서 하나 꺼내면 Integer객체가 얻어지지만
			담는 변수가 int타입이면 자동으로 Integer객체에 저장된 정수값을 꺼낸다.
		*/

		int e1 = numbers.get(0); // int e1 <- x.intValue() <- Integer x = numbers.get(0);
		int e2 = numbers.get(1); // int e2 = numbers.get(1).intValue();
		int e3 = numbers.get(2); // int e3 = numbers.get(2).intValue();
		int e4 = numbers.get(3); // int e4 = numbers.get(3).intValue();

		System.out.println(e1 + ", " + e2 + ", " + e3 + ", " + e4); // 12, 23, 16, 5

		for (int num : numbers) {
			System.out.println(num);
		}
	}
}

/*
Integer a = new Integer(13);
Integer a = 13; // 객체 13
int b = a; // -> b에 숫자 13대입(Wrapper 벗겨짐)

ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(new Integer(12));
numbers.add(12); --> numbers.add(new Integer(12));
*/