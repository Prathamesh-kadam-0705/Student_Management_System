package student_Management_System;

public class Sport {
	private String name;
	private String level;
	private String performance;
	private String summery;
	
	private Sport(){
		
	}
	
	Sport(String name,String level,String performance,String summery){
		
		this.name=name;
		this.level=level;
		this.performance=performance;
		this.summery=summery;
		
		System.out.println(name +" sport added Sucessfully!");
	}
	
	public void displaySport() {
		
		System.out.println("Sport name : "+name);
		System.out.println("Sport level : "+level);
		System.out.println("Sport Performance : "+performance);
		System.out.println("Sport Summery : "+summery);
	}
}
