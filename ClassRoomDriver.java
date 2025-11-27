package student_Management_System;
import java.util.Scanner;

public class ClassRoomDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ClassRoom cr = new ClassRoom();
		
		final long ADMIN_ID = 1234567890l;
        final String ADMIN_PASS = "1234";
		
		while (true) {
			
			System.out.println("\n===== LOGIN PAGE =====");
            System.out.println("1. Admin Login");
            System.out.println("2. Teacher Login");
            System.out.println("3. Student Login");
            System.out.println("0. EXIT");
            System.out.print("Enter choice: ");
            int loginChoice = sc.nextInt();
            sc.nextLine();
            
            int chance =3;
            do {
            	 System.out.print("Enter User id: ");
                 long user = sc.nextLong();
                 sc.nextLine();
                 System.out.print("Enter Password: ");
                 String pass = sc.nextLine();
            	
                 switch (loginChoice) {

                //Admin
                 case 1: {
               	  if (user==ADMIN_ID&&pass.equals(ADMIN_PASS)) {
   					System.out.println("Admin login sucessfully!");
   					AdminInterface ai = cr;
   					adminMenu(sc, ai,user);
   					chance=0;
               	  }
               	  else {
               		  System.out.println("Some thing is wrong");
               		  chance--;
               	  }
                     break;
                 }

                 // TEACHER LOGIN 
                 case 2: {
                	
                	 TeacherInterface ti = cr.loginTeacher(user, pass);
                     if (ti!=null) {
						
                    	 System.out.println("Teacher login Sucessfully!");
                    	
                    	 teacherMenu(sc,ti);
                    	 chance =0;
					}
                     else {
                    	 System.out.println("Some thing is wrong");
                  		  chance--;
                     }
                    
                     
                     break;
                 }

                 // STUDENT LOGIN
                 case 3: {
                	 
                	 StudentInterface si = cr.loginStudent(user, pass);
                	 if (si!=null) {
 						
                    	 System.out.println("Student login Sucessfully!");
                    	
                    	 studentMenu(sc,si,user);
                    	 chance =0;
					}
                     else {
                    	 System.out.println("Some thing is wrong");
                  		  chance--;
                     }
                   
                     break;
                 }

                 case 0:
                     System.out.println("Program Closed.");
                     return;


                 default:
                	 chance =0;
                     System.out.println("Invalid choice.");
             }
			} while (chance >0);
		}
	}
	
	 public static void adminMenu(Scanner sc, AdminInterface ai,long phno) {

	        while (true) {
	            System.out.println("\n===== ADMIN MENU =====");
	            System.out.println("1. Add Student");
	            System.out.println("2. Add Student With Sport");
	            System.out.println("3. Add Teacher");
	            System.out.println("4. Remove Teacher");
	            System.out.println("5. Remove Student");
	            System.out.println("6. Search Teacher");
	            System.out.println("7. Search Student");
	            System.out.println("8. Student Details");
	            System.out.println("9. Display Classroom");
	            System.out.println("10. More");
	            System.out.println("0. Logout");

	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();
	            sc.nextLine();

	            switch (ch) {
	                case 1: {
	                    System.out.print("Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Gender: ");
	                    String gender = sc.nextLine();
	                    System.out.print("Phone: ");
	                    long ph = sc.nextLong();
	                    System.out.print("Fees: ");
	                    double fees = sc.nextDouble();
	                    ai.addStud(name, gender, ph, fees);
	                    break;
	                }
	                case 2: {
	                    System.out.print("Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Gender: ");
	                    String gender = sc.nextLine();
	                    System.out.print("Phone: ");
	                    long ph = sc.nextLong();
	                    System.out.print("Fees: ");
	                    double fees = sc.nextDouble();
	                    sc.nextLine();
	                    System.out.print("Sport Name: ");
	                    String sname = sc.nextLine();
	                    System.out.print("Level: ");
	                    String level = sc.nextLine();
	                    System.out.print("Performance: ");
	                    String performance = sc.nextLine();
	                    System.out.print("Summary: ");
	                    String summary = sc.nextLine();
	                    ai.addStud(name, gender, ph, fees, sname, level, performance, summary);
	                    break;
	                }
	                case 3: {
	                    System.out.print("Teacher Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Subject: ");
	                    String subject = sc.nextLine();
	                    System.out.print("Phone: ");
	                    long ph = sc.nextLong();
	                    sc.nextLine();
	                    System.out.print("Password: ");
	                    String pass = sc.nextLine();
	                    ai.addTeacher(name, subject, ph, pass);
	                    break;
	                }
	                case 4: {
	                    System.out.print("Enter phone to remove Teacher: ");
	                    long ph = sc.nextLong();
	                    ai.removeTeacher(ph);
	                    break;
	                }
	                case 5: {
	                    System.out.print("Enter phone to remove student: ");
	                    long ph = sc.nextLong();
	                    ai.removeStud(ph);
	                    break;
	                }
	                case 6: {
	                    System.out.print("Enter phone to Search Teacher: ");
	                    long ph = sc.nextLong();
	                    ai.searchTeacher(ph);
	                    break;
	                }
	                case 7: {
	                	System.out.println("1. Search by Phone Number");
	                	System.out.println("2. Search by name");
	                    System.out.print("Enter choise : ");
	                    int search = sc.nextInt();
	                    if (search ==1) {
	                    	System.out.print("Enter phone to Search student: ");
	 	                    long ph = sc.nextLong();
	 	                    ai.searchStud(ph);
						}else if(search ==2){
							System.out.print("Enter Name to Search student: ");
	 	                    String name = sc.nextLine();
	 	                    ai.searchStud(name);
						}else {
							System.out.println("Invalid choise!");
						}
	                    break;
	                }
	                case 8: {
	                    System.out.print("Enter phone to get student data: ");
	                    long ph = sc.nextLong();
	                    ai.displayStud(ph);
	                    break;
	                }
	                case 9:{
	                    ai.displayClassRoom();
	                    break;
	                }
	                case 10:{
	                	
	                	while (true) {
	                		System.out.println("1. Topper");
		                	System.out.println("2. Looser");
		                	System.out.println("3. Sort Student by Percentage");
		                	System.out.println("4. Sort Student by phone number");
		                	System.out.println("5. Sort Student by Name");
		                	System.out.println("6. Segrigate Girls and Boys");
		                	System.out.println("7. Full fee paid Student");
		                	System.out.println("8. Not fee paid Student");
		                	System.out.println("0. Exit");
		                	
		                	System.out.println("Enter choice: ");
		                	int more = sc.nextInt();
		                	
		                	switch (more) {
							case 1:

								ai.topper();
								break;
							case 2:
								
								ai.looser();
								break;
							case 3:
								ai.sortStudentByPercentage();
								break;

							case 4:
								ai.sortStudentByPhno();
								break;
							case 5:
								ai.sortStudentByName();
								break;
							case 6:
								ai.seperateGirlsAndBoys();
								break;
							case 7:
								ai.paidFullFeeStud();
								break;
							case 8:
								ai.notPaidFeeStud();
								break;
							case 0:
								
								return;
							default:
								 System.out.println("Invalid choice!");
							}
						}
	                	
	                }
	                

	                case 0:
	                    System.out.println("Admin Logged Out.");
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }

	    // ======================= TEACHER MENU ========================
	    public static void teacherMenu(Scanner sc, TeacherInterface ti) {

	        while (true) {
	            System.out.println("\n===== TEACHER MENU =====");
	            System.out.println("1. Add Assignment to All Students");
	            System.out.println("2. Display Student Assignment");
	            System.out.println("3. Remove Assignment of Student");
	            System.out.println("4. Remove Assignment of all class");
	            System.out.println("5. Display Classroom");
	            System.out.println("6. Display Student");
	            System.out.println("7. Search Student");
	            System.out.println("8. Search Student");
	            System.out.println("9. more");
	            System.out.println("0. Logout");

	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();
	            sc.nextLine();

	            switch (ch) {
	                case 1: {
	                    System.out.print("Title: ");
	                    String title = sc.nextLine();
	                    System.out.print("Description: ");
	                    String desc = sc.nextLine();
	                    System.out.print("Assign Date: ");
	                    String ad = sc.nextLine();
	                    System.out.print("End Date: ");
	                    String ed = sc.nextLine();

	                    ti.addAssingment(title, desc, ad, ed);
	                    break;
	                }

	                case 2: {
	                    System.out.print("Student Phone: ");
	                    long ph = sc.nextLong();
	                    ti.displayAssingment(ph);
	                    break;
	                }

	                case 3: {
	                    System.out.print("Student Phone: ");
	                    long ph = sc.nextLong();
	                    sc.nextLine();
	                    System.out.print("Assignment Title: ");
	                    String title = sc.nextLine();
	                    ti.removeAssingment(ph, title);
	                    break;
	                }
	                case 4:{
	                	System.out.print("Assignment Title: ");
	                    String title = sc.nextLine();
	                    ti.removeAssingmentOfAllClass(title);
	                    break;
	                }
	                case 5:
	                    ti.displayClassRoom();
	                    break;
	                    
	                case 8: {
	                    System.out.print("Enter phone to get student data: ");
	                    long ph = sc.nextLong();
	                    ti.displayStud(ph);
	                    break;
	                }
	                case 7: {
	                	System.out.println("1. Search by Phone Number");
	                	System.out.println("2. Search by name");
	                    System.out.print("Enter choise : ");
	                    int search = sc.nextInt();
	                    if (search ==1) {
	                    	System.out.print("Enter phone to Search student: ");
	 	                    long ph = sc.nextLong();
	 	                    ti.searchStud(ph);
						}else if(search ==2){
							System.out.print("Enter Name to Search student: ");
	 	                    String name = sc.nextLine();
	 	                    ti.searchStud(name);
						}else {
							System.out.println("Invalid choise!");
						}
	                    break;
	                }
	                case 9:{
	                	
	                	while (true) {
	                		System.out.println("1. Topper");
		                	System.out.println("2. Looser");
		                	System.out.println("3. Sort Student by Percentage");
		                	System.out.println("4. Sort Student by phone number");
		                	System.out.println("5. Sort Student by Name");
		                	System.out.println("6. Segrigate Girls and Boys");
		                	System.out.println("0. Exit");
		                	
		                	System.out.println("Enter choice: ");
		                	int more = sc.nextInt();
		                	
		                	switch (more) {
							case 1:

								ti.topper();
								break;
							case 2:
								
								ti.looser();
								break;
							case 3:
								ti.sortStudentByPercentage();
								break;

							case 4:
								ti.sortStudentByPhno();
								break;
							case 5:
								ti.sortStudentByName();
								break;
							case 6:
								ti.seperateGirlsAndBoys();
								break;
							case 0:
								
								return;
							default:
								 System.out.println("Invalid choice!");
							}
						}
	                	
	                }
	                
	                case 0:
	                    System.out.println("Teacher Logged Out.");
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }

	    // ======================= STUDENT MENU ========================
	    public static void studentMenu(Scanner sc,Object ref,long phno) {

	        while (true) {
	            System.out.println("\n===== STUDENT MENU =====");
	            System.out.println("1. View Profile");
	            System.out.println("2. View Assignments");
	            System.out.println("3. Topper Of Class");
	            System.out.println("0. Logout");

	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();
	            StudentInterface rf = (StudentInterface)ref;
	            
	            switch (ch) {
	                case 1:
	                    rf.displayStud(phno);
	                    break;

	                case 2:
	                    rf.displayAssingment(phno);
	                    break;

	                case 3:
	                	rf.topper();
	                	break;
	                case 0:
	                    System.out.println("Student Logged Out.");
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	            
	        }
	    }
}
