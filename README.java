import java.io.*;
import java.util.*;
class Arthematic
{
 public static void main(String args[])
 {
	Scanner input=new Scanner(System.in);
	String c=input.nextLine();
	int a=input.nextInt();
	int b=input.nextInt();
	
	
	int d;
	if(c.equals("/"))
	{
		d=a/b;
		System.out.println(d);
	}
	else if(c.equals("%"))
	{
		d=a%b;
		System.out.println(d);
	}
	else{
	}
	
  }
}
