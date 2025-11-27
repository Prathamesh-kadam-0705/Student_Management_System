package student_Management_System;

public class ClassRoom implements AdminInterface,TeacherInterface,StudentInterface{

	private int studentCp=10;
	private int teacherCp=5;
	String clName ="10th classroom";
	private Student ar[] ;
	private Teacher th[] ;
	private int studentCt=0;
	private int teacherCt =0;
	
	private String passWords[] =new String[5];
	
	ClassRoom(){
		ar= new Student[studentCp];
		th = new Teacher[teacherCp];
	}
	
	ClassRoom(int studentCp,int teacherCp) {
		
		ar= new Student[studentCp];
		th = new Teacher[teacherCp];
		this.studentCp=studentCp;
		this.teacherCp=teacherCp;
	}
	
	public void addStud(String name,String gender,long phno,double fees) {
		
		if (studentCt<studentCp&&validateMobile(phno)&&(name!=null&&gender!=null)) {
			ar[studentCt]= new Student(name,gender,phno,fees);
			studentCt++;
			System.out.println("Student added succesfully!");
		}
		else {
			System.out.println("Classroom is full");
		}
	}
	
	public void addStud(String name,String gender,long phno,double fees,String sname,String level,String performance,String summery) {
		
		if (studentCt<studentCp && validateMobile(phno)&&(name!=null&&gender!=null)&&(sname!=null&&level!=null)) {
			ar[studentCt]= new Student(name,gender,phno,fees,sname,level,performance,summery);
			studentCt++;
			System.out.println("Student added succesfully!");
		}
		else {
			System.out.println("Classroom is full");
		}
	}
	
	public void addStud(Student st) {
		
		if (studentCt<studentCp) {
			ar[studentCt]=st;
			studentCt++;
			System.out.println("Student added succesfully!");
		}
		else {
			System.out.println("Classroom is full");
		}
	}
	
	public void addTeacher(String name,String subject,long phno,String password) {
		
		if (teacherCt<th.length) {
			
			if (validateMobile(phno)&&validatePassword(password)) {
				
				th[teacherCt] =new Teacher(name, subject, phno, password);
				passWords[teacherCt]=password;
				teacherCt++;
				
			}
		}
		else {
			System.out.println("Teacher is full!");
		}
	}
	
	public int searchTeacher(long phno) {
		
		for (int i = 0; i < teacherCt; i++) {
			
			if (th[i].phno == phno) {
				
				System.out.println("Teacher is found");
				return i;
			}
		}
		System.out.println("Student is not found");
		return -1;
	}
	
	public void searchStud(String name) {
		
		for (int i = 0; i < studentCt; i++) {
			
			if (searchStud(ar[i].name,name)) {
				
				ar[i].displayS();
			}
		}
	}
	
	public int searchStud(long phno) {
		
		for (int i = 0; i < studentCt; i++) {
			
			if (ar[i].phno == phno) {
				
				System.out.println("Student is found");
				return i;
			}
		}
		System.out.println("Student is not found");
		return -1;
	}
	
	public void displayStud(long phno) {
		
		int index = searchStud(phno);
		
		if (index != -1) {
			
			ar[index].displayStud();
		}
		else {
			System.out.println("Student not found");
		}
		
	}
	
	public void displayLessAtendaceStud() {
		
		for (int i = 0; i < studentCt;i++) {
			
			if (ar[i].atendance<90) {
				System.out.println("Name : "+ar[i].name+" Attendence : "+ar[i].atendance);
			}
		}
	}
	
	public void displayClassRoom() {
		
		System.out.println("ClassRoom name : "+clName);
		System.out.println("Student in class : "+studentCt);
		System.out.println();
		for (int i = 0; i < studentCt; i++) {
			
			ar[i].displayS();
			
		}
	}
	
	public void removeStud(long phno) {
		
		int index = searchStud(phno);
		
		if (index>=0) {
			for (int i = index; i < studentCt-1; i++) {
				
				swap(i,i+1);
				
			}
			ar[studentCt-1]=null;
			studentCt--;
		}
		else {
			System.out.println("No student in classroom");
		}
	}
	
	public void removeTeacher(long phno) {
		
		int index = searchTeacher(phno);
		
		if (index>=0) {
			for (int i = index; i < teacherCt-1; i++) {
				
				swap(i,i+1);
				
			}
			th[teacherCt-1]=null;
			teacherCt--;
		}
		else {
			System.out.println("No Teacher in classroom");
		}
	}
	
	public void sortStudentByPercentage() {
		
		Student [] temp = CreateArray();
		
		for (int i = 0; i < studentCt; i++) {
			
			for (int j = 0; j < studentCt-1-i; j++) {
				
				if (temp[j].percentage<temp[j+1].percentage) {
					
					swap(j,j+1);
				}
			}
		}
		for (int i = 0; i < temp.length; i++) {
			
			System.out.println("Name : "+temp[i].name+"  Percentage : "+temp[i].percentage);
			
		}
	}
	
	public void sortStudentByPhno() {
		
		Student [] temp = CreateArray();
		
		for (int i = 0; i < studentCt; i++) {
			
			for (int j = 0; j < studentCt-1-i; j++) {
				
				if (temp[j].phno>temp[j+1].phno) {
					
					swapTemp(j,j+1,temp);
				}
			}
		}
		for (int i = 0; i < temp.length; i++) {
			
			System.out.println("Name : "+temp[i].name+"  Phone Number : "+temp[i].phno);
			
		}
	}
	
	public void sortStudentByName() {
		
		Student [] temp = CreateArray();
		
		for (int i = 0; i < studentCt-1; i++) {
			
			for (int j = 0; j < studentCt-1-i; j++) {
				
				if (firstName(temp[j].name).compareToIgnoreCase(firstName(temp[j+1].name))<0) {
					
					Student temp1 = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp1;
				}
			}
		}
		for (int i = 0; i < temp.length; i++) {
			temp[i].displayS();
		}
	}
	
	public void seperateGirlsAndBoys() {
		
		for (int i = 0,j=studentCt-1; i < j; i++,j--) {
			
			while ( i<studentCt-1&&ar[i].gender.equals("female") ) {
				i++;
			}
			while (j>=0&&ar[j].gender.equals("male")) {
				j--;
			}
			if (i<studentCt-1&&j>=0) {
				swap(i,j);
			}
		}
		System.out.println("Segrigation complete!");
	}
	
	public void topper() {
		
		double max = 0;
		int index=0;
		int i;
		for (i = 0; i <studentCt; i++) {
			
			if(max<ar[i].percentage) {
				max = ar[i].percentage;	
				index = i;
			}
		}
		System.out.println("----------Topper----------");
		ar[index].displayS();
	}
	
	public void looser() {
		
		double min = 100;
		int index =0;
		
		for (int i = 0; i < studentCt; i++) {
			
			if (min > ar[i].percentage) {
				min = ar[i].percentage;
				index = i;
			}
		}
		System.out.println("---------------looser---------------");
		ar[index].displayS();
	}
	
	public void paidFullFeeStud() {
		
		System.out.println("Total "+searchFee(50000)+" student paid full fee");
	}
	
	public void notPaidFeeStud() {
		System.out.println("Total "+searchFee(0)+" student not paid fee");
	}
	
	public void addAssingment(String title,String discription,String assingDate,String endDate) {
		
		for (int i = 0; i < studentCt; i++) {
			ar[i].addAssignment(title,discription, assingDate, endDate);
		}
		System.out.println("assingment added sucessfully!");
	}
	
	public void removeAssingment(long phno,String sub) {
		
		int i = searchStud(phno);
		ar[i].removeAssigment(sub);
	}
	
	public void removeAssingmentOfAllClass(String sub) {
		
		for (int i = 0; i < studentCt; i++) {
			ar[i].removeAssigment(sub);
		}
	}
	
	public void displayAssingment(long phno) {
		
		int index = searchStud(phno);
		
		if (index != -1) {
			
			ar[index].displayAssingment();
		}
		else {
			System.out.println("Student not found!");
		}
		
	}
	
	public ClassRoom loginTeacher(long phno, String password) {
		
	    for (int i = 0; i < teacherCt; i++) {
	        if (th[i].phno == phno) {                
	            if (passWords[i].equals(password)) { 
	                return this;                    
	            } else {
	                System.out.println("Wrong Password!");
	                return null;
	            }
	        }
	    }

	    System.out.println("Teacher not found!");
	    return null;
	}

	public ClassRoom loginStudent(long phno, String firstName) {

	    for (int i = 0; i < studentCt; i++) {

	        if (ar[i].phno == phno) {  

	            String actualFirstName = firstName(ar[i].name);

	            if (actualFirstName.equalsIgnoreCase(firstName)) {
	                return this;  
	            } else {
	                System.out.println("Wrong First Name!");
	                return null;
	            }
	        }
	    }

	    System.out.println("Student not found!");
	    return null;
	}

	//Helpers Methods
	
	private boolean validateMobile(long phno) {
		
		if (phno >= 6000000000l && phno <= 9999999999l) {
			
			return true;
		}
		System.out.println("Invalid Number!");
		return false;
	
	}
	
	private boolean validatePassword(String pass) {
		
		boolean [] check = new boolean[4];
		
		if (pass.length()>=8) {
			
			for (int i = 0; i < pass.length(); i++) {
				
				char ch = pass.charAt(i);
				
				if (ch>='A'&&ch<='Z') {
					check[0]=true;
				}
				else if(ch>='a'&&ch<='z') {
					
					check[1]=true;
				}
				else if(ch>='0'&&ch<='9') {
					check[2]=true;
				}else {
					check[3]=true;
				}

			}
			for (int i = 0; i < check.length; i++) {
				
				if (!check[i]) {
					System.out.println("Invalid PassWord!");
					return false;
				}
			}
			return true;
			
		}
		return false;
	}
	
	private boolean searchStud(String name,String search) {
		
		int j=0;
		for (int i = 0; i < name.length(); i++) {
			
			if (j < search.length() &&search.charAt(j)==name.charAt(i)) {
				j++;
			}
			else if (j==search.length()) {
				break;
			}
			else if(j>0&&j<search.length()) {
				i--;
				j =0;
			}
		}
		if (j==search.length()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	private void swap(int i,int j) {
		
		Student temp = ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	}
	
	private void swapTemp(int i,int j,Student[] temp) {
		
		Student tempV= temp[i];
		temp[i]=temp[j];
		temp[j]=tempV;
	}
	
	private Student[] CreateArray() {
		Student [] temp = new Student[studentCt];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]=ar[i];
		}
		return temp;
	}
	
	private String firstName(String name) {
		
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			
			char ch = name.charAt(i);
			
			if (ch != ' ') {
				ans.append(ch);
			}
			else {
				break;
			}
		}
		return new String(ans);
	}
	
	private int searchFee(int fee) {
		int count=0;
		for (int i = 0; i < studentCt; i++) {
			
			if (ar[i].fees==fee) {
				
				//ar[i].displayStud();
				count++;
			}
		}
		return count;
		
	}
}
