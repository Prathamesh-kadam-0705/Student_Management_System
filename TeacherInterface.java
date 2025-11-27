package student_Management_System;

public interface TeacherInterface {
	
	void searchStud(String name);
	
	int searchStud(long phno);
	
	void displayStud(long phno);
	
	void displayClassRoom();
	
	void sortStudentByPercentage();
	
	void sortStudentByPhno();
	
	void sortStudentByName();
	
	void seperateGirlsAndBoys();
	
	void topper();
	
	void looser();
	
	void addAssingment(String title,String discription,String assingDate,String endDate);
	
	void displayAssingment(long phno);
	
	void removeAssingment(long phno,String sub);
	
	void removeAssingmentOfAllClass(String sub) ;
}
