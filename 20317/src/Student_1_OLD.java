
public class Student_1_OLD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_1 kim = new Student_1();
		kim.school = "서울예술고";
		System.out.println("김: " + kim.school);
		
		Student_1 jang = new Student_1();
		Student_1 bak = new Student_1();
		Student_1 choi = new Student_1();
		System.out.println("최:" + choi.school);
		
		System.out.println("생성된 학생수는 " + Student_1.count);
		
	}

}
