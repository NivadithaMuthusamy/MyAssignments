package org.college;

public class Student extends Department  {
	public void studentName() {
		System.out.println("The name of the student is Nivaditha");
	}
	public void studentDept() {
		System.out.println("The dept of the student is EEE");
	}
	public void studentId() {
		System.out.println("The Id of the student is 1224");
	}

	public static void main(String[] args) {
		Student stu=new Student();
		stu.CollegeName();
		stu.CollegeCode();
		stu.CollegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
	}

}


