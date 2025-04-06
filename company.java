package Q6;

public class company {

	public static void main(String[] args) {
		Employee e=new ProductionDepartment();
		e.enroll(1, "Shreyas", 76500);
		e.enroll(2, "Dinesh", 90000);
		e.calulate_Pay(1);
		e.terminate(1);
		
		System.out.println();
		Employee ee=new ProductionDepartment();
		ee.enroll(2, "Tejas", 89000);
		ee.calulate_Pay(2);
		ee.terminate(2);
		

	}

}
