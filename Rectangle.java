package Interface;

public class Rectangle extends Figure implements shape{

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
	
	
	/*
	 * This is overridden implementation of the abstract method,area(),Volume()from figure class..
	 */
	@Override
	public double area() {
		System.out.println("Area of Rectangle is calculated here..");
		return 0.0;
	}
	@Override
	public double volume() {
		System.out.println("Calculate the volume of Rectangle here..");
		return 0;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Rectangle..");
	}
	
}
