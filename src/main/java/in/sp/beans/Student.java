package in.sp.beans;

public class Student {
	private int rollNo;
	private String name;
	private float marks;


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public float getMarks() {
		return marks;
	}
}
