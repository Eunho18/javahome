
public class Student_1 {
	
	static String school = "ROBOT";
	private String name;
	private int grade;
	static int count;
	
	Student_1(){ //������
		count++;
	}
	//�޼ҵ�
	void print() {
		System.out.println(name + grade + "�г�");
		
	}
	//"2�г� ���ȣ", ���·� �����ϴ� �޼ҵ带 �����ε�
	
	//ĸ��ȭ ����
	//set : ���� �����ϴ�. �����Ѵ�.
	//get : ���� �ҷ��´�. �д´�.
	
	void setGrade(int grade) {
		if(grade > 3) {
			System.out.println("�г� ������ Ȯ���ϼ���");
			return;
		
	}
		
		this.grade = grade;
		
		
	}
	
	int getGrade() {
		return this.grade;
	}
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	
}
