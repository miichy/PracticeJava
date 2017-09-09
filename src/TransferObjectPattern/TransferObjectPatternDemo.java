package TransferObjectPattern;

public class TransferObjectPatternDemo {
	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();

		for (StudentV0 student : studentBusinessObject.getAllStudents()) {
			System.out.println("Student:[ RollNo : " + student.getRollNo() + ",Name : " + student.getName() + "]");
		}

		// update student
		StudentV0 student = studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		studentBusinessObject.updateStudent(student);

		// get the student
		student = studentBusinessObject.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}

}
