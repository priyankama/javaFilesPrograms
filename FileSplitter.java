import java.io.*;
class FileSplitter{
	public static void main(String args[]) throws Exception{
		Console con=System.console();
		int ch;
		System.out.println("Enter file to be split");
		File f=new File(con.readLine());
		FileInputStream fis=new FileInputStream(f);
		long len=f.length();
		
		System.out.println("Enter size");
		long s=Long.parseLong(con.readLine());
		long n=len/s;
		long s1=s;
		int i=0;
		boolean r=true;
			while(i<=n)
			{	++i;
				FileOutputStream fos=new FileOutputStream(i+"."+f);	
				for(int j=1;j<=s;j++)
				{	ch=fis.read();
					if(ch==-1)
						break;
					fos.write(ch);
					
				}
			
			}
	 }
}