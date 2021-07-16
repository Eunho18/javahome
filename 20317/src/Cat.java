
public class Cat extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상위 <==== 하위: 묵시적, Upcasting
		Animal cat = new Cat();
		cat.name = "미미";
		cat.toPrint();
		
		//하위 <== Upcasting 되었던 상위, 명시적
		Cat cat2 = (Cat)cat;
		cat2.toPrint();
		
	}

}
