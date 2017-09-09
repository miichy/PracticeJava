package TransferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
	List<StudentV0> students;
	
	public StudentBO(){
		students = new ArrayList<StudentV0>();
		StudentV0 student1 = new StudentV0("Robert",0);
		StudentV0 student2 = new StudentV0("John",1);
		students.add(student1);
		students.add(student2);
	}
	
	public void deleteStudent(StudentV0 student){
		students.remove(student.getRollNo());
		System.out.println("Student : Roll No " + student.getRollNo());
	}
	
	public List<StudentV0> getAllStudents(){
		return students;
	}
	
	public StudentV0 getStudent(int rollNo){
		return students.get(rollNo);
	}
	
	public void updateStudent(StudentV0 student){
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo());
	}

}
