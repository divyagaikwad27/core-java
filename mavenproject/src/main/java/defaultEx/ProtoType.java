package defaultEx;

public class ProtoType
{
	 public static void main(String[] args)
	 {
		 AllShape.loadCache();
		 Shape clonedShape = (Shape) AllShape.getShape("1");
		 System.out.println("Shape : " + clonedShape.getType());
		 
		 Shape clonedShape2 = (Shape) AllShape.getShape("2");
		 System.out.println("Shape : " + clonedShape2.getType());
		 
		 Shape clonedShape3 = (Shape) AllShape.getShape("3");
		 System.out.println("Shape : " + clonedShape3.getType());
	 }
}
