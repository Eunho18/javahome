
public class Student_1 {
	
	static String school = "ROBOT";
	private String name;
	private int grade;
	static int count;
	
	Student_1(){ //생성자
		count++;
	}
	//메소드
	void print() {
		System.out.println(name + grade + "학년");
		
	}
	//"2학년 김기호", 형태로 리턴하는 메소드를 오버로딩
	
	//캡슐화 구현
	//set : 값을 지정하다. 저장한다.
	//get : 값을 불러온다. 읽는다.
	
	void setGrade(int grade) {
		if(grade > 3) {
			System.out.println("학년 범위를 확인하세요");
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
