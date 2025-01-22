import java.util.*;

class a3
{
	public static void main(String args[])
	{
		int n,i,arr[];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n\t How many elements do you want? = ");
		n = sc.nextInt();

		arr = new int[n];

		System.out.println("\n\t Enter "+n+" elements = ");		
		for(i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("\n\t Array elements = ");		
		for(i=0;i<n;i++)
			System.out.println(arr[i]);		
	}
}
