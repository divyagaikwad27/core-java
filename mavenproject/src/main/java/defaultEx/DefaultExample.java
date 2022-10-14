package defaultEx;
interface massage{

	default void say()
	{  
        System.out.println("Hello, this is default method");  
    }
	void say1(String s);

}
 public class DefaultExample implements massage
 {
	 public void say1(String s)
	 {
		 System.out.println(s);
	 }
	 public static void main(String[] args) 
	 {
		 DefaultExample dExample = new DefaultExample();
		 dExample.say();
		 dExample.say1("Hello, this is  method");
	 }
 }