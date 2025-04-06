package Q5;

public class rectangle implements Shape_Interface {
	
	int len,breadth;
	double area;
	
	

	public rectangle(int len, int breadth) {
		super();
		this.len = len;
		this.breadth = breadth;
	}

	@Override
	public void compute_area() {
		area=len*breadth;
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Area Of Reactangle is:"+area);
		
	}

}
