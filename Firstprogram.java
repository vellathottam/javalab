import java.util.Scanner;

public class Firstprogram
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two values for addition");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=a+b;
		System.out.println("The sum of two values "+a+" and "+b+" is :"+c);
	}
}