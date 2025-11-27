package student_Management_System;

public class Student {
	
	private Sport sport;
	String name;
	private int rollNo;
	String gender;
	double percentage=0;
	long phno;
	double fees;
	int atendance=0;
	private Assingment ass []=new Assingment[6];
	private int ct=0;
	
	boolean sportCheck;
	
	
	Student() {
		
	}
	
	Student(String name,String gender,long phno,double fees){
		
		this.name=name;
		this.gender=gender;
		this.phno=phno;
		this.fees=fees;	
	}
	
	
	Student(String name,String gender,long phno,double fees,String sname,String level,String performance,String summery){
		
		sport = new Sport(sname,level,performance,summery);
	
		this.name=name;
		this.gender=gender;
		this.phno=phno;
		this.fees=fees;
		sportCheck = true;
		
	}
	
	private void displayStudent() {
		
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Phone Number : "+phno);
		System.out.println("Fees : "+fees);
		System.out.println("Atendance : "+atendance);
		System.out.println("Percentage : "+percentage);
	}
	
	public void displayS() {
		
		System.out.println("Name : "+name+",  phone number : "+phno);
	}
	
	public void displayStud() {
		
		if (sportCheck) {
			displayStudent();
			sport.displaySport();
			
		}
		else {
			displayStudent();
		}
	}
	
	public void addAssignment(String tittle,String discription,String assingDate,String completeDate) {
		
		if (ct<6) {
			ass[ct] = new Assingment(tittle,discription,assingDate,completeDate);
			ct++;
		}
		else {
			System.out.println("You give the limited assingment!");
		}
	}
	
	public void removeAssigment(String subject) {
		
		int index = searchSubject(subject);
		if (index != -1) {
			for (int i = index; i < ct-1; i++) {
				ass[i]=ass[i+1];
			}
		
			ct--;
		}
	}
	
	public void displayAssingment() {
		
		if (ct>0) {
			for (int i = 0; i < ct; i++) {
				ass[i].DisplayAssingment();
			}
		} else {

			System.out.println("no assingment of this subject!");
		}
	}
	
	public int searchSubject(String subject) {
		
		for (int i = 0; i < ct; i++) {
			
			if (ass[i].title.equalsIgnoreCase(subject)) {
				return i;
			}
		}
		return -1;
	}
}
