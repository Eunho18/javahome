
public class Day06_�л����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.name = "ȫ�浿";
		s1.hakbun = "20317";
		s1.age = 18;
		
		
		//s1.printStudent(s1.name, s1.hakbun, 18);
		s1.printStudent();
		Student s2 = new Student();
		s2.name = "�ڵ���";
		s2.hakbun = "20310";
		s2.age = 18;
		s2.printStudent();
		
		//����° ģ�� 
		Student s3 = new Student("������", "20317", 20);
		s3.printStudent();
		
		//å���� �����ϰ� ����غ���
		Book myBook = new Book("����", "�ڰ渮", 30000);
		myBook.printBook();
		
		
		
	}

}
