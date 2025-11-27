package student_Management_System;

public class Assingment {

	
	String title;
	private String discription;
	private String assingDate;
	private String endDate;
	private boolean status = false;
	
	Assingment(){
		
	}
	
	Assingment(String title,String discription,String assingDate,String endDate){
		
		
		this.title=title;
		this.discription=discription;
		this.assingDate=assingDate;
		this.endDate=endDate;
		
		
	}
	
	public void DisplayAssingment() {
		
		System.out.println("Title : "+title);
		System.out.println("Discription : "+discription);
		System.out.println("Assing date : "+assingDate);
		System.out.println("End date : "+endDate);
		System.out.println("Status : "+status);
	}
}
