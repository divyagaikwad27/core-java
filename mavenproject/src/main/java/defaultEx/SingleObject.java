package defaultEx;

public class SingleObject 
{	
	 private static SingleObject instance = new SingleObject();
	
	 private SingleObject(){}
	 
	 public static SingleObject getInstance()
	 {
		 return instance;
	 }
	 public void showMessage()
	 {
		 System.out.println("Hey Divya ....How are you?");
	 }
}
