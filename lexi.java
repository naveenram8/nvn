import java.util.*;
import java.util.*;
class lexi
{
    public static void main(String args[])
    { 
        Scanner ss=new Scanner(System.in);
        ArrayList<String> sl=new ArrayList<String>();
		    System.out.println("ENTER THE  STRING: ");
        String s=ss.nextLine();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String st=s.substring(i,j+1);
                sl.add(st);
            }
        }
           Collections.sort(sl);
           System.out.println(sl.get(sl.size()-1));
    }
}


