import java.util.Scanner;

public class Secondprogram
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=in.nextInt();
		if(n%2==0)
			System.out.println(n+" is Even");
		else
			System.out.println(n+" is Odd");
	}
}