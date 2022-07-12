import java.lang.Exception;
import java.util.Scanner;

class Authenticate extends Exception
{
	Authenticate(String message)
	{
		super(message);
	}
}

public class Login2
{
	public static void main(String args[])
	{
		
		Scanner in=new Scanner(System.in);
		try
		{
		String un,pswd;
		System.out.println("Enter the username");
		un=in.next();
		System.out.println("Enter the password");
		pswd=in.next();

		if(un.matches("deepak"))
		{
			if(pswd.matches("123"))
				System.out.println("Welcome "+un+" Login Success!!!");
		}
		else
		{
			throw new Authenticate("Invaild Credentials Please Check before Login!!!");
		}
		}
		catch(Authenticate e)
		{
			System.out.println(e.getMessage());
		}
		

	}
}