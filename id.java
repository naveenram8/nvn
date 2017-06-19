import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class id {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedList<String> LL=new LinkedList<String>();
		//System.out.println("ENTER THE NAME 1");
		String s1=s.nextLine();
		//System.out.println("ENTER THE NAME 2");
	    String s2=s.nextLine();
	    //System.out.println("ENTER THE PIN");
	    String s3=s.nextLine();
	    //System.out.println("ENTER THE VALUE OF N");
	    String s4=s.nextLine();
	    String sname="";
	    String lname="";
	    if(s1.length()>s2.length())
	    {
	    	lname=s1;
	    	sname=s2;
	    }
	    if(s1.length()<s2.length())
	    {
	    	lname=s2;
	    	sname=s1;
	    }
	    if(s1.length()==s2.length())
	    {
	    	LL.add(s1);
	    	LL.add(s2);	    		
	    	Collections.sort(LL);
	    	lname=LL.get(1);
	    	sname=LL.get(0);
	    }
	    System.out.print("----------------USER-ID-----------------");
	    System.out.println();
	    System.out.print(lname.charAt(0));
	    System.out.print(sname);
	    int val=Integer.valueOf(s4);
	    System.out.print(s3.charAt(val-1));
	    StringBuffer sb=new StringBuffer(s3);
	    String s5=new String(sb.reverse());
	    System.out.print(s5.charAt(val-1));
	   
	}

}
