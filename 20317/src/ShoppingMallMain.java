
public class ShoppingMallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingMall tv = new ShoppingMall("LG 678A");
		tv.addTotal(10);
		
		ShoppingMall mp3 = new ShoppingMall("아이리버 L123");
		mp3.addTotal(100);
		mp3.subTotal(1000);
	}

}
