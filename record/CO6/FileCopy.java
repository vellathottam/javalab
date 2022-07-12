import java.io.*;

class FileCopy
{
	public static void main(String args[])throws IOException,EOFException
	{
		
		FileOutputStream outs=null;
		FileInputStream ins=null;
		int b;
		outs = new FileOutputStream(args[1]);
		ins = new FileInputStream(args[0]);
								
		while((b=ins.read())!=-1)
			outs.write(b);
		System.out.println("Copy completed!!!");
		outs.close();
		ins.close();

	}
}