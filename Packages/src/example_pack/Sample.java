package example_pack;

import java.util.Scanner;
import addition.*;

/**
 * Simple Java program for Package
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Sample 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Add2No a1=new Add2No();
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A value:");
		a=sc.nextInt();
		b=sc.nextInt();		
		System.out.println("Addirion of a and b:"+a1.add(a,b));
	}

}
