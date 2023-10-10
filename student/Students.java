package org.student;

public class Students {
	

	public void StudentInfo(int a) {
		System.out.println("Student Id="+a);
	}
	public void StudentInfo(int a,String n) {
		System.out.println("Student Id and name="+(a+n));
	}
	public void StudentInfo(String n,long s) {
		System.out.println("Student email and phone number="+(n+s));
	}

	public static void main(String[] args) {
		Students stu=new Students();
		stu.StudentInfo(1224);
		stu.StudentInfo(1224, "Nivaditha");
		stu.StudentInfo("mnivaditha@gmail.com", 7904664489l);
		

	}

}
