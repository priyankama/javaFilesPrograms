class Pwords{
	public static void main(String args[]){
		int q,a;
		a=(int)(Math.random()*10000);
		System.out.println("a= "+a);
		q=a/1000;
		switch(q)
		{
	case 1:
			System.out.print("one");
			break;
	case 2:
			System.out.print("two");
			break;
	case 3:
			System.out.print("three");
			break;
	case 4:
			System.out.print("four");
			break;
	case 0:
			System.out.print("zero");
			break;
	case 5:
			System.out.print("five");
			break;
	case 6:
			System.out.print("six");
			break;
	case 7:
			System.out.print("seven");
			break;
	case 8:
			System.out.print("eight");
			break;
	case 9:
			System.out.print("nine");
			
}
System.out.print(" thousand ");
a=a%1000;
q=a/100;
		switch(q)
		{
	case 1:
			System.out.print("one");
			break;
	case 2:
			System.out.print("two");
			break;
	case 3:
			System.out.print("three");
			break;
	case 4:
			System.out.print("four");
			break;
	case 0:
			System.out.print("zero");
			break;
	case 5:
			System.out.print("five");
			break;
	case 6:
			System.out.print("six");
			break;
	case 7:
			System.out.print("seven");
			break;
	case 8:
			System.out.print("eight");
			break;
	case 9:
			System.out.print("nine");
			
}
System.out.print(" hundred ");
a=a%100;
q=a/10;
		switch(q)
		{
	case 1:
			break;
	case 2:
			System.out.print("twenty ");
			break;
	case 3:
			System.out.print("thirty ");
			break;
	case 4:
			System.out.print("fourty ");
			break;
	case 5:
			System.out.print("fifty ");
			break;
	case 6:
			System.out.print("sixty ");
			break;
	case 7:
			System.out.print("seventy ");
			break;
	case 8:
			System.out.print("eighty ");
			break;
	case 9:
			System.out.print("ninety ");
			
}	
a=a%10;
if(q==1){
		switch(a)
		{
	case 1:
			System.out.print("eleven");
			break;
	case 2:
			System.out.print("twelve");
			break;
	case 3:
			System.out.print("thirteen");
			break;
	case 4:
			System.out.print("fourteen");
			break;
	case 0:
			System.out.print("ten");
			break;
	case 5:
			System.out.print("fifteen");
			break;
	case 6:
			System.out.print("sixteen");
			break;
	case 7:
			System.out.print("seventeen");
			break;
	case 8:
			System.out.print("eighteen");
			break;
	case 9:
			System.out.print("nineteen");
	}
}
else{
		switch(a)
		{
	case 1:
			System.out.print("one");
			break;
	case 2:
			System.out.print("two");
			break;
	case 3:
			System.out.print("three");
			break;
	case 4:
			System.out.print("four");
			break;
	case 0:
			System.out.print("zero");
			break;
	case 5:
			System.out.print("five");
			break;
	case 6:
			System.out.print("six");
			break;
	case 7:
			System.out.print("seven");
			break;
	case 8:
			System.out.print("eight");
			break;
	case 9:
			System.out.print("nine");
			
	}
}
}
}