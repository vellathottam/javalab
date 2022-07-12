public class Multicatch
{
	public static void main(String args[])
	{
		try
		{
			int a=5,b=0;
			int div=a/b;
			System.out.println(div);
			int arr[]=new int[10]; 
			System.out.println(arr[11]);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("The error is : "+e);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The error is : "+e);
		}
		
		finally
		{
			System.out.println("Finally statement just executed");
		}
		
	}
}