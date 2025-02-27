package Interface;

public class ShapeDemo {

	public static void main(String[] args) {
		Rectangle recObj=new Rectangle();
		recObj.drawshape(4); //this will invoked from the Rectanle class
		recObj.printShapeDetails();   //this will be invoked from the interface
		shape.aboutShape();  //Invoking static method from interface
	
		
		shape shObj=new Rectangle();//is this allowed
		shObj.drawshape(0);
		shObj.printShapeDetails();

	}

}
