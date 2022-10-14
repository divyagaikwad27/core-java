package designpatterns;

public class TransferObjectVO
{
	 public static void main(String[] args)
	 {
		 BuisinessPatternVO studentBusinessObject = new BuisinessPatternVO();
		 
	 for (StudentVO student : studentBusinessObject.getAllStudents())
	 {
		 System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	 }
		 
	 StudentVO student = studentBusinessObject.getAllStudents().get(0);		
	 student.setName("Divya");
		 studentBusinessObject.updateStudent(student);
		 
		 student = studentBusinessObject.getStudent(0);		
		 System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	  }
}


