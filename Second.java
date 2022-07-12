import java.io.*;

class ArraySum
{
	int sum_array(int a[],int n)
	{
		int total=0;
		for(int k=0;k<n;k++)
			total+=a[k];
		return total;
	}
}

public class Second
{
	public static void main(String args[])throws IOException
	{
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int a[]=new int[10];
		
		System.out.println("Enter the no of values to be inserted");
		int n=Integer.parseInt(in.readLine());
		
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(in.readLine());
		
		for(int j=0;j<n;j++)
			System.out.println(a[j]);
		
		ArraySum as=new ArraySum();
		int res=as.sum_array(a,n);
		System.out.println(res);
		
	}
}
		