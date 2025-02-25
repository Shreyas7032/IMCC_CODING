package Interface;

public class OuterB implements OuterClass.InnerInterface {

	public int n,m;
	
	public OuterB(int n,int m)
	{
		this.n=n;
		this.m=m;
	}
	
	
	public void printValues()
	{
		System.err.println("n is :"+n);
		System.out.println("m is :"+m);
	}
	
	//Overriding abstrat method from Interface
	@Override
	public void innerM1() {
		System.out.println("This message comes from implemented innerM1 O");
		
	}

	
}
