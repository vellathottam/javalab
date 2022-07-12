import java.util.Scanner;

class Array_Oper
{
	int sum_array(int a[],int n)
	{
		int j,sum=0;
		for(j=0;j<n;j++)
			sum+=a[j];
		
		return sum;
	}
	float avg_array(int a[],int n)
	{
		int j,sum;
		float avg;
		sum=sum_array(a,n);
		
		avg=sum/n;
		return avg;
	}
	void sort(int a[],int n)
	{
		int temp;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n-1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
}

public class Array_Operations
{
	public static void main(String args[])
	{
		int a[]=new int[20];
		int n,i,choice=0;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the range");
		n=in.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.print("\n"+"Enter "+(i+1)+" element : ");
			in.skip("[\r\n]+");
			a[i]=in.nextInt();
		}
		
		Array_Oper a1=new Array_Oper();
		while(choice!=4)
		{
			
			System.out.println("1. Sum");
			System.out.println("2. Average ");
			System.out.println("3. Sort ");
			in.skip("[\r\n]+");
			choice=in.nextInt();
			
			switch(choice)
			{
				case 1:System.out.println("Sum of elements of array : "+a1.sum_array(a,n));
						break;
				case 2:System.out.println("Average of elements of array : "+a1.avg_array(a,n));
						break;
				case 3:a1.sort(a,n);
						for(int k=0;k<n;k++)
						System.out.println(a[k]);
						break;
			}
		}
	
}
}