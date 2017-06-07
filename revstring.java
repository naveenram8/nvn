import java.io.*;
import java.util.*;
public class revstring{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        StringBuffer sb=new StringBuffer(s1);
        System.out.println(sb.reverse().toString());
            }
}
