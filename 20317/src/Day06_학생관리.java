
public class Day06_학생관리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.hakbun = "20317";
		s1.age = 18;
		
		
		//s1.printStudent(s1.name, s1.hakbun, 18);
		s1.printStudent();
		Student s2 = new Student();
		s2.name = "박도원";
		s2.hakbun = "20310";
		s2.age = 18;
		s2.printStudent();
		
		//세번째 친구 
		Student s3 = new Student("최유진", "20317", 20);
		s3.printStudent();
		
		//책정보 생성하고 출력해보자
		Book myBook = new Book("토지", "박경리", 30000);
		myBook.printBook();
		
		
		
	}

}
