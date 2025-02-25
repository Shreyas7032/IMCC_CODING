package Interface;

public interface shape {

	/*
	 * 
	 * abstract Method
	 */
	public abstract void drawshape(int no_of_sides);
	
	/*
	 * default Methods
	 */
	public default void printShapeDetails()
	{
		System.out.println("This is From shape Interface");
	}
	
	/*
	 * static methods
	 */
	public static void aboutShape()
	{
		System.out.println("This feature comes from shape interface");
	}
}
