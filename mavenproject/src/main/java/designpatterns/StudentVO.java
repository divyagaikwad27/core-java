package designpatterns;

public class StudentVO {
	private int rollNo;
	private String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentVO(String name, int rollNo) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public StudentVO()
	{
		
	}
		
	}
	
	

