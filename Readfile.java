import java.io.*;
import java.util.*;
class Readfile{
	public static void main(String args[]){
		Console con=System.console();
		System.out.println("Enter the path of directory : ");
		File f=new File(con.readLine());
		if(f.exists())
		{
			File arr[];
			arr=f.listFiles();
			for(int i=0;i<arr.length;i++)
				if(arr[i].isFile())
					System.out.println(i+"\t"+arr[i].getName());
		}
	}
}
class Read extends Thread{
	public void write(){
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
