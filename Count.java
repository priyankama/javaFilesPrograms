import java.io.*;
class Count{
	public static void main(String args[]) throws IOException{ 
		FileInputStream fis=new FileInputStream("A.txt");
		FileOutputStream fos=new FileOutputStream("temp.txt");
		int ch;
		char c;
		while((ch=fis.read())!=-1){	
			fos.write()ch);
		}
		fis.close();
		fos.close();
	}
}