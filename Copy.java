import java.io.*;
class Copy{
	public static void main(String args[]) throws IOException{ 
		FileInputStream fis=new FileInputStream("A.txt");
		FileInputStream fis2=new FileInputStream("B.txt");
		FileOutputStream fos=new FileOutputStream("C.txt");
		int ch;
		while((ch=fis.read())!=-1)
			fos.write(ch);
		while((ch=fis2.read())!=-1)
			fos.write(ch);
		fis.close();
		fis2.close();
		fos.close();
	}
}