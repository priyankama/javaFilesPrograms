import java.io.*;
class FileMerger{
	public static void main(String args[]) throws Exception{
		Console con=System.console();
		int ch;
		System.out.println("Enter file to be merged");
		String s=con.readLine();
		File f=new File(s);
		FileOutputStream fis=new FileOutputStream(f);		
		boolean r=true;
		int j=0;
		while(r){
		++j;
		File f1=new File(j+"."+s);
		FileInputStream fis=new FileInputStream(f1);
		if(f1.exists())
			{
			while((ch=fis.read())!=-1)
			fos.write(ch);
		}
		else
			r=false;		
}
		
	}
}
