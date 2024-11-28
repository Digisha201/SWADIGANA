package Package2;

import java.util.Scanner;

public class ScannerClassAsgn2 
{
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Mul Result is: "+c);
		return c;
	}
	public int sum(int a1, int b1)
	{
		int c1;
		c1=a1+b1;
		System.out.println("Sum Result is: "+c1);
		return c1;
	}
	public int sub(int a2, int b2)
	{
		int c2;
		c2=a2-b2;
		System.out.println("Sub Result is: "+c2);
		return c2;
	}
	public void div(int a3, int b3)
	{
		int c3;
		c3=a3/b3;
		System.out.println("Div Result is: "+c3);
		}
	
	public static void main(String[] args)
	{
		ScannerClassAsgn2 obj = new ScannerClassAsgn2();
		System.out.println("Please enter values: ");
		Scanner obj1 = new Scanner(System.in);
		int x = obj1.nextInt();
		int y = obj1.nextInt();
		
		obj.mul(x, y);
		obj.sum(x, y);
		obj.sub(x, y);
		obj.div(x, y);
	}
}
