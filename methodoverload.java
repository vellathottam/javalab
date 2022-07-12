import java.util.Scanner;
class methodoverload
{
	int add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		return 0;
	}
	int add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println(sum);
		return 0;
	}
	public static void main(String[] args)
	{
		methodoverload obj = new methodoverload();
		int a = obj.add(10,15,20);
		int b = obj.add(12,2);
	}
}