import java.util.Scanner;

public class String_Manipulation
{
	public static void main(String args[])
	{
	
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String txt1=in.nextLine();
		System.out.println("The string to lower case");
		System.out.println(txt1.toLowerCase());
		System.out.println("The string to upper case");
		System.out.println(txt1.toUpperCase());
		System.out.println("The length of given string");
		System.out.println(txt1.length());
		System.out.println("The trimmed string");
		System.out.println(txt1.trim());
		
		System.out.println("The char to be replaced");
		// in.skip("[\r\n]+");
		String a=in.nextLine();
		System.out.println("The char replaced with");
		// in.skip("[\r\n]+");
		String b=in.nextLine();
		System.out.println("The replaced string");
		String txt2=txt1.replace(a,b);
		System.out.println(txt2);
		
		Integer num=123;
		System.out.println(num.toString());
		
	}
}