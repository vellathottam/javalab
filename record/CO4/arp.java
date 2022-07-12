package pack;
public class arp
{
interface arpe
{
	float area (float x, float y);
	float perimeter (float a,float b);
	
}
public class rectangle implements arpe
{
	public float area(float x,float y)
	{
		float sum=x*y;
		return sum;
	}
	public float perimeter (float a,float b)
	{
		float sum=a+a+b+b;
		return sum;
	}	
}
public class circle implements arpe
{
	public float area(float x,float y)
	{
		float sum = x*x*y;
		return sum;
	}
	public float perimeter(float a,float b)
	{
		float sum=2*b*a;
		return sum;
	}
}
}