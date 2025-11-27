package student_Management_System;

public class Teacher {
	private String name;
	private String subject;
	long phno;
	private String password;
	
	Teacher(String name,String subject,long phno,String password){
		
		this.name = name;
		this.subject=subject;
		this.phno=phno;
		setPassword(password);
		System.out.println("Teacher added Sucessfully!");
		
	}
	
	public void displayTeacher() {
		
		System.out.println("Teacher Name : "+name);
		System.out.println("Teacher Subject : "+subject);
		System.out.println("Teacher Phone number : "+phno);
		
	}
	
	public void setPassword(String password) {
		
		this.password=password;
		
	
	}
//	
//	public String getPassWord() {
//		return password;
//	}
//	
	public void updateTeacher(String name,String subject,long phno,String password) {
		
		this.name = name;
		this.subject=subject;
		this.phno=phno;
		
	}
}
