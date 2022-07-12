public class Trycatch
{
	public static void main(String args[])
	{
		try
		{
			int a=5,b=0;
			int div=a/b;
			System.out.println(div);
		}
		catch(ArithmeticException e)
		{
			System.out.println("The error is : "+e);
			
		}
		finally
		{
			System.out.println("Finally statement just executed");
		}
		
	}
}