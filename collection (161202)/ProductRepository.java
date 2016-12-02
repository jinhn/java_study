import java.util.ArrayList;

public class ProductRepository {
	
	ArrayList<Product> db = new ArrayList<Product>();

	// 새로운 상품객체를 전달받아서 미리 생성한 ArrayList에 저장하는 메소드
	public void addProduct(Product item) {
		db.add(item);
	}

	// 상품이름을 전달받아서 ArrayList에서 그 상품이름에 해당하는 상품을 찾아서 반환하는 메소드
	public Product findProduct(String name) {
		Product result = null;

		return result;
	}

	// ArrayList에 저장된 모든 상품정보를 출력하는 메소드
	public void displayProducts() {
		for (Product pro : db) {
			System.out.printf("%d %s\n", pro.getNo(), pro.getName());
		}
	}
}
/*
등록
1. 입력값을 하나씩 읽어오기
2. 입력값을 다 담을수 있는 객체 생성
3. 입력값을 생성한 객체에 setter를 이용해서 담기
4. 값이 담긴 객체를 DB에 저장해주는 메소드에 전달하기
조회
1. 입력한 값을 읽어오기
2. DB에서 상품을 찾아주는 메소드에게 입력값을 전달하기 
*/