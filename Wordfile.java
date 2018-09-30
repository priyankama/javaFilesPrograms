import java.io.*;
import java.util.*;
class Wordfile
{
 public static void main(String args[]) throws IOException
 {
  System.out.println("Enter File name: ");
  Console con=System.console();
   File f=new File(con.readLine());
  StreamTokenizer st=new StreamTokenizer(new FileInputStream(f));
  HashSet set=new HashSet();
  while(st.nextToken() != StreamTokenizer.TT_EOF)
  {
   switch(st.ttype)
   {
    case StreamTokenizer.TT_WORD:
      set.add(st.sval+"");
      break;
    case StreamTokenizer.TT_NUMBER:
      set.add(st.nval+"");
      break;
   }
  }
   HashMap map=new HashMap();
  Iterator itr=set.iterator();
  while(itr.hasNext())
  {
   String s=(String)itr.next();
   int counter=0;
   StreamTokenizer st1=new StreamTokenizer(new FileInputStream(f));
   while(st1.nextToken() != StreamTokenizer.TT_EOF)
   {
    if(s.equals(st1.sval) || s.equals(st1.nval+"")) 
	counter++;
    
   }
   map.put(s,counter);  
  }
  Set set1=map.keySet();
  itr=set1.iterator();
  while(itr.hasNext())
  { 
   String s1=(String)itr.next();
   System.out.println(s1+"\t"+map.get(s1));
  }
 }
}