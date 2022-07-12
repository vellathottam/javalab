import java.util.Scanner;

class CPU
{
	double price=39999.89;
	
	public class Processor
	{
		int ncores=8;
		String pmanufact="Intel";
	}
	
	public static class RAM
	{
			int memeory=4;
			String rmanufact="Kingston";
	}

}

public class SystemInfo
{
	public static void main(String args[])
	{
		CPU c1=new CPU();
		CPU.Processor p1=new CPU().new Processor();
		CPU.RAM r1=new CPU.RAM();
		
		System.out.println(c1.price);
		System.out.println(p1.ncores);
		System.out.println(p1.pmanufact);
		System.out.println(r1.memeory);
		System.out.println(r1.rmanufact);
	}
}
		