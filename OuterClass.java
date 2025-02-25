package Interface;

public class OuterClass {
	int x,y;

	public OuterClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void printValues()
	{
		System.out.println("x is :"+x);
		System.out.println("Y is :"+y);
	}
	
	//Inner Interface
	public interface InnerInterface
	{
		public void innerM1();
	}
	
}
