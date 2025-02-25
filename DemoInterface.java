package Interface;

public class DemoInterface {

	public static void main(String[] args) {
		OuterClass outclsobj=new OuterClass(1,2);
		outclsobj.printValues();
		OuterB outBobj=new OuterB(10, 20);
		outBobj.printValues();
		outBobj.innerM1();
//		OuterClass.InnerInterface innObj=new OuterClass(8,8);
		OuterClass.InnerInterface innObj1=new OuterB(8, 8);
		innObj1.innerM1();
//		innObj1.printValues();
	}

}
