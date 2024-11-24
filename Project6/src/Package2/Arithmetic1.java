package Package2;

public class Arithmetic1 {
	
	  public int sum(int a, int b)
	  {
		  int c;
		  c=a+b;
		  System.out.println("Sum is: "+c);
		  return c;
	  }
	  
	  public int sub(int x1, int x2)
	  {
		  int x3;
		  x3=x1-x2;
		  System.out.println("Sub is: "+x3);
		  return x3;
	  }
	  
	  public void mul(int a1, int a2)
	  {
		  int a3;
		  a3=a1*a2;
		  System.out.println("Mul is: "+a3);
	  }
	  
	  public static void main(String[] args)
	  {
		  Arithmetic1 obj = new Arithmetic1();
		  int SumResult = obj.sum(10, 2);
		  int SubResult = obj.sub(10, 2);
		  obj.mul(SumResult, SubResult);
		  }
	}



