package TransferObjectPattern;

public class StudentV0 {
	private String name;
	private int rollNo;
	
	StudentV0(String name,int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String getName(){
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
