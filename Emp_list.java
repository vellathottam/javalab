import java.util.Scanner;

class Employee
{
	int eNo;
	String eName;
	float eSalary;
	
	Employee(int eid,String en,float es)
	{
		eNo=eid;
		eName=en;
		eSalary=es;
	}
	
}

public class Emp_list
{
	public static void main(String args[])
	{
		int choice,i=-1,flag=0;
		Employee[] emp=new Employee[10];
		Scanner in=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Insert new employee");
			System.out.println("2.Search for an employee");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			choice=in.nextInt();
			
			switch(choice)
			{
				case 1:System.out.println("Enter employee Number");
						int empid=in.nextInt();
						System.out.println("Enter employee Name");
						String empn=in.next();
						System.out.println("Enter employee Salary");
						float empf=in.nextFloat();
						emp[++i]=new Employee(empid,empn,empf);
						break;
				case 2:System.out.println("Enter employee Number to be searched");
						flag=0;
						empid=in.nextInt();
						for(int j=0;j<i+1;j++)
						{
						if(emp[j].eNo==empid)
						{
							System.out.println(emp[j].eNo);
							System.out.println(emp[j].eName);
							System.out.println(emp[j].eSalary);
							flag=1;
						}
						}
						if(flag==0)
						{
							System.out.println("Employee not found!!!");
						}
						break;
				case 3:System.exit(0);
				default:System.out.println("Invalid Choice");
			}
		}
	}
}