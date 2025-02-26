package Arrays;

public class Q1 {

	public static void main(String[] args) {
		int a[]= {11,20,35,40,53,60};
		int evenCount=0;
		int oddCount=0;
		
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			if(a[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		
		System.out.println("No Of Even No's in an Array is:"+evenCount);
		System.out.println("No Of Odd No's in an array is:"+oddCount);
		
		int even[]=new int[evenCount];
		int odd[]=new int[oddCount];
		
		int evenSum=0;
		int oddSum=0;
		
		int ecount=0;
		int ocount=0;
		
		for(int i=0;i<len;i++)
		{
			if(a[i]%2==0)
			{
				even[ecount]=a[i];
				evenSum=evenSum+a[i];
				ecount++;
				
			}
			else
			{
				odd[ocount]=a[i];
				oddSum=oddSum+a[i];
				ocount++;
			}
		}

		System.out.print("The Even No Are In Array is:");
		for(int i:even)
		{
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.print("The Odd No in an array is:");
		for(int i:odd )
		{
			System.out.print(" "+i);
		}
		System.out.println();
		System.err.println("Sum Of Even No is:"+evenSum);
		System.err.println("Sum of odd No is:"+oddSum);

	}

}
