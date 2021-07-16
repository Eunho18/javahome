
public class Student {
	//생성자 - 생략가능
	Student(String name, String hakbun, int age){
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
	}
	public Student() {
		
	} //기본 생성자
	
	//속성
	String name;
	String hakbun;
	int age;
	private String jumin;
	
	//메소드
	void printStudent(String name, String hakbun, int age) {
		System.out.println("학생이름: " + name);
		System.out.println("학번: " + hakbun);
		System.out.println("나이: " + age);
		
		
	}
	
	void printStudent() {
		System.out.println("학생이름:" + name);
		System.out.println("학번:" + hakbun);
		System.out.println("나이:" + age);
		
	}
}
