
public class Cat extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� <==== ����: ������, Upcasting
		Animal cat = new Cat();
		cat.name = "�̹�";
		cat.toPrint();
		
		//���� <== Upcasting �Ǿ��� ����, �����
		Cat cat2 = (Cat)cat;
		cat2.toPrint();
		
	}

}
