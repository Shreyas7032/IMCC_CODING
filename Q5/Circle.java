package Q5;

public class Circle implements Shape_Interface {
	
	double rad;
	double area;
	

	public Circle(double rad) {
		super();
		this.rad = rad;
	}

	@Override
	public void compute_area() {
		area=pi*rad*rad;
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle is:"+area);
	}
	
	

}
