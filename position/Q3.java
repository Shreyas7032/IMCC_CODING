package position;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String:");
		String s=sc.nextLine().toUpperCase();
		//System.out.println(s);
		
		
		StringBuilder result=new StringBuilder();
		for(char ch:s.toCharArray())
		{
			if(Character.isLetter(ch)) //If Returns True then Execute Checks the letter is present or not..
			{
				int pos=ch - 'A'+1;  //Ascii value of A is 65
				result.append(ch).append(pos);	
			}
		}
		System.out.println(result.toString());
	}

}
