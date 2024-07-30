public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		

		s1.setName("Krishna");
		s1.setAge(21);
		s1.setGrade('A');
		s1.setStudentId(123);	

		String s1_obj = s1.toString();	
		
		System.out.println(s1_obj); 
	}
	
}


class Student {
	String name;
	int age;
	int studentId;
	char grade;


	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setStudentId(int studentId){
		this.studentId = studentId;
	}

	public void setGrade(char grade){
		this.grade = grade;
	}


	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public int getStudentId(){
		return this.studentId;
	}

	public char getGrade(){
		return this.grade;
	}

	@Override
	public String toString() {
		
		return "[Student]{ name: " +this.name+ ", student_id: "+ this.studentId +", grade: "+ this.grade +", age: "+age+" } ";

	}

}