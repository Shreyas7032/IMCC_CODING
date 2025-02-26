package sec_Max;

import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		int a[]= {10,9,12,56,22};
		int n=a.length;
		Arrays.sort(a);
		if(n>1)
		{
			System.err.println("Second Max No In an Array is:"+a[n-2]);
		}
		else
		{
			System.err.println(-1);
		}
	}

}
