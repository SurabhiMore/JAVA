public class ZProgram10 {
    public static void main(String[] args) {
	  
		Student objStudent=new Student("Surabhi More",57);
		Subject objSubject=new Subject("JAVA",90,objStudent);
		
		// Subject Details
		System.out.println("Subject name : "+objSubject.subjectName);
		System.out.println("Subject marks : "+objSubject.marks);
		
		// Student Details
		System.out.println(objSubject.subjectName+" subject is studied by "+objSubject.student.studentName);
		System.out.println("Roll number "+objSubject.student.rollNo+" scored "+objSubject.marks+" in "+objSubject.subjectName);
	}

}


class Student{
	String studentName;
	int rollNo;
	
	public Student(String name,int rollNo) {
		this.studentName=name;
		this.rollNo=rollNo;
	}
}

class Subject{
	String subjectName;
	int marks;
	Student student;
	
	public Subject(String subjectName,int marks,Student student) {
		this.subjectName=subjectName;
		this.marks=marks;
		this.student=student;
	}
}


