package Package2;

import java.util.Scanner;

public class ScannerClassAsgn1 
{
  public int sum(int a, int b)
  {
	  int c;
	  c=a+b;
	  System.out.println("Sum is: "+c);
	  return c;
  }
  
  public int sub(int a1, int b1)
  {
	  int c1;
	  c1=a1-b1;
	  System.out.println("Sub is: "+c1);
	  return c1;
  }
  public int mul(int a2, int b2)
  {
	  int c2;
	  c2=a2*b2;
	  System.out.println("Mul is: "+c2);
	  return c2;
  }
  public void div(int a3, int b3)
  {
	  int c3;
	  c3=a3/b3;
	  System.out.println("Div is: "+c3);
	}
  
  public static void main(String[] args) 
  {
	ScannerClassAsgn1 obj = new ScannerClassAsgn1();
	System.out.println("Enter Values: ");
	Scanner obj1 = new Scanner(System.in);
	int x = obj1.nextInt();
	int y = obj1.nextInt();
	
	obj.sum(x, y);
	obj.sub(x, y);
	obj.mul(x, y);
	obj.div(x, y);
}
}
