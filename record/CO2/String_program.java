import java.util.Scanner;
import java.util.Arrays;

class String_Sort
{
	String[] sort(String a[],int n)
	{
		String[] arr=a;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
				String temp = arr[i];  
				arr[i] = arr[j];  
				arr[j] = temp;  
				
				}	
			}
		}
		return arr; 
	}
}


public class String_program
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String arr[]=new String[10];
		int i,n;
		String_Sort s = new String_Sort();		
		
		System.out.println("Enter number of string inputs");
		n=in.nextInt();
		System.out.println("Enter "+n+" strings");
		for(i=0;i<n;i++)
			arr[i]=in.next();
		
		System.out.println("Given String");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
		
		arr=s.sort(arr,n);
		
		System.out.println("After String Sort");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
		
	}
}
		
		
		
		
		