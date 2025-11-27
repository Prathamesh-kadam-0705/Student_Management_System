package student_Management_System;

public interface AdminInterface {
	
	void addStud(String name,String gender,long phno,double fees);
	
	void addStud(String name,String gender,long phno,double fees,String sname,String level,String performance,String summery);

	void addTeacher(String name,String subject,long phno,String password);
	
	void removeTeacher(long phno);
	
	int searchTeacher(long phno);
	
	void searchStud(String name);
	
	int searchStud(long phno);
	
	void displayStud(long phno);
	
	void displayLessAtendaceStud() ;
	
	void displayClassRoom();
	
	void removeStud(long phno);
	
	void sortStudentByPercentage();
	
	void sortStudentByPhno();
	
	void sortStudentByName();
	
	void seperateGirlsAndBoys();
	
	void topper();
	
	void looser();
	
	void paidFullFeeStud();
	
	void notPaidFeeStud();
	
}
