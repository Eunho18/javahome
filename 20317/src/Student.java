
public class Student {
	//������ - ��������
	Student(String name, String hakbun, int age){
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
	}
	public Student() {
		
	} //�⺻ ������
	
	//�Ӽ�
	String name;
	String hakbun;
	int age;
	private String jumin;
	
	//�޼ҵ�
	void printStudent(String name, String hakbun, int age) {
		System.out.println("�л��̸�: " + name);
		System.out.println("�й�: " + hakbun);
		System.out.println("����: " + age);
		
		
	}
	
	void printStudent() {
		System.out.println("�л��̸�:" + name);
		System.out.println("�й�:" + hakbun);
		System.out.println("����:" + age);
		
	}
}