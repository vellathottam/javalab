import java.io.*;

class FileBasicByte
{
	public static void main(String args[])throws IOException,EOFException
	{
		
		FileOutputStream outs=null;
		FileInputStream ins=null;
		int b;
		
		outs = new FileOutputStream("data1.txt");
		String wr="This is the implementation of write and read operation";
		byte[] arr = wr.getBytes();
		outs.write(arr);
		outs.close();
			
		ins = new FileInputStream("data1.txt");						
		while((b=ins.read())!=-1)
			System.out.print((char) b);
		ins.close();

	}
}