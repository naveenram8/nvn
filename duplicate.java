import java.io.*;
import java.util.*;
public class duplicate{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
String s1=s.nextLine();
Set<Character> set=new HashSet<Character>();
for(char c:s1.toCharArray())
{
    set.add(Character.valueOf(c));
}
System.out.println("Unique elements in given string:"+" "+set);
}
}
