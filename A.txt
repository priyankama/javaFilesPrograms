import java.io.*;
class Pat{
		public static void main(String args[]){
		Console con=System.console();
		System.out.println("Enter any string ");
		String s=new String(con.readLine());
		int len=s.length();
		int l=len;
		char a[]=s.toCharArray();
		while(len>0){
			char c=a[0];
				
			for(int i=0;i<l-1;i++)
			{
				a[i]=a[i+1];
			}
			a[l-1]=c;
			for(int j=0;j<l;j++)	
			System.out.print(a[j]);	
			len--;
			System.out.println();
	}
	}
}
		