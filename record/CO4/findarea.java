import java.util.Scanner;
import pack.arp;
public class findarea
{
	public static void main(String[] args)
	{
		
		float area, perimeter;
		Scanner in =new Scanner(System.in);
		arp h=new arp();
		System.out.println("Enter the length of the rectangle");
		float a=in.nextFloat();
		System.out.println("enter the breadth of the rectangle");
		float b=in.nextFloat();
		arp.rectangle r=h.new rectangle();
		area=r.area(a,b);
		perimeter=r.perimeter(a,b);
		
		System.out.println("rectangle : area = "+area+" perimeter = "+perimeter);
		
		System.out.println("Enter the radius of the circle");
		float c=in.nextFloat();
		float pie=3.14f;
		arp.circle cir=h.new circle();
		area=cir.area(c,pie);
		perimeter=cir.perimeter(c,pie);
		
		System.out.println("circle : area = "+area+" perimeter = "+perimeter);
		
		
	}
}