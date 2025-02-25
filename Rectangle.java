package Interface;

public class Rectangle implements shape{

	public Rectangle()
	{
		System.out.println("Creating Rectangle class Object..");
	}
	/*
	 * Overriding the drawShape()
	 *
	 */
	
	@Override
	public void drawshape(int no_of_sides) {
		System.out.println("This os draw shape implementation from Rectangle class."+ "This Shape has: "+no_of_sides+ "sides");
		
	}
	
	/**
	 * overriding the default method..
	 */
	
	public void printShapeDetails()
	{
		System.out.println("This message is from Rectangle class..");
	}
	
}
